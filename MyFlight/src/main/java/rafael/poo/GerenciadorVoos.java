package rafael.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void Adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return new ArrayList<>(voos);
    }

    public ArrayList<Voo> buscarData(LocalDate data){

        ArrayList<Voo> VoosNaData = new ArrayList<>();

        for (Voo voo : voos){
            LocalDateTime dataHoraDoVoo = voo.getDatahora();
            LocalDate dataDoVoo = dataHoraDoVoo.toLocalDate();
            if (dataDoVoo.equals(data)){
                VoosNaData.add(voo);  
            }
            }   
        return VoosNaData;
        }

        
}


