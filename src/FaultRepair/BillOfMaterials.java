package FaultRepair;

import java.util.List;
import java.util.Vector;

public class BillOfMaterials {
	private List<String> _materialsList;
	
	public BillOfMaterials(iFault.FAULTTYPE faultype){
		_materialsList = new Vector<String>();
		populateMaterialsList(faultype);
	}

	private void populateMaterialsList(iFault.FAULTTYPE fault){
		_materialsList.add("item1");
		/*_materialsList.add("item2");
		_materialsList.add("item3");*/
	}
	
	public List<String> getMaterialsList(){
		return _materialsList;
	}
}
