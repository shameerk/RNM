package FaultRepair;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import DAO.BillOfMaterialsRepository;

public class BillOfMaterialsTest {
	//private field here
	private BillOfMaterialsRepository _billOfMaterialsRepo;
	private BillOfMaterials _billOfMaterialsSignage;
	
	@Before
	public void upFront(){
		//fixtures
		_billOfMaterialsRepo = new BillOfMaterialsRepository();
		_billOfMaterialsSignage = new BillOfMaterials(iFault.FAULTTYPE.SIGNAGE,_billOfMaterialsRepo);
	}
	
	@Test//Steven
	public void DAOReturnsBillOfMaterialsAsListOfRepairListItem(){
		List<RepairListItem> billOfMaterials = _billOfMaterialsSignage.getListOfItems();
		
		for (RepairListItem element : billOfMaterials){
			Assert.assertTrue(element instanceof RepairListItem);
		}
		
	}
	
	@Test//Steven
	public void DAOReturnsBillOfMaterialsForFaultSpecificed(){
		List<RepairListItem> billOfMaterials = _billOfMaterialsSignage.getListOfItems();
		
		Assert.assertTrue(billOfMaterials.size()==3);
	}
}