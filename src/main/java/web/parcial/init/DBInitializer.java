package web.parcial.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import web.parcial.entity.Entidad;
import web.parcial.repository.EntidadRepository;

@Component
public class DBInitializer implements CommandLineRunner{

    @Autowired
    private EntidadRepository entidadRepository;
    
    @Override
    public void run(String... args) throws Exception {
        Entidad entidad = new Entidad();
        entidad.setNombre("Entidad 1");
        entidad.setNombre("Valentina");
        entidad.setNombre("Juan");
        entidadRepository.save(entidad);
        
    }
}    
