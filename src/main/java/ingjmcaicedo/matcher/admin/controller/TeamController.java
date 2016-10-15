package ingjmcaicedo.matcher.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ingjmcaicedo.matcher.admin.repository.TeamRepository;
import ingjmcaicedo.matcher.model.Team;

@RestController
@RequestMapping("team")
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Resource<Team> create(@RequestParam(name="name") String name){
		Team team = new Team();
		team.setName(name);
		teamRepository.save(team);
		return new Resource<>(team);
	}

}
