package rafael.poo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private ArrayList<Rota> escalas;

    public VooVariasEscalas(Rota rota, ArrayList<Rota> escalas, LocalDateTime datahora, Duration duracao){
        super(rota, datahora, duracao);
        this.escalas = escalas;
    }

    public ArrayList<Rota> getEscalas(){
        return escalas;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" com escalas em: ");
        for (Rota r: escalas){
            sb.append("->" + r.getDestino().getCodigo());
        }
        return sb.toString();
    }
    

}
