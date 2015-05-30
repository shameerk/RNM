package FaultRepair;


/*import java.util.ArrayList;
import java.util.Date;
import java.util.List;*/

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import FaultRepair.STATUS;
import FaultRepair.WorkOrder;

public class WorkOrderTest {

	private iFault _validTestFault,_invalidTestFault;
	private WorkOrder _validWorkOrder,_invalidWorkOrder;
	
	@Before
	public void upFront(){
			
		_validTestFault = new iFault(true);
		_invalidTestFault = new iFault(false);
		
		_validWorkOrder = new WorkOrder(_validTestFault);
		_invalidWorkOrder = new WorkOrder(_invalidTestFault);
	}
	
	@Test//Steven
	public void testWorkOrderCreatedNoStatusForInvalidGeoLocation(){
		Assert.assertTrue(_validWorkOrder.getStatus() == STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void testWorkOrderNotCreatedOnInvalidFault(){ 
		Assert.assertTrue(_invalidWorkOrder.getStatus() == STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void workOrderCreatedForFaultsVisibileOnMap(){
		iFault validFaultWithGeolocation = new iFault(true);
		validFaultWithGeolocation.validGeoLocation(true);
		WorkOrder validWorkOrder = new WorkOrder(validFaultWithGeolocation);
		
		Assert.assertTrue(validWorkOrder.getStatus() == STATUS.ISSUED);
	}
}
