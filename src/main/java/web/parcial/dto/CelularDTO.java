package web.parcial.dto;

import java.util.Date;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import web.parcial.entity.Gama;
import web.parcial.entity.SistemaOperativo;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CelularDTO {
    private Long id;
    private String marca;
    private int serial;
    private Date fechaCompra;
    private int anioLanzamiento;
    private int precio;
    @Enumerated(EnumType.STRING)
    private SistemaOperativo sistemaOperativo;
    @Enumerated(EnumType.STRING)
    private Gama gama;
}
