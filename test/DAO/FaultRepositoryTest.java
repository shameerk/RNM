package DAO;

import java.util.List;
import org.junit.Test;

import DAO.FaultRepository;
import FaultLogging.Fault;

public class FaultRepositoryTest {

	@Test
	public void theDAOCanOutputAListOfFaults() {
		FaultRepository dao = new FaultRepository();
		List<Fault> faultList = dao.getFaults();
		
		for(Fault fault : faultList){
			System.out.println(fault);
		}
	}
}

