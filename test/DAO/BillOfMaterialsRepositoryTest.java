package DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultRepair.BillOfMaterials;
import FaultRepair.iFault;

public class BillOfMaterialsRepositoryTest {
	
	@Test//Steven
	public void theRepositoryReturnsListOfBillOfMaterials(){
		BillOfMaterialsRepository billOfMaterialsRepo = new BillOfMaterialsRepository();
		List<BillOfMaterials> billOfMaterialsList = billOfMaterialsRepo.getListOfBillOfMaterials();
	
		Assert.assertTrue(billOfMaterialsList.size() > 0);
	
		for (BillOfMaterials billOfMaterials: billOfMaterialsList){
			Assert.assertTrue(billOfMaterials instanceof BillOfMaterials);
		}
	}

	@Test //Steven
	public void repositoryReturnsBOMListForSpecifiedFaultType(){
		BillOfMaterialsRepository billOfMaterialsRepo = new BillOfMaterialsRepository();
		
		List<String> BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.POTHOLE);
		Assert.assertTrue(BOMList.size()==1);
		BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.DRAINAGE);
		Assert.assertTrue(BOMList.size()==2);
		BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.TRAFFICLIGHT);
		Assert.assertTrue(BOMList.size()==3);
		BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.ROADMARKING);
		Assert.assertTrue(BOMList.size()==4);
		BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.ACCIDENT);
		Assert.assertTrue(BOMList.size()==5);
		BOMList = billOfMaterialsRepo.getBillOfMaterialsForFaultType(iFault.FAULTTYPE.SIGNAGE);
		Assert.assertTrue(BOMList.size()==6);
		
		/*for(String someString : BOMList) {
            System.out.println(someString);
        }*/
		
	}
}
