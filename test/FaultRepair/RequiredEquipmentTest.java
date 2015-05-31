package FaultRepair;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RequiredEquipmentTest {
	private List<String> _equipment;
	
	@Before
	public void upFront(){
		//fixtures
		_equipment = new ArrayList<String>();
	}
	
	@Test//Steven
	public void testEmptyBillOfMaterialsListCreatedForFaultPassed(){
		//generate default required equipment for fault type
		RequiredEquipment requiredEquipmentForFault = new RequiredEquipment(iFault.FAULTTYPE.POTHOLE);
	
		Assert.assertTrue(requiredEquipmentForFault instanceof RequiredEquipment);
		
		_equipment = requiredEquipmentForFault.getRequiredEquipmentListOfStrings();
		
		Assert.assertTrue(_equipment.size() == 0);
	}
}
