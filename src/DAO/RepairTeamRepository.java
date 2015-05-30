package DAO;

import java.util.ArrayList;
import java.util.List;

import FaultRepair.RepairTeam;

public class RepairTeamRepository {

	
	public List<RepairTeam> getRepairTeams(){
		
		List<RepairTeam> rtList = new ArrayList<>();
		
		rtList.add(new RepairTeam());
		rtList.add(new RepairTeam());
		rtList.add(new RepairTeam());
		rtList.add(new RepairTeam());
		
		return rtList;
	}
}
