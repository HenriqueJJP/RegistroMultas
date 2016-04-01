package bean;

import dao.Moto_TaxiDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import pojo.Moto_Taxi;


@ManagedBean (name="motoTbean")
@SessionScoped
public class Moto_TaxiBean {
    
    @Inject
    private Moto_TaxiDao mtx;
    private Moto_Taxi mototaxi = new Moto_Taxi();

    public Moto_TaxiDao getMtx() {
        return mtx;
    }

    public void setMtx(Moto_TaxiDao mtx) {
        this.mtx = mtx;
    }

    public Moto_Taxi getMototaxi() {
        return mototaxi;
    }

    public void setMototaxi(Moto_Taxi mototaxi) {
        this.mototaxi = mototaxi;
    }
    
    public void inserirMotoTaxi(){
        mtx.inserir(mototaxi);
    }
    
    public void deletarMotoTaxi(){
        mtx.remover(mototaxi);
    }
    
    public void atualizarMotoTaxi(){
        mtx.atualizar(mototaxi);
    }
    
    public void listarMotoTaxi(){
        mtx.listar();
    }
}
