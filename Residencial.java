public class Residencial extends Imovel{

    private int areaTerreno;

    public Residencial(String nome, int areaC, Geo geo, int areaT){
        super(nome,areaC,geo);
        this.areaTerreno = areaT;
    }

    public double calculaImposto(){
        if (getAreaConstruida() > 200){
            return (getAreaConstruida() - 200) * getVr();
        }
        else if (getAreaConstruida() > 1000) {
            return ((getAreaConstruida() - 200) * getVr()) * 100;
        }
        return 0;
    }

    @Override
    public String toString(){
        String sb = super.toString();

        if(areaTerreno > 1000){
            sb = sb + " Taxa extra: " + 100*getVr();

        }
    return sb;
    }

}
