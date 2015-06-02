package DAO;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import FaultRepair.RepairListItem;
import FaultRepair.iFault;

abstract public class genericRepository {
	protected Hashtable<iFault.FAULTTYPE,List<RepairListItem>> _hashTable;
	
	protected List<RepairListItem> createEquipmentRepairItemList(RepairListItem... stringChain){
	List<RepairListItem> repairItemList = new ArrayList<RepairListItem>();
	for (RepairListItem stringItem : stringChain){
		repairItemList.add(stringItem);
		}
	return repairItemList;
	}
	
	public List<RepairListItem> getListForFaultType(iFault.FAULTTYPE faulttype){
		return _hashTable.get(faulttype);
	}
	
	abstract protected void generateHashtableDummyData();
	
	
}
