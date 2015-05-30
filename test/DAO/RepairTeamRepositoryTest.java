package DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import FaultLogging.Fault;
import FaultRepair.RepairTeam;

public class RepairTeamRepositoryTest {

	@Test
	public void theRepositoryCanOutputAListOfRepairTeams(){
		RepairTeamRepository rtr = new RepairTeamRepository();
		List<RepairTeam> rtList = rtr.getRepairTeams();
		
		for(RepairTeam rt : rtList){
			Assert.assertTrue(rt instanceof RepairTeam);
		}
		
		for(RepairTeam rt : rtList){
			System.out.println(rt);
		}
		
	}

}
