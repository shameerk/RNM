package FaultRepair;

import java.util.ArrayList;
import java.util.List;

abstract public class RepairListContainer{
	protected List<RepairListItem> _materialsList;
	
	public RepairListContainer(){
		_materialsList = new ArrayList<RepairListItem>();
	}
	
	public List<RepairListItem> getListOfItems(){
		return _materialsList;
	}
}
