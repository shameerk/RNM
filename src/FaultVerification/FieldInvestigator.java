
package FaultVerification;
import java.util.Date;

public class FieldInvestigator {

private Geolocation geolocation;
private String areaOfJurisdiction;

public FieldInvetigator(Geolocation geolocation,String areaOfJurisdiction){
  	this.areaOfJurisdiction = areaOfJurisdiction;
  	this.geolocation = areaOfJurisdiction;
}

public Geolocation getGeolocation() {
  return geolocation;
}

public void setGeolocation(Geolocation geolocation) {
  this.geolocation = geolocation;
}

public void verifyFault(Fault fault) {
		fault.setStatus("verified");
}

}
