package com.example.foro.hub.controllers;

import com.example.foro.hub.models.UserModel;
import com.example.foro.hub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel request) {
        UserModel userModel = this.userService.registerUser(request);
        return ResponseEntity.ok(userModel);
    }

    @GetMapping
    public ResponseEntity<ArrayList<UserModel>> listUsers() {
        ArrayList<UserModel> arrayList = (ArrayList<UserModel>) this.userService.listUsers();
        return ResponseEntity.ok(arrayList);
    }
}
