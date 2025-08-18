package rafael.poo;


public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto(15321,"mesa",1000);
        System.out.println(p1.toString());
        Cliente c1 = new Cliente("Rafael","123.456.789-00");
        System.out.println(c1.toString());

        CadastroProdutos cadProd = new CadastroProdutos();

        cadProd.cadastrar(1231,"Lapis",2.99);

        System.out.println("Produtos cadastrados: ");
        System.out.println(cadProd.relatorio());

        Produto Prod = cadProd.pesquisa(1231);
        if (Prod == null)
        System.out.println("O produto tal nao existe.");
        else
        System.out.println("Achou " + Prod);


        ItemVenda iv1 = new ItemVenda(10, Prod);
        System.out.println("ItemVenda: " + iv1.toString());

    }

}
