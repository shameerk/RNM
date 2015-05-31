package DAO;

import java.util.ArrayList;
import java.util.List;

import FaultRepair.BillOfMaterials;
import FaultRepair.iFault;
import FaultRepair.RequiredEquipment;

public class RequiredEquipmentRepository {

	private List<RequiredEquipment> _requiredEquipmentLists;
	
	public RequiredEquipmentRepository(iFault.FAULTTYPE faulttype){
		populateEquipmentList(faulttype);
	}

	private void populateEquipmentList(iFault.FAULTTYPE fault){
		_requiredEquipmentLists = new ArrayList<RequiredEquipment>();
		
		RequiredEquipment dummyRequiredEquipmentList1 = new RequiredEquipment(iFault.FAULTTYPE.POTHOLE);
		_requiredEquipmentLists.add(dummyRequiredEquipmentList1);
	}
	
	public List<RequiredEquipment> getListOfRequiredEquipmentLists(){
		return _requiredEquipmentLists;
	}
	
}
