package poo.rafael;

public class App {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(2,3,5);
        Circulo c2 = new Circulo();

        System.out.println("Circulo 1: \n" + c1 + "\n");
        System.out.println("Circulo 2: \n" + c2 + "\n");

        c1.Mover(4,2);
        System.out.println("Circulo 1 movido:\n" + c1 + "\n");

        c1.Zoom(5);
        System.out.println("Circulo 1 com Zoom:\n" + c1 + "\n");

        Circulo [] circulos = new Circulo[3];
        circulos[0] = new Circulo(1,2,3);
        circulos[1] = new Circulo(4,3,2);
        circulos[2] = new Circulo(5,5,3);

        for (int i = 0; i< circulos.length; i++){
            System.out.println(circulos[i]);
        }

    }
}
