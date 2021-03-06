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

    @PostMapping
    public int addUser(@RequestBody User user){
        return userService.set(user);
    }
    @GetMapping
    public List<User> selectAllUsers() {
        return userService.selectAll();
    }
    @GetMapping(path="{id}")
    public User getUserById(@PathVariable("id") UUID id) {
        return userService.select(id).orElse(null);
    }
    @DeleteMapping(path="{id}")
    public void deleteUserById(@PathVariable("id") UUID id) {
        userService.delete(id);
    }
    @PutMapping(path="{id}")
    public void updateUserById(@PathVariable("id") UUID id, @RequestBody User user) {
        userService.update(id, user);
    }
}
