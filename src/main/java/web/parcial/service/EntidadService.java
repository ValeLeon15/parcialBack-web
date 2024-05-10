package web.parcial.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.parcial.dto.EntidadDTO;
import web.parcial.entity.Entidad;
import web.parcial.repository.EntidadRepository;

@Service
public class EntidadService {
    EntidadRepository entidadRepository;
    ModelMapper modelMapper;

    @Autowired
    EntidadService(EntidadRepository entidadRepository, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.entidadRepository = entidadRepository;
    }

    public EntidadDTO get(Long id) {
        Optional<Entidad> entidadOpt = entidadRepository.findById(id);
        EntidadDTO entidadDTO = null;
        if (entidadOpt.isPresent()) {
            Entidad entidad = entidadOpt.get();
            entidadDTO = modelMapper.map(entidad, EntidadDTO.class);
        }
        return entidadDTO;
    }

    public List<EntidadDTO> getAll() {
        List<Entidad> entidades = (List<Entidad>) entidadRepository.findAll();
        List<EntidadDTO> entidadDTOs = entidades.stream()
                .map(entidad -> modelMapper.map(entidad, EntidadDTO.class))
                .collect(Collectors.toList());
        return entidadDTOs;
    }

    public EntidadDTO save(EntidadDTO entidadDTO) {
        Entidad entidad = modelMapper.map(entidadDTO, Entidad.class);
        entidad = entidadRepository.save(entidad);
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public EntidadDTO update(EntidadDTO entidadDTO) {
        Entidad entidad = modelMapper.map(entidadDTO, Entidad.class);
        entidad = entidadRepository.save(entidad);
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public void delete(Long id) {
        entidadRepository.deleteById(id);
    }


}
