package FaultRepair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssignRepairTeamToAWorkOrderFeatureTest {

	
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
	public void givenWeHaveAListOfWorkOrders(){
		Assert.assertTrue(woList instanceof List);
	}
	
	
	@Before
	public void givenweHaveAListOfApprovedRepairTeams(){
		Assert.assertTrue(rtList instanceof List);
	}
	
	@Before
	public void givenAllTheWorkOrdersHaveStatusIssued(){
		for(WorkOrder wo: woList){
			Assert.assertEquals(WorkOrder.STATUS.ISSUED,wo.getStatus());
		}
	}
	
	@Test
	public void aRepairTeamCanBeAssignedToAWorkOrder(){
		wo.assignRepairTeam(rtList.get(0));
	}
	
	@Test
	public void whenARepairTeamIsAssignedToAWorkOrderItsStatusChangesToAssigned(){
		aRepairTeamCanBeAssignedToAWorkOrder();
		Assert.assertEquals(WorkOrder.STATUS.ASSIGNED,wo.getStatus());
	}

}
