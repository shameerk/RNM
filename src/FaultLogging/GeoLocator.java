package FaultVerification; 
 public class Geolocator{
    private int latitude;
    private int longtitude;
    String direction;
    
    public GeoLocator(String Address){
        this.latitude = googleAPIlat(Address);
        this.longtitude = googleAPIlong(Address);
        this direction = gooogleAPIlat(Address);
    }
}
