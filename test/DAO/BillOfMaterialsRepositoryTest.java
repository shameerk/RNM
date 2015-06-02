package DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import FaultRepair.RepairListItem;
import FaultRepair.iFault;

public class BillOfMaterialsRepositoryTest {
	private BillOfMaterialsRepository _billOfMaterialsRepo;
	
	@Before
	public void upFront(){
		//fixtures
		_billOfMaterialsRepo = new BillOfMaterialsRepository();
	}
	
	@Test // Steven
	public void repositoryReturnsBillOfMaterialsAsListOfRepairListItems(){
		List<RepairListItem> billOfMaterials = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.POTHOLE);
		
		for (RepairListItem element : billOfMaterials){
			Assert.assertTrue(element instanceof RepairListItem);
		}
	}
	
	@Test //Steven
	public void repositoryReturnsBOMListForSpecifiedFaultType(){
		
		List<RepairListItem> BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.POTHOLE);
		Assert.assertTrue(BOMList.size()==1);
		BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.DRAINAGE);
		Assert.assertTrue(BOMList.size()==2);
		BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.TRAFFICLIGHT);
		Assert.assertTrue(BOMList.size()==3);
		BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.ROADMARKING);
		Assert.assertTrue(BOMList.size()==4);
		BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.ACCIDENT);
		Assert.assertTrue(BOMList.size()==3);
		BOMList = _billOfMaterialsRepo.getListForFaultType(iFault.FAULTTYPE.SIGNAGE);
		Assert.assertTrue(BOMList.size()==3);
	}
}
