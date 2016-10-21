package ingjmcaicedo.matcher.team.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ingjmcaicedo.matcher.model.Team;

@Repository
public interface TeamRepository extends MongoRepository<Team, String>, TeamRepositoryCustom{
	
	Team findOneByName(String name);

}
