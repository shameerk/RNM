package FaultRepair;

import java.util.List;
import java.util.ArrayList;

public class BillOfMaterials {
	private List<String> _materialsList;
	
	public BillOfMaterials(iFault.FAULTTYPE faultype){
		_materialsList = new ArrayList<String>();
		populateMaterialsList(faultype);
	}

	private void populateMaterialsList(iFault.FAULTTYPE faulttype){
		_materialsList.add("item1");
		/*_materialsList.add("item2");
		_materialsList.add("item3");*/
	}
	
	public List<String> getMaterialsAsListOfStrings(){
		return _materialsList;
	}
}