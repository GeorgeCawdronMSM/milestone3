package task3.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import task3.Model.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {

}