package com.example.foro.hub.services;

import com.example.foro.hub.models.SubjectModel;
import com.example.foro.hub.models.UserModel;
import com.example.foro.hub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserModel registerUser(UserModel request) {
        return userRepository.save(request);
    }

    public ArrayList<UserModel> listUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
}
