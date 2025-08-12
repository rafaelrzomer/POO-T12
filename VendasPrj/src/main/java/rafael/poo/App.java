package rafael.poo;

public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto(123,"oi",1000.00);
        System.out.println(p1.toString());
        Cliente c1 = new Cliente("Rafael","123.456.789-00");
        System.out.println(c1.toString());

    }

}
