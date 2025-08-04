package poo.rafael;

public class Circulo {

    private double x;
    private double y;
    private double raio;

public Circulo (double x, double y, double raio) {

    this.x = x;
    this.y = y;
    this.raio = raio;

}

public Circulo() {
    this.x = 0;
    this.y = 0;
    this.raio = 1;

}

@Override
public String toString(){
return String.format ("Centro: %.2f, %.2f Raio: %.2f", x,y,raio);
}

public void Mover(double moveX, double moveY){
        this.x = moveX;
        this.y = moveY;
    }

    public void Zoom(double zoom){
        this.raio = raio*zoom;
    }

    public double Area () {
        return Math.PI * Math.pow(this.raio,2);

    }

}

