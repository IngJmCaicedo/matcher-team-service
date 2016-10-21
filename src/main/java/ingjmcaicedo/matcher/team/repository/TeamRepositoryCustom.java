package ingjmcaicedo.matcher.team.repository;

import ingjmcaicedo.matcher.model.Team;

public interface TeamRepositoryCustom {

	Team updateByName(String name, String newName);
	
}
