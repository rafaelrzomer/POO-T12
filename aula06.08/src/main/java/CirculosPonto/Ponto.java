package CirculosPonto;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void Mover(double x, double y){
        this.x = x;
        this.y = y;
    }

     public void Zoom(double zoom){
        this.raio = raio*zoom;
    }

    @Override
public String toString(){
return String.format ("Centro: %.2f, %.2f", x,y);
}
    
}
