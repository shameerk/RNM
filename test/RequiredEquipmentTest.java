import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultRepair.WorkOrder;
import FaultRepair.iFault;

public class RequiredEquipmentTest {

	@Test //Steven
	public void requiredEquipmentListIsCreatedForNatureOfWorkSpecifiedTest(){
		WorkOrder validWorkOrder = new WorkOrder(_validFaultWithGeolocationAndNoWorkOrder);
		
		RequiredEquipment testRequiredEquipmentList = validWorkOrder.generateRequiredEquipmentList(iFault.FAULTTYPE.POTHOLE);
		List<String> requiredEquipmentList = testRequiredEquipmentList.getList();
		Assert.assertTrue(requiredEquipmentList.size()>0);
	}
	
	
}
