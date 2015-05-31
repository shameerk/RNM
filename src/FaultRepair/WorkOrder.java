package FaultRepair;

interface iWorkOrder{
	public String getFaultImage();
	public WorkOrder.STATUS getStatus();
	public void setStatus(WorkOrder.STATUS status);
}

public class WorkOrder implements iWorkOrder{
	
	public enum STATUS {
		NOSTATUS,ISSUED,ASSIGNED,SCHEDULED,COMPLETED
	}
	
	private STATUS status;

	public WorkOrder(){
		this.status = STATUS.NOSTATUS;
	}
	
	//Steven
	public WorkOrder(iFault fault){
		setWorkOrderStatusForFaultStatus(fault);
	}
	
	public String getFaultImage(){
		return "";
	}
	
	//Steven
	private void setWorkOrderStatusForFaultStatus(iFault fault){
		if (fault.hasWorkOrder()){
			setStatus(STATUS.ASSIGNED);
		}
		else if (fault.verified() && fault.validLocation()){
			setStatus(STATUS.ISSUED);	
		}	
		else setStatus(STATUS.NOSTATUS);
	}
	
	public BillOfMaterials generateBOMaterials(iFault.FAULTTYPE faultType){
		BillOfMaterials billOfMaterials = new BillOfMaterials(faultType);
		return billOfMaterials;
	}
	
	//Steven
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
	
}

//Steven
class iFault{
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
