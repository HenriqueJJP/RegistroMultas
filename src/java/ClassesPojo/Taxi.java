package ClassesPojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gaignoux
 */
@Entity
@Table(name = "Taxi")
public class Taxi extends Veiculo implements Serializable{ 

    @OneToMany(mappedBy = "Veiculo",
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    
    @Column (name = "concessao")
    private Long concessao;

    @Column (name = "concessionario")
    private char concessionario;
    
    @Column (name = "alvara")
    private double alvara;
    
    @Column (name = "cic", unique = true)
    private int cic;
    
    @OneToMany
    private List<Veiculo> veiculo;
    
    public Long getConcessao() {
        return concessao;
    }

    public void setConcessao(Long concessao) {
        this.concessao = concessao;
    }

    public char getConcessionario() {
        return concessionario;
    }

    public void setConcessionario(char concessionario) {
        this.concessionario = concessionario;
    }

    public double getAlvara() {
        return alvara;
    }

    public void setAlvara(double alvara) {
        this.alvara = alvara;
    }

    public int getCic() {
        return cic;
    }

    public void setCic(int cic) {
        this.cic = cic;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getModelo() {
        return super.getModelo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return cic; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Taxi) {
			Taxi taxi = (Taxi) obj;
			return taxi.getCic() == cic;
		}
       
        return false;
    }
    
    
}
    
            
    
