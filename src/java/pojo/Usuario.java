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
@Table(name="Usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name="Id")
    private Long senha;
    
    @Column(name="Nome")
    String nome;
    
    @Column(name="Login")
    String login;

    public Usuario(){
        
    }
    
    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
   
    public Long getId() {
        return senha;
    }

    public void setId(Long id) {
        this.senha = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (senha != null ? senha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.senha == null && other.senha != null) || (this.senha != null && !this.senha.equals(other.senha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario[ id=" + senha + " ]";
    }
    
}
