package FaultRepair;

import DAO.BillOfMaterialsRepository;
//import FaultRepair.iFault;
import DAO.RequiredEquipmentRepository;

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
	public BillOfMaterials generateBOMaterials(iFault.FAULTTYPE faultType,BillOfMaterialsRepository BOMRepo){
		BillOfMaterials billOfMaterials = new BillOfMaterials(faultType,BOMRepo);
		return billOfMaterials;
	}
	
	//Steven
	public RequiredEquipment generateEquipmentList(iFault.FAULTTYPE faultType,RequiredEquipmentRepository ReRepo){
		RequiredEquipment requiredEquipment = new RequiredEquipment(faultType,ReRepo);
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

