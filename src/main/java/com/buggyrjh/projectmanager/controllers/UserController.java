package com.buggyrjh.projectmanager.controllers;

import com.buggyrjh.projectmanager.model.User;
import com.buggyrjh.projectmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api-test/user")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping
//    public void addUser(@RequestBody User user) { userService.addUser(user); }
    @PostMapping
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping(path="{id}")
    public User getUserById(@PathVariable("id") UUID id) {
        return userService.getUserById(id).orElse(null);
    }
    @DeleteMapping(path="{id}")
    public void deleteUserById(@PathVariable("id") UUID id) {
        userService.deleteUser(id);
    }
    @PutMapping(path="{id}")
    public void updateUserById(@PathVariable("id") UUID id, @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
