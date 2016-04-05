package pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Auxiliar")

public class Auxiliar implements Serializable {
  
    
    @Id
    @Column(name="CIC")
    private int cic;
    
    @Column(name="TempoConducao")
    private int tempoconducao;
    
    @Column(name="CNH")
    private boolean cnh;
    
    @Column(name="Idade")
    private boolean idade;
    
    @Column(name="Endereco")
    private String endereco;
    
    @Column(name="Certificacao")
    private boolean certificacao;
    
    @Column(name="Antecedente")
    private boolean antecedente;
    
    @OneToOne
    private Moto_Taxi moto_taxi;
    
    @ManyToOne
    private Taxi taxi;
    
    public Auxiliar(){
        
    }

    public int getCic() {
        return cic;
    }

    public void setCic(int cic) {
        this.cic = cic;
    }

    public int getTempoconducao() {
        return tempoconducao;
    }

    public void setTempoconducao(int tempoconducao) {
        this.tempoconducao = tempoconducao;
    }

    public boolean getCnh() {
        return cnh;
    }

    public void setCnh(boolean cnh) {
        this.cnh = cnh;
    }

    public boolean getIdade() {
        return idade;
    }

    public void setIdade(boolean idade) {
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
        hash = 41 * hash + this.cic;
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
        if (this.cic != other.cic) {
            return false;
        }
        return true;
    }
    

    
}

