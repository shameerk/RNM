package FaultRepair;


import java.util.Date;

public class WorkOrder {
	
	private STATUS status;
	private RepairTeam repairTeam;
	private Date scheduleTime;

	public WorkOrder(){
		this.status = STATUS.NOSTATUS;
	}
	
	//Steven
	public WorkOrder(iFault fault){
		setWorkOrderStatusForFaultStatus(fault);
	}
	
	//Steven
	private void setWorkOrderStatusForFaultStatus(iFault fault){
		if (fault.verified() && fault.validLocation()){
			setStatus(STATUS.ISSUED);	
		}
		else setStatus(STATUS.NOSTATUS);
	}
	
	//Steven
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public void assignRepairTeam(RepairTeam repairTeam) {
		// TODO Auto-generated method stub
		this.repairTeam = repairTeam;
		this.setStatus(STATUS.ASSIGNED);
	}
	
	public RepairTeam getAssignedRepairTeam(){
		return this.repairTeam;
	}

	public void schedule(Date dateAndTime) {
		this.scheduleTime = dateAndTime;
		this.status = STATUS.SCHEDULED;
	}
}

//Steven
class iFault{
	private boolean verified;
	private boolean validLocation=false;
	
	public iFault(boolean faultState){
		this.verified=faultState;	
	}

	public boolean verified(){
		return this.verified;
	}
	
	public boolean validLocation(){
		return this.validLocation;
	}
	
	public void validGeoLocation(boolean validLocation){
		this.validLocation=validLocation;
	}
}
