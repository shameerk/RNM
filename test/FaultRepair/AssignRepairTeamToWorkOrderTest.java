package FaultRepair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssignRepairTeamToWorkOrderTest {

	
	WorkOrder wo;
	RepairTeam rt;
	ArrayList<WorkOrder> woList = new ArrayList<>();
	ArrayList<RepairTeam> rtList = new ArrayList<>();
	
	
	@Before
	public void initialize(){
		
		wo = new WorkOrder();
		wo.setStatus(WorkOrder.STATUS.ISSUED);
		
		woList.add(wo);

		rt = new RepairTeam();
		rtList.add(rt);
				
		givenWeHaveAListOfWorkOrders();
		givenWeHaveAListOfApprovedRepairTeams();
		givenAllTheWorkOrdersHaveStatusIssued();
	}


	public void givenWeHaveAListOfWorkOrders(){
		Assert.assertTrue(woList instanceof List);
	}
	
	
	
	public void givenWeHaveAListOfApprovedRepairTeams(){
		Assert.assertTrue(rtList instanceof List);
	}
	
	
	public void givenAllTheWorkOrdersHaveStatusIssued(){
		for(WorkOrder wo: woList){
			Assert.assertEquals(WorkOrder.STATUS.ISSUED,wo.getStatus());
		}
	}
	

	/**
	 * 
	 * Test if a repair team can be assigned to a WorkOrder
	 * @param rt
	 */
	public void aRepairTeamCanBeAssignedToAWorkOrder(RepairTeam rt){
		fail();
	}

	
	
	public void whenAFilterIsAppliedWorkOrdersAreFiltered(String filterType, String filterValue){
		
		List<WorkOrder> filteredWoList = new ArrayList<>();
		
		for(WorkOrder wo : filteredWoList){
			Assert.assertEquals(filterValue, wo.getFaultType());
		}
	}
	
	
	public void whenARepairTeamIsAssignedToAWorkOrderItsStatusChangesToAssigned(){
	
		aRepairTeamCanBeAssignedToAWorkOrder(new RepairTeam("zzz"));
		Assert.assertEquals(wo.getStatus(),WorkOrder.STATUS.ASSIGNED);
	
	}
	
	
	public List<RepairTeam> weCanGetAListOfRepairTeamsThatAreAvailableForADateTime(Date dateTime){
		
		List<RepairTeam> rtAvailableList = new ArrayList<>();
		
		//Write logic to get rtAvailableList
		
		
		
		for(RepairTeam rt : rtAvailableList){
			Assert.assertEquals(rt.getAvailability(dateTime),true);
		}
		
		return rtAvailableList;
	}
	
	/**
	 * 
	 * Scenario 1
	 */
	@Test
	public void basedOnFaultType(){
		whenAFilterIsAppliedWorkOrdersAreFiltered("FaultType", "road");
		whenARepairTeamIsAssignedToAWorkOrderItsStatusChangesToAssigned();
	}
	
	
	/**
	 * 
	 * Scenario 2
	 */
	@Test
	public void basedOnProximity(){
		whenAFilterIsAppliedWorkOrdersAreFiltered("Location", "Fourways");
	}
	
	/**
	 * 
	 * Scenario 3
	 */
	@Test
	public void basedOnTeamAvailability(){
		List<RepairTeam> rtList = weCanGetAListOfRepairTeamsThatAreAvailableForADateTime(new Date());
		aRepairTeamCanBeAssignedToAWorkOrder(rtList.get(0));
	}
	

}
