package FaultRepair;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import FaultRepair.RepairTeam;
import FaultRepair.STATUS;
import FaultRepair.WorkOrder;


public class WorkOrderSchedulerTest {

	WorkOrder wo;
	RepairTeam rt;
	iFault validTestFault,invalidTestFault;
	WorkOrder testValidWorkOrder;
	ArrayList<WorkOrder> woList = new ArrayList<>();
	ArrayList<RepairTeam> rtList = new ArrayList<>();
	
	
	@Before
	public void upFront(){
		
		wo = new WorkOrder();
		wo.setStatus(STATUS.ISSUED);
		
		woList.add(wo);

		rt = new RepairTeam();
		rtList.add(rt);
		
		validTestFault = new iFault(true);
		invalidTestFault = new iFault(false);
		
		testValidWorkOrder = new WorkOrder(validTestFault);
		//testValidWorkOrder = new WorkOrder(invalidTestFault);
	}

	@Test
	public void weHaveAListOfWorkOrders(){
		Assert.assertTrue(woList instanceof List);
	}
	
	
	@Test 
	public void weHaveAListOfApprovedRepairTeams(){
		Assert.assertTrue(rtList instanceof List);
	}
	
	@Test
	public void allTheWorkOrdersHaveStatusIssued(){
		for(WorkOrder wo: woList){
			Assert.assertEquals(STATUS.ISSUED,wo.getStatus());
		}
	}
	
	@Test
	public void aRepairTeamCanBeAssignedToAWorkOrder(){
		wo.assignRepairTeam(rtList.get(0));
		
	}
	
	@Test
	public void whenARepairTeamIsAssignedToAWorkOrderItsStatusChangesToAssigned(){
		wo.assignRepairTeam(rtList.get(0));
		Assert.assertEquals(STATUS.ASSIGNED,wo.getStatus());
	}
	
	@Test
	public void aDateAndTimeCanBeAssignedToAWorkOrder(){
		Date dateAndTime = new Date();
		wo.schedule(dateAndTime);
	}

	
	@Test
	public void whenADateAndTimesAssignedToAWorkOrderItsStatusChangesToScheduled(){
		Date dateAndTime = new Date();
		wo.schedule(dateAndTime);
		Assert.assertEquals(STATUS.SCHEDULED, wo.getStatus());
	}
	
}
