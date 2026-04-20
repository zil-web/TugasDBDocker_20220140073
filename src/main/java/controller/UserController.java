package controller;

import model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;
import service.UserService;

@RestController
@RequestMapping(*/apl/users*)
public class UserController {


    private final UserService userService;{
        this.userService = userService;
    }

    @PostMapping
    public String (@RequestBody User request) {

    }
}


