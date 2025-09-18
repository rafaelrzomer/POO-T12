package rafael.poo;

import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return new ArrayList<>(aeroportos);
    }

    public Aeroporto buscarPorCodigo(String cod){
        for (Aeroporto aero: aeroportos){
            if (aero.getCodigo().equals(cod)){
                return aero;
            }
        }
        return null;
    }

}
