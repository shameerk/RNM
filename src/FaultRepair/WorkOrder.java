package FaultRepair;
//import FaultRepair.iFault;

interface iWorkOrder{
	public String getFaultImage();
	public WorkOrder.STATUS getStatus();
	public void setStatus(WorkOrder.STATUS status);
}

public class WorkOrder implements iWorkOrder{
	private STATUS _status;
	private long _workOrderID;
	
	//Steven
	public enum STATUS {
		NOSTATUS,ISSUED,ASSIGNED,SCHEDULED,COMPLETED
	}
	
	//Steven
	public WorkOrder(){
		this._status = STATUS.NOSTATUS;
	}
	
	//Steven
	public WorkOrder(iFault fault){
		setWorkOrderStatusForFaultStatus(fault);
	}
	
	public String getFaultImage(){
		return "";
	}
	
	public void setWorkOrderID(long id){
		this._workOrderID = id;
	}
	
	public long getWorkOrderID(){
		return _workOrderID;
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
	
	//Steven
	public BillOfMaterials generateBOMaterials(iFault.FAULTTYPE faultType){
		BillOfMaterials billOfMaterials = new BillOfMaterials(faultType);
		return billOfMaterials;
	}
	
	//Steven
	public RequiredEquipment generateEquipmentList(iFault.FAULTTYPE faultType){
		RequiredEquipment requiredEquipment = new RequiredEquipment(faultType);
		return requiredEquipment;
	}
	
	//Steven
	public STATUS getStatus() {
		return _status;
	}

	public void setStatus(STATUS status) {
		this._status = status;
	}
	
}

