package rafael.poo;
import java.util.ArrayList;

public class Venda {
    
    private ArrayList<ItemVenda> itens;

    public Venda(){
        itens = new ArrayList<>();
    }

    public void Inserir(Produto prod){
    ItemVenda iv = new ItemVenda(1, prod);
    itens.add(iv);

    }

    public void Inserir(int quantidade, Produto prod){
    ItemVenda iv = new ItemVenda(int quantidade, Produto prod);
    itens.add(iv);

        
    }
    
    public Double valorTotal(){

    for (ItemVenda item : itens) {
        total = total + item.getValor();
    }
    return total;
    }


    public String fecharVenda(){
        Stringbuilder notaF = New StringBuilder("\nPoo Vendas \t Nota fiscal")
    }

}
