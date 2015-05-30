package FaultRepair;


/*import java.util.ArrayList;
import java.util.Date;
import java.util.List;*/

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import FaultRepair.WorkOrder;

public class WorkOrderTest {

	private iFault _validTestFault,_invalidTestFault;
	private WorkOrder _validWorkOrder,_invalidWorkOrder;
	private iFault _validFaultWithGeolocation;
	
	@Before
	public void upFront(){
		//fixtures	
		_validTestFault = new iFault(true);
		_invalidTestFault = new iFault(false);
		
		_validFaultWithGeolocation = new iFault(true);
		_validFaultWithGeolocation.validGeoLocation(true);
		
		_validWorkOrder = new WorkOrder(_validTestFault);
		_invalidWorkOrder = new WorkOrder(_invalidTestFault);
	}
	
	@Test//Steven
	public void testWorkOrderCreatedNoStatusForInvalidGeoLocation(){
		Assert.assertTrue(_validWorkOrder.getStatus() == WorkOrder.STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void testWorkOrderNotCreatedOnInvalidFault(){ 
		Assert.assertTrue(_invalidWorkOrder.getStatus() == WorkOrder.STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void workOrderCreatedForFaultsVisibileOnMap(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocation);
		
		Assert.assertTrue(validWorkOrder.getStatus() == WorkOrder.STATUS.ISSUED);
	}
	
	@Test//Steven
	public void workOrderCreatedProvidedThereIsNoOutstandingWorkOrder(){
		_validFaultWithGeolocation.hasWorkOrder(false);
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocation);
		
		Assert.assertTrue(validWorkOrder.getStatus() ==WorkOrder.STATUS.ISSUED);
	}
	
	@Test//Steven
	public void validWorkOrderCreationAcceptsAnnotation(){
		_validFaultWithGeolocation.hasWorkOrder(false); 
		AnnotatedValidWorkOrder annotatedValidWorkOrder = new AnnotatedValidWorkOrder(_validFaultWithGeolocation,"fault.png");
		
		Assert.assertTrue(annotatedValidWorkOrder.getStatus() == WorkOrder.STATUS.ISSUED);
		
		String imageCheckString = annotatedValidWorkOrder.getImage();
		Assert.assertTrue(imageCheckString  instanceof String);
	}
}
