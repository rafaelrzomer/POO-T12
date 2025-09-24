public class Geo {

    private double latitude;
    private double longitude;

    public Geo (double lat, double longit){
        this.latitude = lat;
        this.longitude = longit;
    }

    public String toString(){
       return String.format("Latitude: %f \nLongitude: %f", latitude,longitude);
    }
}
