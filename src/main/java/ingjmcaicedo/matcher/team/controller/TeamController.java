package ingjmcaicedo.matcher.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ingjmcaicedo.matcher.model.Team;
import ingjmcaicedo.matcher.team.repository.TeamRepository;

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

	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Resource<Team> update(@RequestParam(name="name") String name, @RequestParam(name="newName") String newName){
		Team team = teamRepository.updateByName(name, newName);
		return new Resource<>(team);
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public Resource<Team> findByName(@PathVariable("name") String name){
		return new Resource<>(teamRepository.findOneByName(name));
	}

	@RequestMapping(value="/getDefaultName", method=RequestMethod.GET)
	public String getDefaultName(@Value("${matcher.name.default}") String defaultName){
		return defaultName;
	}

	@RequestMapping(value="/getAppProperty", method=RequestMethod.GET)
	public String getAppProperty(@Value("${app.property.default}") String appProperty){
		return appProperty;
	}

}
