package FaultRepair;

import java.util.List;
import java.util.ArrayList;

public class RequiredEquipment {
	private List<String> _equipmentList;
	
	public RequiredEquipment(iFault.FAULTTYPE faulttype){
		_equipmentList = new ArrayList<String>();
		populateMaterialsList(faulttype);
	}
	
	private void populateMaterialsList(iFault.FAULTTYPE faulttype){
		_equipmentList.add("equipment1");
	}
	
	public List<String> getRequiredEquipmentListOfStrings(){
		return _equipmentList;
	}
	
}
