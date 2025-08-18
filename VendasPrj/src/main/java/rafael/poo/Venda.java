package rafael.poo;
import java.util.ArrayList;

public class Venda {
    
    private ArrayList<ItemVenda> itens;

    public Venda(){
        itens = new ArrayList<>();
    }

    public void inserir(Produto prod){
    ItemVenda iv = new ItemVenda(1, prod);
    itens.add(iv);
    }

    public void inserir(int quantidade, Produto prod){
    ItemVenda iv = new ItemVenda(quantidade, prod);
    itens.add(iv); 
    }
    
    public double valorTotal(){
    double total = 0;

    for (ItemVenda item : itens) {
        total = total + item.getValor();
        }
    return total;
    }

    public String fecharVenda(){
        StringBuilder notaF = new StringBuilder ("\nVenda finalizada. \n Resumo:\n");

        for (ItemVenda item : itens){
            notaF.append("\t");
            notaF.append(item.toString());
            notaF.append("\n");
        }
        return notaF.toString();

    }

}
