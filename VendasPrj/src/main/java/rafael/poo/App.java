package rafael.poo;


public class App {
    public static void main(String[] args) {

        CadastroProdutos cadProd = new CadastroProdutos();
        cadProd.cadastrar(1231,"Lapis",2.99);
        cadProd.cadastrar(1232,"Caneta",3.99);
        cadProd.cadastrar(1233, "Borracha", 0.50);
        cadProd.cadastrar(1234, "Tesoura", 6.50);
        cadProd.cadastrar(1235, "Caderno", 19.90);

        System.out.println("Produtos cadastrados: ");
        System.out.println(cadProd.relatorio());

        Produto prod = cadProd.pesquisa(1231);
        if (prod == null)
        System.out.printf("O código digitado nao existe.");
        else
        System.out.println("Achou: \n" + prod);


        ItemVenda iv1 = new ItemVenda(10, prod);
        System.out.println("ItemVenda: " + iv1.toString());

        Venda venda1 = new Venda();
        venda1.inserir(10,prod);
        prod = cadProd.pesquisa(1232);
        venda1.inserir(5, prod);
        prod = cadProd.pesquisa(1233);
        venda1.inserir(prod);

        System.out.println(venda1.fecharVenda());

    }

}
