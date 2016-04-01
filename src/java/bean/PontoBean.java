package bean;

import dao.PontoDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import pojo.Ponto;


@ManagedBean (name="pontobean")
@SessionScoped
public class PontoBean {
   
    @Inject
    private PontoDao ptdao;
    private Ponto ponto = new Ponto();

    public PontoDao getPtdao() {
        return ptdao;
    }

    public void setPtdao(PontoDao ptdao) {
        this.ptdao = ptdao;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
  
    public void inserirPonto(){
        ptdao.inserir(ponto);
    }
    
    public void deletarPonto(){
        ptdao.remover(ponto);
    }
    
    public void atualizarPonto(){
        ptdao.atualizar(ponto);
    }
    
    public void listarPonto(){
        ptdao.listar();
    }
}
