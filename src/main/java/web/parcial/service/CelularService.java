package web.parcial.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.parcial.dto.CelularDTO;
import web.parcial.entity.Celular;
import web.parcial.repository.CelularRepository;

@Service
public class CelularService {
    CelularRepository celularRepository;
    ModelMapper modelMapper;

    @Autowired
    CelularService(CelularRepository celularRepository, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.celularRepository = celularRepository;
    }

    public CelularDTO get(Long id) {
        Optional<Celular> celularOpt = celularRepository.findById(id);
        CelularDTO celularDTO = null;
        if (celularOpt.isPresent()) {
            Celular celular = celularOpt.get();
            celularDTO = modelMapper.map(celular, CelularDTO.class);
        }
        return celularDTO;
    }

    public List<CelularDTO> getAll() {
        List<Celular> celulares = (List<Celular>) celularRepository.findAll();
        List<CelularDTO> celularDTOs = celulares.stream()
                .map(entidad -> modelMapper.map(entidad, CelularDTO.class))
                .collect(Collectors.toList());
        return celularDTOs;
    }

    public CelularDTO save(CelularDTO celularDTO) {
        Celular celular = modelMapper.map(celularDTO, Celular.class);
        celular = celularRepository.save(celular);
        return modelMapper.map(celular, CelularDTO.class);
    }

    public CelularDTO update(CelularDTO celularDTO) {
        Celular celular = modelMapper.map(celularDTO, Celular.class);
        celular = celularRepository.save(celular);
        return modelMapper.map(celular, CelularDTO.class);
    }

    public void delete(Long id) {
        celularRepository.deleteById(id);
    }


}
