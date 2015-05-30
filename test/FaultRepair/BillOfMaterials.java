package FaultRepair;

import java.awt.List;

public class BillOfMaterials {
	private List _materialsList;
	
	public BillOfMaterials(iFault.FAULTTYPE fault){
		populateMaterialsList(fault);
	}

	private void populateMaterialsList(iFault.FAULTTYPE fault){
		/*_materialsList.add("item1");
		_materialsList.add("item2");
		_materialsList.add("item3");*/
	}
	
	public List getMaterialsList(){
		return _materialsList;
	}
}
