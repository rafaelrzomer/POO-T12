package rafael.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        this.voos = new ArrayList<>();
    }

    public void AdicionarVoo(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return new ArrayList<>(voos);
    }

    public ArrayList<Voo> buscarData(LocalDate data){
        ArrayList<Voo> resultado = new ArrayList<>();

        for (Voo dataVoo : voos){
            if (dataVoo.getDatahora().toLocalDate().equals(data)){
                resultado.add(dataVoo);
            }   
        }
        return resultado;
    }




}


