package CirculosPonto;

public class Ponto {

    private Ponto centro;
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void Mover(double novoX, double novoY){
        centro.Mover(novoX,novoY);
    }


    @Override
    public String toString() {
    return String.format ("Centro: %.2f, %.2f", this.x,this.y);
    }
    
}
