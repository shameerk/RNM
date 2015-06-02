package FaultRepair;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import DAO.BillOfMaterialsRepository;
import DAO.RequiredEquipmentRepository;
import FaultRepair.WorkOrder;

public class WorkOrderTest {

	private iFault _validTestFault,_invalidTestFault;
	private iFault _validFaultWithGeolocation,_validFaultWithGeolocationAndNoWorkOrder;
	private WorkOrder _validWorkOrder,_invalidWorkOrder;
	private RequiredEquipmentRepository _requiredEquipmentRepo;
	private BillOfMaterialsRepository _billOfMaterialsRepo;
	
	@Before
	public void upFront(){
		//fixtures	
		_validTestFault = new iFault(true);
		_invalidTestFault = new iFault(false);
		
		_validFaultWithGeolocation = new iFault(true);
		_validFaultWithGeolocation.validGeoLocation(true);
		
		_validFaultWithGeolocationAndNoWorkOrder = new iFault(true);
		_validFaultWithGeolocationAndNoWorkOrder.validGeoLocation(true);
		_validFaultWithGeolocationAndNoWorkOrder.hasWorkOrder(false);
		
		_requiredEquipmentRepo = new RequiredEquipmentRepository();
		_billOfMaterialsRepo = new BillOfMaterialsRepository();
		
		_validWorkOrder = new WorkOrder(_validTestFault);
		_invalidWorkOrder = new WorkOrder(_invalidTestFault);
	}
	
	@Test//Steven
	public void testWorkOrderCreatedNoStatusForInvalidGeoLocationTest(){
		Assert.assertTrue(_validWorkOrder.getStatus() == WorkOrder.STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void testWorkOrderNotCreatedOnInvalidFaultTest(){ 
		Assert.assertTrue(_invalidWorkOrder.getStatus() == WorkOrder.STATUS.NOSTATUS);
	}
	
	@Test//Steven
	public void workOrderCreatedForFaultsVisibileOnMapTest(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocation);
		
		Assert.assertTrue(validWorkOrder.getStatus() == WorkOrder.STATUS.ISSUED);
	}
	
	@Test//Steven
	public void workOrderCreatedProvidedThereIsNoOutstandingWorkOrderTest(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocationAndNoWorkOrder);

		Assert.assertTrue(validWorkOrder.getStatus() ==WorkOrder.STATUS.ISSUED);
	}
	
	@Test//Steven
	public void validWorkOrderCreationAcceptsAnnotationTest(){
		WorkOrder annotatedValidWorkOrder = new AnnotatedWorkOrder(_validFaultWithGeolocationAndNoWorkOrder,"fault.png","Some Annotation");
		
		Assert.assertTrue(annotatedValidWorkOrder.getStatus() == WorkOrder.STATUS.ISSUED);
		
		String imageCheckString = annotatedValidWorkOrder.getFaultImage();
		Assert.assertTrue(imageCheckString  instanceof String);
	}
	
	@Test//Steven
	public void billOfMaterialsIsCreatedForNatureOfWorkSpecifiedTest(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocationAndNoWorkOrder);
		
		BillOfMaterials testMaterialsList = validWorkOrder.generateBOMaterials(iFault.FAULTTYPE.POTHOLE,_billOfMaterialsRepo);
		List<RepairListItem> checkList = testMaterialsList.getListOfItems();
		Assert.assertTrue(checkList.size()> 0);
	}
	
	@Test //Steven
	public void requiredEquipmentListCreatedForNatureOfWorkSpecified(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocationAndNoWorkOrder);
		
		RequiredEquipment testEquipmentList = validWorkOrder.generateEquipmentList(iFault.FAULTTYPE.POTHOLE,_requiredEquipmentRepo);
		List<RepairListItem> equipmentList = testEquipmentList.getListOfItems();
		Assert.assertTrue(equipmentList.size()> 0);
	}
	
	@Test//Steven
	public void userWithPermissionCanViewFaultTest(){
		
	}
	
	@Test//Steven
	public void userWihoutPermissionCannotViewFaultTest(){

	}
}
