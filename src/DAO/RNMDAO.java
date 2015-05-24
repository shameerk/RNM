package DAO;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.F2D;

import FaultLogging.Fault;


public class RNMDAO {
	
	public List<Fault> getFaults(){
		
		List<Fault> list = new ArrayList<>();
		
		Fault f1 = new Fault();
		f1.setId(101);
		
		Fault f2 = new Fault();
		f2.setId(102);
		
		list.add(f1);
		list.add(f2);
		
		return list;
	}

}
