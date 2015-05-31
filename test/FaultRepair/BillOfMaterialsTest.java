package FaultRepair;

import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class BillOfMaterialsTest {
	//private field here
	private List<String> _materialsListCheck;

	@Before
	public void upFront(){
		//fixtures
		_materialsListCheck = new ArrayList<String>();
	}
	
	@Test//Steven
	public void testEmptyBillOfMaterialsListCreatedForFaultPassed(){
		//generate default bill of material for fault type
		BillOfMaterials billOfMaterials = new BillOfMaterials(iFault.FAULTTYPE.POTHOLE);
		
		Assert.assertTrue(billOfMaterials instanceof BillOfMaterials);
		_materialsListCheck = billOfMaterials.getMaterialsAsListOfStrings();
		
		Assert.assertTrue(_materialsListCheck.size() == 0);
	}
}