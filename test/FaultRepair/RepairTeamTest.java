package FaultRepair;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class RepairTeamTest {
	
	RepairTeam rt;
	
	@Before
	public void canInstantiate(){
		RepairTeam rt = new RepairTeam();
		
		Assert.assertTrue(rt instanceof RepairTeam);
	}
	
	@Test
	public void hasName(){
		Assert.assertTrue(rt.getName() instanceof String); 
	}

}
