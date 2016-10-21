package service;

import java.util.List;

import ingjmcaicedo.matcher.model.Team;

public interface TeamService {
	
	Team save(String name);

	Team update(Team team);
	
	Team find(String id);

	void remove(String id);
	
	List<Team> findAll();

}
