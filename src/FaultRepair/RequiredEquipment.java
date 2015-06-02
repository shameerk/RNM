package FaultRepair;

import DAO.RequiredEquipmentRepository;

public class RequiredEquipment extends RepairListContainer{
		
		public RequiredEquipment(iFault.FAULTTYPE faultype,RequiredEquipmentRepository EquipmentRepo){
			generateEquipmentList(faultype,EquipmentRepo);
		}
		
		private void generateEquipmentList(iFault.FAULTTYPE faulttype,RequiredEquipmentRepository EquipmentRepo){
			_materialsList = EquipmentRepo.getListForFaultType(faulttype);
		}
}
