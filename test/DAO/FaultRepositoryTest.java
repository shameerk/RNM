package DAO;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import DAO.FaultRepository;
import FaultLogging.Fault;

public class FaultRepositoryTest {

	@Test
	public void theRepositoryCanOutputAListOfFaults() {
		FaultRepository fr = new FaultRepository();
		List<Fault> faultList = fr.getFaults();
		
		for(Fault fault : faultList){
			Assert.assertTrue(fault instanceof Fault);
		}
		
		
		for(Fault fault : faultList){
			System.out.println(fault);
		}
	}
}

