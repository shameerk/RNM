package FaultRepair;

import java.util.List;
import org.junit.Test;

import DAO.RNMDAO;
import FaultLogging.Fault;

public class DAOTest {

	@Test
	public void theDAOCanOutputAListOfFaults() {
		RNMDAO dao = new RNMDAO();
		List<Fault> faultList = dao.getFaults();
		
		for(Fault fault : faultList){
			System.out.println(fault);
		}
	}
}

