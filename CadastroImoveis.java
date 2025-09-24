import java.util.ArrayList;

public class CadastroImoveis {

    ArrayList<Imovel> imoveis = new ArrayList<>();

    public void add(Imovel elem){
        imoveis.add(elem);
    }

    public String listar(){
        StringBuilder sb = new StringBuilder();
        for (Imovel imovel: imoveis){
            sb.append(imovel.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String listar(String nome){
        StringBuilder sb = new StringBuilder();
        for (Imovel imovel: imoveis){
            if(nome.equals(imovel.getProprietario())) {
                sb.append(imovel.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
