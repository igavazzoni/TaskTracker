package br.unipar.programacaointernet.servicecep.tasktracker.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Teferas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Timestamp dataInicio;
    private Timestamp dataLimite;
    private Boolean concluida;

    @ManyToMany
    private Usuario usuario;


}
