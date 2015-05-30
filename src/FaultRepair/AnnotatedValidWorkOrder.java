package FaultRepair;

public class AnnotatedValidWorkOrder extends WorkOrder{
	private String _faultImage;
	private String _faultAnnotation;
	
	public AnnotatedValidWorkOrder(iFault fault,String imageName,String annotation){
		super(fault);
		setImage(imageName);
		setFaultAnnotation(annotation);
	}

	private void setFaultAnnotation(String faultAnnotation){
		_faultAnnotation = faultAnnotation;
	}
	
	private void setImage(String imageName){
		_faultImage = imageName;
	}
	
	public String getFaultImage(){
		return _faultImage;
	}
	
	public String getFaultAnnotation(){
		return _faultAnnotation;
	}
}
