/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author joaom
 */
@Entity
public class Fundo implements Serializable {
 
    @Id
    @GeneratedValue
    private Long id;
    @Temporal (TemporalType.DATE)
    private Date MesFundo;
    @Column
    private Double valorFundo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMesFundo() {
        return MesFundo;
    }

    public void setMesFundo(Date MesFundo) {
        this.MesFundo = MesFundo;
    }

    public Double getValorFundo() {
        return valorFundo;
    }

    public void setValorFundo(Double valorFundo) {
        this.valorFundo = valorFundo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fundo other = (Fundo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.MesFundo, other.MesFundo)) {
            return false;
        }
        if (!Objects.equals(this.valorFundo, other.valorFundo)) {
            return false;
        }
        return true;
    }

    
}
