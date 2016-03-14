package ClassesPojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gaignoux
 */
@Entity
@Table(name = "Veiculo")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "Veiculo.consultatipos", query = "SELECT * FROM a.Veiculo a inner join (SELECT * FROM b.Taxi WHERE cic = :taxi_id) a "
                                                         + "inner join (SELECT * FROM c.Moto_Taxi WHERE cic = :moto_id) WHERE veiculoId = :id")

public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    public static String FIND_USER_BY_ID = "Veiculo.consultatipos";
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    
    @Column(name = "nome")
    private char nome;
    
    @Column(name = "modelo_veiculo")
    private char modelo;
    
    @OneToMany(mappedBy="Veiculo")
    private List<Taxi> taxi;
    
    @OneToMany(mappedBy="Veiculo")
    private List<Moto_Taxi> moto;
    
    @ManyToOne
private Ponto ponto;

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Veiculo) {
            Veiculo veiculo = (Veiculo) obj;
            return veiculo.getId() == id;
	}
        return false;
    }
    
    
}
