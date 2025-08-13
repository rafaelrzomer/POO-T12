package rafael.poo;

public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto(15321,"mesa",1000);
        System.out.println(p1.toString());
        Cliente c1 = new Cliente("Rafael","123.456.789-00");
        System.out.println(c1.toString());

        CadastroProdutos cadProd = new CadastroProdutos();

        cadProd.cadastrar();



    }

}
