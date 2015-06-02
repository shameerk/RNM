package DAO;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import FaultRepair.BillOfMaterials;
import FaultRepair.RepairListItem;
import FaultRepair.iFault;
import FaultRepair.RequiredEquipment;

public class RequiredEquipmentRepository extends genericRepository {

	//in this constructor, set static values to be used by DAO
		public RequiredEquipmentRepository(){
			_hashTable = new Hashtable<iFault.FAULTTYPE,List<RepairListItem>>();
			generateHashtableDummyData();
		}
		
		protected void generateHashtableDummyData(){
			RepairListItem hammers = new RepairListItem(2,"unit","Tar");
			RepairListItem drills = new RepairListItem(3,"unit","Wood");
			RepairListItem spades = new RepairListItem(3,"unit","Pipe");

			
			List<RepairListItem> tempMaterialsListPothole = new ArrayList<RepairListItem>();
			tempMaterialsListPothole = createEquipmentRepairItemList(hammers);
			_hashTable.put(iFault.FAULTTYPE.POTHOLE,tempMaterialsListPothole);
			
			List<RepairListItem> tempMaterialsListDrainage = new ArrayList<RepairListItem>();
			tempMaterialsListDrainage = createEquipmentRepairItemList(hammers,drills);
			_hashTable.put(iFault.FAULTTYPE.DRAINAGE,tempMaterialsListDrainage);
			
			List<RepairListItem> tempMaterialsListtraffic = new ArrayList<RepairListItem>();
			tempMaterialsListtraffic = createEquipmentRepairItemList(hammers,drills,spades);
			_hashTable.put(iFault.FAULTTYPE.TRAFFICLIGHT,tempMaterialsListtraffic);
		}
}
