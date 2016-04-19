package bean;

import dao.TaxiDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import pojo.Taxi;


@ManagedBean (name="taxibean")
@RequestScoped
public class TaxiBean {

@Inject
private TaxiDao txdao;
private Taxi taxi = new Taxi();

    public TaxiDao getTxdao() {
        return txdao;
    }

    public void setTxdao(TaxiDao txdao) {
        this.txdao = txdao;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

   public void salvarTaxi(){
       txdao.inserir(taxi);
   }
   
   public void deletarTaxi(){
       txdao.remover(taxi);
   } 
   
   public void atualizarTaxi(){
       txdao.atualizar(taxi);
   }
   
   public List<Taxi> listarTaxi(){
       System.out.println("Chamou!");
       return txdao.listar();
   }
}
