package rafael.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void AdicionarVoo(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDate data){

        
        return null;
    }




}


