package io.javabrains.springbootstarter.team;

public class teamGetterSetter {
	
	private String TeamName;
	private String TeamSize;
	private String TeamLocation;
	
	
	public teamGetterSetter() {
	}

	public teamGetterSetter(String teamName, String teamSize, String teamLocation) {
		super();
		TeamName = teamName;
		TeamSize = teamSize;
		TeamLocation = teamLocation;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getTeamSize() {
		return TeamSize;
	}

	public void setTeamSize(String teamSize) {
		TeamSize = teamSize;
	}

	public String getTeamLocation() {
		return TeamLocation;
	}

	public void setTeamLocation(String teamLocation) {
		TeamLocation = teamLocation;
	}
	
	
}
