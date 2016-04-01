package pojo;

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

    
    
    @Column (name = "concessao")
    private Long concessao;

    @Column (name = "concessionario")
    private String concessionario;
    
    @Column (name = "alvara")
    private int alvara;
    
    @Column (name = "cic", unique = true)
    private int cic;
    
    @Column (name = "end_ponto")
    private String end_ponto;
    
//    @OneToMany
//    private List<Veiculo> veiculo;
//    
    @OneToOne(mappedBy = "moto_taxi")
    private Auxiliar auxiliar;
    
    
    public Long getConcessao() {
        return concessao;
    }

    public void setConcessao(Long concessao) {
        this.concessao = concessao;
    }

    public String getConcessionario() {
        return concessionario;
    }

    public void setConcessionario(String concessionario) {
        this.concessionario = concessionario;
    }

    public int getAlvara() {
        return alvara;
    }

    public void setAlvara(int alvara) {
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

    /*@Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String getModelo() {
        return super.getModelo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPlaca() {
        return super.getPlaca(); //To change body of generated methods, choose Tools | Templates.
    } */
//    public void setVeiculo(List<Veiculo> veiculo) {
//        this.veiculo = veiculo;
//    }
//
//    public List<Veiculo> getVeiculo() {
//        return veiculo;
//    }

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