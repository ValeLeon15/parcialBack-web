package web.parcial.init;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import web.parcial.entity.Celular;
import web.parcial.entity.Gama;
import web.parcial.entity.SistemaOperativo;
import web.parcial.repository.CelularRepository;

@Component
public class DBInitializer implements CommandLineRunner{

    @Autowired
    private CelularRepository celularRepository;
    
    @Override
    public void run(String... args) throws Exception {
       Celular iphone = new Celular();
        iphone.setMarca("iPhone");
        iphone.setSerial(123456);
        iphone.setFechaCompra(new Date("2021/01/01"));
        iphone.setPrecio(1000000);
        iphone.setSistemaOperativo(SistemaOperativo.IOS);
        iphone.setAnioLanzamiento(2021);
        iphone.setGama(Gama.ALTA);

        Celular samsung = new Celular();
        samsung.setMarca("Samsung");
        samsung.setSerial(654321);
        samsung.setFechaCompra(new Date("2021/01/01"));
        samsung.setPrecio(1200000);
        samsung.setSistemaOperativo(SistemaOperativo.ANDROID);
        samsung.setAnioLanzamiento(2020);
        samsung.setGama(Gama.ALTA);

        Celular alcatel = new Celular();
        alcatel.setMarca("Alcatel");
        alcatel.setSerial(111213);
        alcatel.setFechaCompra(new Date("2021/01/01"));
        alcatel.setPrecio(800000);
        alcatel.setSistemaOperativo(SistemaOperativo.ANDROID);
        alcatel.setAnioLanzamiento(2019);
        alcatel.setGama(Gama.BAJA);

        celularRepository.save(iphone);
        celularRepository.save(samsung);
        celularRepository.save(alcatel);
    }
}    
