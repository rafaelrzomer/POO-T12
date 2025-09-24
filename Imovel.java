public abstract class Imovel {

    private String proprietario;
    private int areaConstruida;
    private Geo geo;
    private static double vr;

    public Imovel(String nome, int areaC, Geo geo){
        this.proprietario = nome;
        this.areaConstruida = areaC;
        this.geo = geo;
    }

    public String getProprietario(){
        return proprietario;
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }

    public Geo getGeo(){
        return geo;
    }

    public abstract double calculaImposto();

    public static double getVr() {
        return vr;
    }
     public static void setVr(double novoVr){
        vr = novoVr;
     }

    @Override
    public String toString(){
        return String.format("Nome: %s Área construida %d Imposto: %.2f", getProprietario(),getAreaConstruida(),calculaImposto());
    }


    }




