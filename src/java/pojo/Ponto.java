package pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Ponto")

public class Ponto implements Serializable {

    @Id
    @Column(name="IdPonto")
    private int idPonto;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="Proximidade")
    private String proximidade;
    
    @OneToMany(mappedBy = "ponto")
    private List<Veiculo> veiculo;

    public Ponto(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdPonto() {
        return idPonto;
    }

    public void setIdPonto(int idPonto) {
        this.idPonto = idPonto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProximidade() {
        return proximidade;
    }

    public void setProximidade(String proximidade) {
        this.proximidade = proximidade;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idPonto;
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
        final Ponto other = (Ponto) obj;
        if (this.idPonto != other.idPonto) {
            return false;
        }
        return true;
    }
}
