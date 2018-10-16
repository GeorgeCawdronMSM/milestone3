package task3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task3.Model.Profile;
import task3.Repository.ProfileRepository;

import java.util.List;
import java.util.Optional;

@Component
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Optional<Profile> getProfile(String id) {
        return profileRepository.findById(id);
    }

    public List<Profile> getAll() {
        return profileRepository.findAll();
    }

}