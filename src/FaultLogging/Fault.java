/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.wits.elen7045.rnt.faultlogging;

import java.util.Date;
import za.ac.wits.elen7045.rnt.common.GeolocatorSessionBean;

/**
 *
 * @author michael
 */
public class Fault 
 { 
 
	private int id; 
	private String status; 
	private String address; 
	private String type; 
	private GeolocatorSessionBean geocode;  
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
 
 	public void setType(String type) { 
		this.type = type; 
 	} 
	 	public String getPriority() { 
		return priority; 
 	} 

 
 	public void setPriority(int Priority) { 
 		this.priority = priority; 
 	} 
 	 
 	public String getGeoCode() {  		return type; 
	} 
 	public void setGeoCode(GeolocatorSessionBean geocode) { 
		this.geocode= geocode; 
 	} 
 	 
 	public GeolocatorSessionBean getGeoLocation(String address){ 
		return geocode; 
 	} 
} 
 
