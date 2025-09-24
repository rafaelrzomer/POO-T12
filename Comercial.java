public class Comercial extends Imovel {

    public Comercial (String nome, int areaC, Geo geo){
        super(nome, areaC, geo);
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
}
