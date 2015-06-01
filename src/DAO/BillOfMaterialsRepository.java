package DAO;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import FaultRepair.BillOfMaterials;
import FaultRepair.iFault;

public class BillOfMaterialsRepository { 
	private List<BillOfMaterials> _billOfMaterials;
	private Hashtable<iFault.FAULTTYPE,List<String>> _faultTypeToBillOfMaterialsMapping;
	
	//in this constructor, set static values to be used by DAO
	public BillOfMaterialsRepository(){
		generateBillOfMaterialsList();
		_faultTypeToBillOfMaterialsMapping = new Hashtable<iFault.FAULTTYPE,List<String>>();
		generateFaultToBOMHashtableDummyData();
	}
	
	private void generateBillOfMaterialsList(){
		_billOfMaterials = new ArrayList<BillOfMaterials>();
		
		BillOfMaterials dummyBillOfMaterials1 = new BillOfMaterials(iFault.FAULTTYPE.POTHOLE);
		_billOfMaterials.add(dummyBillOfMaterials1);
	}
	
	private void generateFaultToBOMHashtableDummyData(){
		List<String> tempMaterialsListpothole = new ArrayList<String>();
		tempMaterialsListpothole = createEquipmentStringList("Hammer");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.POTHOLE,tempMaterialsListpothole);
		
		List<String> tempMaterialsListdrainage = new ArrayList<String>();
		tempMaterialsListdrainage = createEquipmentStringList("Hammer","Drill");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.DRAINAGE,tempMaterialsListdrainage);
		
		List<String> tempMaterialsListtraffic = new ArrayList<String>();
		tempMaterialsListtraffic = createEquipmentStringList("Hammer","Drill","Spade");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.TRAFFICLIGHT,tempMaterialsListtraffic);
		
		List<String> tempMaterialsListroadmarking = new ArrayList<String>();
		tempMaterialsListroadmarking = createEquipmentStringList("Hammer","Drill","Spade","Paint");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.ROADMARKING,tempMaterialsListroadmarking);
		
		List<String> tempMaterialsListaccident = new ArrayList<String>();
		tempMaterialsListaccident = createEquipmentStringList("Hammer","Drill","Spade","Paint","Cement");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.ACCIDENT,tempMaterialsListaccident);
		
		List<String> tempMaterialsListsignage = new ArrayList<String>();
		tempMaterialsListsignage = createEquipmentStringList("Hammer","Drill","Spade","Paint","Cement","Pole");
		_faultTypeToBillOfMaterialsMapping.put(iFault.FAULTTYPE.SIGNAGE,tempMaterialsListsignage);
			
	}
	
	private List<String> createEquipmentStringList(String... stringChain){
		List<String> stringItemList = new ArrayList<String>();
		for (String stringItem : stringChain){
			stringItemList.add(stringItem);
		}
		return stringItemList;
	}     
	
	public List<String> getBillOfMaterialsForFaultType(iFault.FAULTTYPE faulttype){
		return _faultTypeToBillOfMaterialsMapping.get(faulttype);
	}
	
	public List<BillOfMaterials> getListOfBillOfMaterials(){
		//statically setting work orders, these should be returned by a query to a database object
		return _billOfMaterials;
	}
}
