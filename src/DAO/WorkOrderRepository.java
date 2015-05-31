package DAO;
import FaultRepair.WorkOrder;
import FaultRepair.iFault;

import java.util.List;
import java.util.ArrayList;

public class WorkOrderRepository {
	iFault _validTestFault;
	List<WorkOrder> _workOrderList;
	
	//in this constructor, set static values to be used by DAO
	public WorkOrderRepository(){
		_validTestFault = new iFault(true);
		generateWorkOrderList();
	}
	
	private void generateWorkOrderList(){
		_workOrderList = new ArrayList<WorkOrder>();
		WorkOrder dummyWorkOrder1 = new WorkOrder(_validTestFault);
		_workOrderList.add(dummyWorkOrder1);
	}
	
	public List<WorkOrder> getListOfWorkOrders(){
		//statically setting work orders, these should be returned by a query to a database object
		return _workOrderList;
	}
	
	/*public List<WorkOrder> getWorkOrderByID(long id){
		//statically assigning values for testing purposes
		switch (id){
			case 10000 : return "";
				break;
			case 10001 : return "";
				break;
			case 10002 : return "";
				break;
			default: 
			
		}
	}*/

}