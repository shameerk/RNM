
package FaultVerification;
import java.util.Date;

public class FieldInvestigator {

private Geolocation geolocation;
private String areaOfJurisdiction;
private GoogleMap googleMap;

public FieldInvetigator(Geolocation geolocation,String areaOfJurisdiction){
  	this.areaOfJurisdiction = areaOfJurisdiction;
  	this.geolocation = areaOfJurisdiction;
}

public String getAreaOfJurisdiction() {
  return this.areaOfJurisdiction;
}

public void setAreaOfJurisdiction(Geolocation geolocation) {
  this.geolocation = geolocation;
}

public String getGoogleMap() {
  return this.googleMap;
}

public void setGoogleMap(GoogleMap googleMap) {
  this.googleMap = googleMap;
}

public Geolocation getGeolocation() {
  return this.geolocation;
}

public void setGeolocation(Geolocation geolocation) {
  this.geolocation = geolocation;
}

public void verifyFault(Fault fault) {
		fault.setStatus("verified");
}

public void routeToFaults(String areaOfJurisdiction){
	
}

public void routeToFaults(ArrayList<Fault> FaultList){
	
}

public ArrayList<Fault> prioritizeFaults(ArrayList<Fault> FaultList){
	
}

}
