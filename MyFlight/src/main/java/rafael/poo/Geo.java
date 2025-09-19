package rafael.poo;

public class Geo {

	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude){

		this.latitude = latitude;
		this.longitude = longitude;

	}

	public double getLatitude(){
		return latitude;
	}
	
	public double getLongitude(){
		return longitude;
	}

	public static double calculaDistancia (Geo g1, Geo g2){
		double distancia;
		double r = 6371;
		double raiz = Math.sqrt(Math.pow(Math.sin((Math.toRadians(g1.latitude) - Math.toRadians(g2.latitude))/2), 2)
					+ 			Math.pow(Math.sin((Math.toRadians(g1.longitude) - Math.toRadians(g2.longitude))/2),2)
								* Math.cos(Math.toRadians(g1.latitude)) * Math.cos(Math.toRadians(g2.latitude)));
		distancia = (2*r)*Math.asin(raiz);

		return distancia;
	}

}



