package rafael.poo;
import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

   public GerenciadorRotas(){
    rotas = new ArrayList<>();
   }

   public void adicionar(Rota rota){
    rotas.add(rota);
   }

   public ArrayList<Rota> listarTodas(){
    return new ArrayList<>(rotas);
   }

   public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
    
    ArrayList<Rota> rotasDaOrigem = new ArrayList<>();

    for (Rota rota: rotas){
        if (rota.getOrigem().getCodigo().equals(orig.getCodigo())){
            rotasDaOrigem.add(rota);
        }
    }
    return rotasDaOrigem;
   }
}
