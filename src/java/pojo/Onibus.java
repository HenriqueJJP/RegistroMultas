/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Steve
 */
@Entity
@Table(name="Onibus")
public class Onibus implements Serializable {
    
    @Id
    @Column(name="Id")
    private Long id;
    
    @Column(name="Placa")
    private String placa;
    
    @Column(name="Motorista")
    private String motorista;
    
    @ManyToOne
    private Empresa empresa;
    
    @ManyToOne
    private Linha linha;

    public Onibus(){
        
    }
    
    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onibus)) {
            return false;
        }
        Onibus other = (Onibus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesPojo.Onibus[ id=" + id + " ]";
    }
    
}
