package ingjmcaicedo.matcher.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ingjmcaicedo.matcher.model.Team;
import service.TeamService;

@RestController
@RequestMapping("team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Resource<Team> create(@RequestParam(name="name") String name){
		return new Resource<>(teamService.save(name));
	}

	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Resource<Team> update(@RequestBody Team team){
		return new Resource<>(teamService.update(team));
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Resource<Team> find(@PathVariable("id") String id){
		return new Resource<>(teamService.find(id));
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Resource<List<Team>> getDefaultName(){
		return new Resource<>(teamService.findAll());
	}

	@RequestMapping(value="/remove/{id}", method=RequestMethod.GET)
	public Resource<String> getAppProperty(@PathVariable("id") String id){
		return new Resource<>("Removed");
	}

}
