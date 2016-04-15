package pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    private int concessao;

    @Column (name = "concessionario")
    private String concessionario;
    
    @Column (name = "alvara")
    private int alvara;
    
    @Column (name = "cic")
    private Long cic;
        
    @OneToOne(mappedBy = "moto_taxi")
    private Auxiliar auxiliar;
    
    
    public int getConcessao() {
        return concessao;
    }

    public void setConcessao(int concessao) {
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

    public Long getCic() {
        return cic;
    }

    public void setCic(Long cic) {
        this.cic = cic;
    }
    
   /* @Override
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
    }*/

   
}