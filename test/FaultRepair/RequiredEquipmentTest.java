package FaultRepair;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DAO.RequiredEquipmentRepository;

public class RequiredEquipmentTest {
	private RequiredEquipmentRepository _requiredEquipmentRepo;
	private RequiredEquipment _requiredEquipmentDrainage;
	
	@Before
	public void upFront(){
		//fixtures
		_requiredEquipmentRepo = new RequiredEquipmentRepository();
		_requiredEquipmentDrainage = new RequiredEquipment(iFault.FAULTTYPE.DRAINAGE,_requiredEquipmentRepo);
	}
	
	@Test//Steven
	public void DAOReturnsBillOfMaterialsAsListOfRepairListItem(){
		List<RepairListItem> requiredEquipment = _requiredEquipmentDrainage.getListOfItems();
		
		for (RepairListItem element : requiredEquipment){
			Assert.assertTrue(element instanceof RepairListItem);
		}
		
	}
	
	@Test//Steven
	public void DAOReturnsRequiredEquipmentForFaultSpecificed(){
		List<RepairListItem> requiredEquipment = _requiredEquipmentDrainage.getListOfItems();
		
		Assert.assertTrue(requiredEquipment.size()==2);
	}
}
