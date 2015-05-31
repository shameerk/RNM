package FaultRepair;

//Steven
public class iFault{
	private boolean verified;
	private boolean validLocation=false;
	private boolean hasWorkOrder = false;
	
	public enum FAULTTYPE {
		POTHOLE,DRAINAGE,TRAFFICLIGHT,ROADMARKING,ACCIDENT,SIGNAGE
	}
	
	public iFault(boolean faultState){
		this.verified=faultState;	
	}

	public boolean verified(){
		return this.verified;
	}
	
	public boolean validLocation(){
		return this.validLocation;
	}
	
	public boolean hasWorkOrder(){
		return this.hasWorkOrder;
	}
	
	public void hasWorkOrder(boolean hasWorkOrder){
		this.hasWorkOrder = hasWorkOrder;
	}
	
	public void validGeoLocation(boolean validLocation){
		this.validLocation=validLocation;
	}
}
