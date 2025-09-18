package rafael.poo;
import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        this.rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }
    
    public ArrayList<Rota> listarTodas(){
        return new ArrayList<>(rotas);

    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem){
            ArrayList<Rota> resultado = new ArrayList<>();
            for (Rota r: rotas){
                if(r.getOrigem().equals(origem)){
                    resultado.add(r);
                }
            }
        return resultado;
    }
}
