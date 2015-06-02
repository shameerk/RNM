package FaultRepair;

public class RepairListItem {
	protected int _qtty;
	protected String _unit;
	protected String _name;
	
	public RepairListItem(int quantity,String unit,String description){
		this._qtty = quantity;
		this._unit = unit;
		this._name = description;
	}
	
	public int quantity(){
		return _qtty;
	}
	
	public String unit(){
		return _unit;
	}
	
	public String name(){
		return _name;
	}
}
