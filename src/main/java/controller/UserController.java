package controller;

import model.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(*/apl/users*)
public class UserController {


    private final UserService userService = null;{
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request) {
        UserService.addUSer(request);
        return "User created seuccesfully";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return  userService.getAllUsers();
    }

    @DeleteMapping
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
    @PutMapping
    public String updateUser(@PathVariable String id, @RequestBody User request) {
        userService.updateUser(id. request);
        return "User updated successfully";
    }
}


