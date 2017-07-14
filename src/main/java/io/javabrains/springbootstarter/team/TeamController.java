package io.javabrains.springbootstarter.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService TeamService;
	
	@RequestMapping("/api/team")
	public List<teamGetterSetter> getTeam() {
		return TeamService.outputService();
	}
	
	@RequestMapping("/api/team/{TeamName}")
	public teamGetterSetter getTeamname(@PathVariable String TeamName) {
		return TeamService.sendTeamName(TeamName);
	}

}
