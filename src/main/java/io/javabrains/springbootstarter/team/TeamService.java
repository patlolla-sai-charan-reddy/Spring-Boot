package io.javabrains.springbootstarter.team;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeamService {
	
	public List<teamGetterSetter> teamData = Arrays.asList(
			new teamGetterSetter("A", "B", "C"),
			new teamGetterSetter("D", "E", "F")
		);
	
	public List<teamGetterSetter> outputService() {
		return teamData;
	}
	
	public teamGetterSetter sendTeamName(String TeamName) {
		return teamData.stream().filter(t -> t.getTeamName().equals(TeamName)).findFirst().get();
		
	}

}
