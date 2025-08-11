package CirculosPonto;

    public class Circulo {

    private Ponto centro;
    private double raio;

    public Circulo (double x, double y, double raio) {

    this.centro = new Ponto(x,y);
    this.raio = raio;

}

    public Circulo() {
    this.centro = new Ponto(0,0);
    this.raio = 1;

}

    

    public double Area () {
        return Math.PI * Math.pow(this.raio,2);
    }

}

