package DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultRepair.RequiredEquipment;
import FaultRepair.iFault;

public class RequiredEquipmentRepositoryTest {

	@Test//Steven
	public void theRepositoryReturnsListOfRequiredEquipmentRepository(){
		RequiredEquipmentRepository requiredEquipmentRepo = new RequiredEquipmentRepository(iFault.FAULTTYPE.POTHOLE);
		List<RequiredEquipment> requiredEquipmentLists = requiredEquipmentRepo.getListOfRequiredEquipmentLists();
		
		Assert.assertTrue(requiredEquipmentLists.size() > 0);
		
			for (RequiredEquipment listOfRequiredEquipment: requiredEquipmentLists){
				Assert.assertTrue(listOfRequiredEquipment instanceof RequiredEquipment);
			}
		}
	
}
