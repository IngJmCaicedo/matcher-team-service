package ingjmcaicedo.matcher.team.repository.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import ingjmcaicedo.matcher.model.Team;
import ingjmcaicedo.matcher.team.repository.TeamRepositoryCustom;

public class TeamRepositoryImpl implements TeamRepositoryCustom {

	@Autowired
	MongoOperations mongoTemplate;

	@Override
	public Team updateByName(String name, String newName) {
		mongoTemplate.updateFirst(query(where("name").is(name)), update("name", newName), Team.class);
		return mongoTemplate.findOne(query(where("name").is(newName)), Team.class);
	}

}
