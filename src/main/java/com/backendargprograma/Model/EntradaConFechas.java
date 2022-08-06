package com.backendargprograma.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class EntradaConFechas extends Entrada {

    @Column(nullable = false)
    protected boolean terminado; // Si la entrada está en curso o si ya terminó

    @Column(nullable = false)
    protected LocalDate fechaInicio;

    protected LocalDate fechaFin; // Es null si terminado = false

    @Column(nullable = false)
    protected String institucion; // Nombre de la institución donde se hizo el trabajo, curso o título

    protected String tipo; // Primario, secundario, universitario, curso, etc

    public boolean getTerminado(){
        return this.terminado;
    }
    
}
