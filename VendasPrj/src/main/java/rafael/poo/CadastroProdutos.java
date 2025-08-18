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

    public Produto pesquisa(int codigo) {
       // for (int i = 0; i < lista.size(); i++){
            //Produto p = lista.get(i);
            for(Produto p : lista){
            if (p.getCodigo() == codigo){
                return p;
            }
        }
        //passei por todos e nao achei
        return null;
    }

    public String relatorio(){
        StringBuilder rel = new StringBuilder();
        
         for (int i=0; i<lista.size(); i++) {
            Produto prod = lista.get(i);
            rel.append(prod.toString());
            rel.append("\n");

         }
        return rel.toString();

    


    }
}
