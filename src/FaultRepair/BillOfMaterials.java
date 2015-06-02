package FaultRepair;

import DAO.BillOfMaterialsRepository;

public class BillOfMaterials extends RepairListContainer{
	
	public BillOfMaterials(iFault.FAULTTYPE faultype,BillOfMaterialsRepository BOMRepo){
		super();
		generateBillOfMaterials(faultype,BOMRepo);
	}
	
	private void generateBillOfMaterials(iFault.FAULTTYPE faulttype,BillOfMaterialsRepository BOMRepo){
		_materialsList = BOMRepo.getListForFaultType(faulttype);
	}
}