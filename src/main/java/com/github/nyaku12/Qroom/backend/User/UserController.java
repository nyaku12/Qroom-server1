package com.github.nyaku12.Qroom.backend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){this.userService = userService;}

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam long id){
        if(userService.deleteUserById(id)) return "Succes";
        else return "There's no such name";
    }

    @PostMapping("/create")
    public User createUser(@RequestParam String username, @RequestParam int room_id){
        return userService.saveUser(new User(username, room_id));
    }
}
