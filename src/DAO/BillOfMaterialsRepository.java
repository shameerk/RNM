package DAO;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import FaultRepair.RepairListItem;
import FaultRepair.iFault;

public class BillOfMaterialsRepository extends genericRepository{ 
	
	//in this constructor, set static values to be used by DAO
	public BillOfMaterialsRepository(){
		_hashTable = new Hashtable<iFault.FAULTTYPE,List<RepairListItem>>();
		generateHashtableDummyData();
	}
	
	protected void generateHashtableDummyData(){
		RepairListItem hammers = new RepairListItem(2,"unit","Hammer");
		RepairListItem drills = new RepairListItem(3,"unit","Drills");
		RepairListItem spades = new RepairListItem(3,"unit","Drills");
		RepairListItem paint = new RepairListItem(5,"unit","Drills");
		RepairListItem cement = new RepairListItem(3,"unit","Drills");
		RepairListItem pole = new RepairListItem(7,"unit","Drills");
		
		List<RepairListItem> tempMaterialsListPothole = new ArrayList<RepairListItem>();
		tempMaterialsListPothole = createEquipmentRepairItemList(hammers);
		_hashTable.put(iFault.FAULTTYPE.POTHOLE,tempMaterialsListPothole);
		
		List<RepairListItem> tempMaterialsListDrainage = new ArrayList<RepairListItem>();
		tempMaterialsListDrainage = createEquipmentRepairItemList(hammers,drills);
		_hashTable.put(iFault.FAULTTYPE.DRAINAGE,tempMaterialsListDrainage);
		
		List<RepairListItem> tempMaterialsListtraffic = new ArrayList<RepairListItem>();
		tempMaterialsListtraffic = createEquipmentRepairItemList(hammers,drills,spades);
		_hashTable.put(iFault.FAULTTYPE.TRAFFICLIGHT,tempMaterialsListtraffic);
		
		List<RepairListItem> tempMaterialsListroadmarking = new ArrayList<RepairListItem>();
		tempMaterialsListroadmarking = createEquipmentRepairItemList(hammers,drills,spades,spades);
		_hashTable.put(iFault.FAULTTYPE.ROADMARKING,tempMaterialsListroadmarking);
		
		List<RepairListItem> tempMaterialsListaccident = new ArrayList<RepairListItem>();
		tempMaterialsListaccident = createEquipmentRepairItemList(pole,cement,drills);
		_hashTable.put(iFault.FAULTTYPE.ACCIDENT,tempMaterialsListaccident);
		
		List<RepairListItem> tempMaterialsListsignage = new ArrayList<RepairListItem>();
		tempMaterialsListsignage = createEquipmentRepairItemList(paint,cement,drills);
		_hashTable.put(iFault.FAULTTYPE.SIGNAGE,tempMaterialsListsignage);
			
	}
	
}
