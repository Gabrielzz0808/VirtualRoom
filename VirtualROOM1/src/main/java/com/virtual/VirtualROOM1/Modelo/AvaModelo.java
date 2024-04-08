package com.virtual.VirtualROOM1.Modelo;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ava")
public class AvaModelo extends RepresentationModel<AvaModelo> implements Serializable {

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAva;
    private String nomeSala;
    private String descricao;

    public UUID getIdAva() {
        return idAva;
    }
    public void setIdAva(UUID idAva) {
        this.idAva = idAva;
    }
    public String getNomeSala() {
        return nomeSala;
    }
    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
