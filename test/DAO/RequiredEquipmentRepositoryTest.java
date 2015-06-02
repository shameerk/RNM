package DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import FaultRepair.RepairListItem;
import FaultRepair.iFault;

public class RequiredEquipmentRepositoryTest {
	private RequiredEquipmentRepository _requiredEquipmentRepo;
	
	@Before
	public void upFront(){
		//fixtures
		_requiredEquipmentRepo = new RequiredEquipmentRepository();
	}
	
	@Test // Steven
	public void repositoryReturnsRequiredEquipmentAsListOfRepairListItems(){
		List<RepairListItem> billOfMaterials = _requiredEquipmentRepo.getListForFaultType(iFault.FAULTTYPE.POTHOLE);
		
		for (RepairListItem element : billOfMaterials){
			Assert.assertTrue(element instanceof RepairListItem);
		}
	}
	
	@Test //Steven
	public void repositoryReturnsRequiredEquipmentListForSpecifiedFaultType(){
		
		List<RepairListItem> BOMList = _requiredEquipmentRepo.getListForFaultType(iFault.FAULTTYPE.POTHOLE);
		Assert.assertTrue(BOMList.size()==1);
		BOMList = _requiredEquipmentRepo.getListForFaultType(iFault.FAULTTYPE.DRAINAGE);
		Assert.assertTrue(BOMList.size()==2);
		BOMList = _requiredEquipmentRepo.getListForFaultType(iFault.FAULTTYPE.TRAFFICLIGHT);
		Assert.assertTrue(BOMList.size()==3);
	}
}
