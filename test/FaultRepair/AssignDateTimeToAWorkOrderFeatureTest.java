package FaultRepair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssignDateTimeToAWorkOrderFeatureTest {

	WorkOrder wo;
	RepairTeam rt;
	iFault validTestFault,invalidTestFault;
	WorkOrder testValidWorkOrder;
	ArrayList<WorkOrder> woList = new ArrayList<>();
	ArrayList<RepairTeam> rtList = new ArrayList<>();
	
	
	@Before
	public void upFront(){
		
		wo = new WorkOrder();
		wo.setStatus(WorkOrder.STATUS.ISSUED);
		
		woList.add(wo);

		rt = new RepairTeam();
		rtList.add(rt);
		
		testValidWorkOrder = new WorkOrder(validTestFault);
		//testValidWorkOrder = new WorkOrder(invalidTestFault);
	}
	
	@Before
	public void GivenWeHaveAListOfWorkOrders(){
		Assert.assertTrue(woList instanceof List);
	}
	
	
	@Before
	public void GivenweHaveAListOfApprovedRepairTeams(){
		Assert.assertTrue(rtList instanceof List);
	}
	
	@Before
	public void GivenAllTheWorkOrdersHaveStatusIssued(){
		for(WorkOrder wo: woList){
			Assert.assertEquals(WorkOrder.STATUS.ISSUED,wo.getStatus());
		}
	}
	
	@Test
	public void aDateAndTimeCanBeAssignedToAWorkOrder(){
		Date dateAndTime = new Date();
		wo.schedule(dateAndTime);
	}

	
	@Test
	public void whenADateAndTimesAssignedToAWorkOrderItsStatusChangesToScheduled(){
		aDateAndTimeCanBeAssignedToAWorkOrder();
		Assert.assertEquals(WorkOrder.STATUS.SCHEDULED, wo.getStatus());
	}

}
