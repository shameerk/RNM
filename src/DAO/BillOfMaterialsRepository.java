package DAO;

import java.util.ArrayList;
import java.util.List;

import FaultRepair.BillOfMaterials;
import FaultRepair.iFault;

public class BillOfMaterialsRepository {
	private iFault _validTestFault; 
	private List<BillOfMaterials> _billOfMaterials;
	
	//in this constructor, set static values to be used by DAO
	public BillOfMaterialsRepository(){
		generateBillOfMaterialsList();
	}
	
	private void generateBillOfMaterialsList(){
		_billOfMaterials = new ArrayList<BillOfMaterials>();
		
		BillOfMaterials dummyBillOfMaterials1 = new BillOfMaterials(iFault.FAULTTYPE.POTHOLE);
		_billOfMaterials.add(dummyBillOfMaterials1);
	}
	
	public List<BillOfMaterials> getListOfBillOfMaterials(){
		//statically setting work orders, these should be returned by a query to a database object
		return _billOfMaterials;
	}
}
