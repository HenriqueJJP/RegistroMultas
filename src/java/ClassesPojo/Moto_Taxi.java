package ClassesPojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author gaignoux
 */
@Entity
@Table(name = "Moto_Taxi")
public class Moto_Taxi extends Veiculo implements Serializable{ 

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
    
    @Column (name = "end_ponto")
    private String end_ponto;
    
    @OneToMany
    private List<Veiculo> veiculo;
    
    @OneToOne(mappedBy = "moto_taxi")
    private Auxiliar auxiliar;
    
    
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

    public String getEnd_ponto() {
        return end_ponto;
    }

    public void setEnd_ponto(String end_ponto) {
        this.end_ponto = end_ponto;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Moto_Taxi) {
			Moto_Taxi moto = (Moto_Taxi) obj;
			return moto.getCic() == cic;
		}
       
        return false;
    }

   
}