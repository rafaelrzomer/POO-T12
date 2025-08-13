package rafael.poo;

import java.util.ArrayList;

public class CadastroProdutos {

    private ArrayList<Produto> lista;

    public CadastroProdutos(){

        lista = new ArrayList<>();

    }

    public void cadastrar(int codigo, String nome, double preco){
        Produto prod = new Produto(codigo, nome, preco);
        lista.add(prod);
    }

    public Produto pesquisa(int codigo){
        return null;
    }

    public String relatorio(){
        StringBuilder rel = new StringBuilder();

        
        return rel.toString();

    }


    
}
