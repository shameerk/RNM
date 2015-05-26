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

public class WorkOrderTest {
	
	WorkOrder wo;
	RepairTeam rt;
	iFault validTestFault;
	WorkOrder testWorkOrder;
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
		testWorkOrder = new WorkOrder(validTestFault);
		
	}
	/*
	@Test
	public void weHaveAWorkOrderClass(){
		wo = new WorkOrder();
	}
	
	@Test
	public void weHaveAListOfWorkOrders(){
		ArrayList<WorkOrder> woList = new ArrayList<>();
	}
	*/
	
	@Test//Steven
	public void testWorkOrderCreated(){
		Assert.assertTrue(testWorkOrder.getStatus() == STATUS.ISSUED);
	}
	
	@Test//Thinus
	public void weHaveAListOfWorkOrders(){
		Assert.assertTrue(woList instanceof List);
	}
	
	
	@Test //Thinus
	public void weHaveAListOfApprovedRepairTeams(){
		Assert.assertTrue(rtList instanceof List);
	}
	
	@Test//Thinus
	public void allTheWorkOrdersHaveStatusIssued(){
		for(WorkOrder wo: woList){
			Assert.assertEquals(STATUS.ISSUED,wo.getStatus());
		}
	}
	
	@Test//Thinus
	public void aRepairTeamCanBeAssignedToAWorkOrder(){
		wo.assignRepairTeam(rtList.get(0));
		
	}
	
	@Test//Thinus
	public void whenARepairTeamIsAssignedToAWorkOrderItsStatusChangesToAssigned(){
		wo.assignRepairTeam(rtList.get(0));
		Assert.assertEquals(STATUS.ASSIGNED,wo.getStatus());
	}
	
	@Test//Thinus
	public void aDateAndTimeCanBeAssignedToAWorkOrder(){
		Date dateAndTime = new Date();
		wo.schedule(dateAndTime);
	}

	
	@Test//Thinus
	public void whenADateAndTimesAssignedToAWorkOrderItsStatusChangesToScheduled(){
		Date dateAndTime = new Date();
		wo.schedule(dateAndTime);
		Assert.assertEquals(STATUS.SCHEDULED, wo.getStatus());
	}
}
