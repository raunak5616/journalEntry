package com.restcompany.restdev.service;

import com.restcompany.restdev.entity.User;
import com.restcompany.restdev.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(ObjectId id){
        return userRepository.findById(id).get();
    }
}
