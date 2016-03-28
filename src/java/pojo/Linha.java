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
import javax.persistence.Table;

/**
 *
 * @author Steve
 */
@Entity
@Table(name="Linha")
public class Linha implements Serializable {

    @Id
    @Column(name="Id")
    private Long id;
    
    @Column(name="Proximidade")
    String proximidade;
    
    @Column(name="Nome")
    String nome;
    
    @Column(name="QuantidadeDeOnibus")
    int qtd_onibus;
    
    @Column(name="TempoDeViagem")
    int temp_viagem;
    
    String vazao;
    
    @Column(name="Rota")
    String rota; 
    
    public Linha(){
        
    }

    public String getProximidade() {
        return proximidade;
    }

    public void setProximidade(String proximidade) {
        this.proximidade = proximidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_onibus() {
        return qtd_onibus;
    }

    public void setQtd_onibus(int qtd_onibus) {
        this.qtd_onibus = qtd_onibus;
    }

    public int getTemp_viagem() {
        return temp_viagem;
    }

    public void setTemp_viagem(int temp_viagem) {
        this.temp_viagem = temp_viagem;
    }

    public String getVazao() {
        return vazao;
    }

    public void setVazao(String vazao) {
        this.vazao = vazao;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public Long getId() {
        return id;
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
        if (!(object instanceof Linha)) {
            return false;
        }
        Linha other = (Linha) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Linha[ id=" + id + " ]";
    }
    
}
