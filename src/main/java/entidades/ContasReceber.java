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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author joaom
 */
@Entity
public class ContasReceber implements Serializable {
 
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Pessoa pessoa;
    @Temporal (TemporalType.DATE)
    private Date dataRecebimento;
    @Column
    private Double valorRecebimento;
  
    public Long getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Double getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(Double valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.dataRecebimento);
        hash = 43 * hash + Objects.hashCode(this.valorRecebimento);
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
        final ContasReceber other = (ContasReceber) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.dataRecebimento, other.dataRecebimento)) {
            return false;
        }
        if (!Objects.equals(this.valorRecebimento, other.valorRecebimento)) {
            return false;
        }
        return true;
    }


    
    
 
}
