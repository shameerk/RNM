package DAO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultRepair.WorkOrder;
import FaultRepair.BillOfMaterials;

public class BillOfMaterialsRepositoryTest {@Test
	
	public void theRepositoryReturnsListOfBillOfMaterials(){
	BillOfMaterialsRepository billOfMaterialsRepo = new BillOfMaterialsRepository();
	List<BillOfMaterials> billOfMaterialsList = billOfMaterialsRepo.getListOfBillOfMaterials();
	
	Assert.assertTrue(billOfMaterialsList.size() > 0);
	
		for (BillOfMaterials billOfMaterials: billOfMaterialsList){
			Assert.assertTrue(billOfMaterials instanceof BillOfMaterials);
		}
	}
}
