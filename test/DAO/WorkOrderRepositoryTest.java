package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultRepair.WorkOrder;

public class WorkOrderRepositoryTest {

	@Test
	public void theRepositoryReturnsListOfWorkOrders(){
		WorkOrderRepository workOrderRepo = new WorkOrderRepository();
		List<WorkOrder> workOrderList = workOrderRepo.getListOfWorkOrders();
		
		Assert.assertTrue(workOrderList.size() > 0);
		
		for (WorkOrder workOrderElement: workOrderList){
			Assert.assertTrue(workOrderElement instanceof WorkOrder);
		}
		
	}
}
