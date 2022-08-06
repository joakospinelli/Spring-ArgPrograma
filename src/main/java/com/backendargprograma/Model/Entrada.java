package com.backendargprograma.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
    
    @Column(nullable = false)
    protected String nombre; // Nombre asociado a la entrada
    
    @Column(columnDefinition="TEXT")
    protected String descripcion; // Detalles sobre la entrada (temas, promedios, explicación, links, etc.)

}
