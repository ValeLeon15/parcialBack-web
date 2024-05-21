package web.parcial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.parcial.dto.CelularDTO;
import web.parcial.service.CelularService;

@RestController
@RequestMapping(value="/parcial/celular")
@CrossOrigin(origins = "http://localhost:4200")

public class CelularController {
    CelularService celularService;

    @Autowired
    CelularController(CelularService celularService) {
        this.celularService = celularService;
    }
    
    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO get(@PathVariable Long id) {
        return celularService.get(id);
    }
    
    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CelularDTO> getAll() {
        return celularService.getAll();
    }
    
    @CrossOrigin
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO save(@RequestBody CelularDTO entidadDTO) {
        return celularService.save(entidadDTO);
    }
    
    @CrossOrigin
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO update(@RequestBody CelularDTO entidadDTO) {
        return celularService.update(entidadDTO);
    }
    
    @CrossOrigin
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id) {
        celularService.delete(id);
    }
    

}
