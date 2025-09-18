package rafael.poo;

import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        this.aeronaves = new ArrayList<>();
    }

    public void Adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas(){
        return new ArrayList<>(aeronaves);
    }

    public Aeronave buscarPorCodigo(String cod){

        for (Aeronave aero : aeronaves ){
            if (aero.getCodigo().equals(cod)){
                return aero;
            }
        }
        return null;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Lista de Aeronaves\n");
        for (Aeronave aero: aeronaves){
            sb.append(aero.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    

}
