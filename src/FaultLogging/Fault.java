package FaultLogging;

public class Fault
{

	private int id;
	private String status;
	private String address;
	private String type;
	private Geolocator geocode; 
	private String priority;
	private Date effectiveToFixDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(int id) {
		this.address = address;
	}
	
	public String getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(int Priority) {
		this.priority = priority;
	}
	
	public String getGeoCode() {
		return type;
	}

	public void setGeoCode(GeoLocator geoCode) {
		this.geoCode= geoCode;
	}
	
	public geocode getGeoLocation(Address){
		return geocode;
	}
}
}  
