package bean;

import dao.AuxiliarDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import pojo.Auxiliar;

@ManagedBean (name="auxiliarbean")
@SessionScoped
public class AuxiliarBean {
    
    @Inject
    private AuxiliarDao auxdao;
    private Auxiliar auxiliar = new Auxiliar();

    public AuxiliarDao getAuxdao() {
        return auxdao;
    }

    public void setAuxdao(AuxiliarDao auxdao) {
        this.auxdao = auxdao;
    }

    public Auxiliar getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(Auxiliar auxiliar) {
        this.auxiliar = auxiliar;
    }
    
    public void salvarAuxiliar(){
        auxdao.inserir(auxiliar);
    }
    
    public void deletarAuxiliar(){
        auxdao.remover(auxiliar);
    }
    
    public void autalizarAuxiliar(){
        auxdao.atualizar(auxiliar);
    }
    
    public void listarAuxiliar (){
        auxdao.listar();
    }
    
}
