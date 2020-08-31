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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joaom
 */
@Entity
public class Leitura implements Serializable, ClassePai{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
   @Temporal(TemporalType.DATE)
    private Date dataLeitura;
    @Column (length = 15)
    private Double leitura;
    @ManyToOne
    private Associado associado;
    @Column
    private Double litrosGastos;

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public Double getLeitura() {
        return leitura;
    }

    public void setLeitura(Double leitura) {
        this.leitura = leitura;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Double getLitrosGastos() {
        return litrosGastos;
    }

    public void setLitrosGastos(Double litrosGastos) {
        this.litrosGastos = litrosGastos;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Leitura other = (Leitura) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
