package task3.Controller;

import task3.Model.Profile;
import task3.Model.ProfileResponse;
import task3.Repository.ProfileRepository;
import task3.Service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import task3.Model.Profile;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ProfileController {

    private final ProfileRepository profileRepository;
    private ProfileService profileService;

    @PostMapping(value = "profile")
    public ResponseEntity<ProfileResponse> save(@RequestBody Profile profile) {
        profileRepository.save(profile);
        return new ResponseEntity<>(ProfileResponse.builder().profileId(profile.getId()).build(), HttpStatus.OK);
    }

    @PutMapping (value = "profile")
    public ResponseEntity<ProfileResponse> update(@RequestBody Profile profile) {
        profileRepository.save(profile);
        return new ResponseEntity<>(ProfileResponse.builder().profileId(profile.getId()).build(), HttpStatus.OK);
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<Profile> get(@PathVariable String id) {
        Optional<Profile> profile = profileService.getProfile(id);

        if (!profile.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(profile.get(), HttpStatus.OK);
    }

    @GetMapping("/profiles")
    public List<Profile> getAll() {
        return profileService.getAll();
    }

    @DeleteMapping("profile/{id}")
    public void delete(@PathVariable String id) {
        profileRepository.deleteById(id);
    }
}