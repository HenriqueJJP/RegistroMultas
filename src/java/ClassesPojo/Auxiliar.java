package ClassesPojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Auxiliar")

public class Auxiliar implements Serializable {
  
    
    @Id
    @Column(name="Id")
    private int id;
    
    @Column(name="TempoConducao")
    private int tempoconducao;
    
    @Column(name="CNH")
    private String cnh;
    
    @Column(name="Idade")
    private int idade;
    
    @Column(name="Endereco")
    private String endereco;
    
    @Column(name="Certificacao")
    private boolean certificacao;
    
    @Column(name="Antecedente")
    private boolean antecedente;
    
    public Auxiliar(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempoconducao() {
        return tempoconducao;
    }

    public void setTempoconducao(int tempoconducao) {
        this.tempoconducao = tempoconducao;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isCertificacao() {
        return certificacao;
    }

    public void setCertificacao(boolean certificacao) {
        this.certificacao = certificacao;
    }

    public boolean isAntecedente() {
        return antecedente;
    }

    public void setAntecedente(boolean antecedente) {
        this.antecedente = antecedente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Auxiliar other = (Auxiliar) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

    
}

