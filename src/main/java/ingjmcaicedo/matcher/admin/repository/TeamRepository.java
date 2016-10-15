package ingjmcaicedo.matcher.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ingjmcaicedo.matcher.model.Team;

public interface TeamRepository extends MongoRepository<Team, String>{

}
