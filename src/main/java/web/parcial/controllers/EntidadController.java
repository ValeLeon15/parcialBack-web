package web.parcial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.parcial.dto.EntidadDTO;
import web.parcial.service.EntidadService;

@RestController
@RequestMapping(value="/progrupo14/arrendadores")
@CrossOrigin(origins = "http://localhost")
public class EntidadController {
    EntidadService entidadService;

    @Autowired
    EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }
    
    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO get(@PathVariable Long id) {
        return entidadService.get(id);
    }
    
    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EntidadDTO> getAll() {
        return entidadService.getAll();
    }
    
    @CrossOrigin
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO save(@RequestBody EntidadDTO entidadDTO) {
        return entidadService.save(entidadDTO);
    }
    
    @CrossOrigin
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO update(@RequestBody EntidadDTO entidadDTO) {
        return entidadService.update(entidadDTO);
    }
    
    @CrossOrigin
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id) {
        entidadService.delete(id);
    }
    

}
