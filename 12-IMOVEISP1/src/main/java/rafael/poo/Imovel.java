package rafael.poo;

public abstract class Imovel{
    private String proprietario;
    private int areaConstruida;
    private Geo geoLocalizacao;

    private static double VR = 1000;

    public static void setVR(double val){
        VR = val;
    }

    public static double getVR(){
        return Imovel.VR;
    }

}