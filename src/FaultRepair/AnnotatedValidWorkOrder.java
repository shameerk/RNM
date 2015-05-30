package FaultRepair;

public class AnnotatedValidWorkOrder extends WorkOrder{
	private String _faultImage;
	
	
	public AnnotatedValidWorkOrder(iFault fault,String imageName){
		super(fault);
		setImage(imageName);
	}

	private void setImage(String imageName){
		_faultImage = imageName;
	}
	
	public String getImage(){
		return _faultImage;
	}
}
