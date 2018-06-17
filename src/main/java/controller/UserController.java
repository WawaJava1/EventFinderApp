package controller;

import entity.Event;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{number}")
    public ResponseEntity<List<User>> findUserById (@RequestParam Integer idUser){
        List<User> users = userRepository.findEventsById(idUser);
        return ResponseEntity.ok().body(users);
    }
}
