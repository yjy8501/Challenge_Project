package com.skhu.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skhu.challenge.entity.User;
import com.skhu.challenge.repository.UserRepository;

@RestController
public class UserController {

    @Autowired  UserRepository userRepository;

    @GetMapping("Users")
    public List<User> Users() {
        return userRepository.findAll();
    }

    @GetMapping("User/{id}")
    public User user(@PathVariable("id") int id) {
        return userRepository.findById(id).get();
    }

    // 간단한 회원가입 기능
    @PostMapping("User")
    public boolean insert(@RequestBody User user) {
        userRepository.save(user);
        return true;
    }

    @PutMapping("User")
    public boolean update(@RequestBody User user) {
        userRepository.save(user);
        return true;
    }

    @DeleteMapping("User/{id}")
    public boolean delete(@PathVariable("id") int id) {
        userRepository.deleteById(id);
        return true;
    }

    // 간단한 로그인 기능
    @PostMapping("User/SignUp/{email}/{password}")
    public String sign_up(@PathVariable("email") String email, @PathVariable("password") String password) {
        try{
            User user = userRepository.findByEmail(email);
            if(user.getPassword().equals(password)) {
                return "로그인 성공";
            }
            else{
                return "로그인 실패";
            }
        }
        catch (NullPointerException e) {
            return "로그인 실패";
        }


    }

}
