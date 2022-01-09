package com.skhu.challenge.controller;

import java.util.List;

import com.skhu.challenge.model.Login;
import com.skhu.challenge.model.Success;
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

    // 간단한 회원가입 기능
    @PostMapping("root/api/signup")
    public Object insert(@RequestBody User user) {
        userRepository.save(user);
        Success success = new Success();
        success.changeSuccess();
        return success;
    }

    // 간단한 로그인 기능
    @PostMapping("root/api/login/{email}/{password}")
    public Object sign_up(@PathVariable("email") String email, @PathVariable("password") String password) {
        Login login = new Login();
        try{
            User user = userRepository.findByEmail(email);
            if(user.getPassword().equals(password)) {
                login.changeSuccess();
                login.setUser_id(user.getId());
                return login;
            }
            else{
                login.setUser_id(500); // 500이면 password 오류
                return login;
            }
        }
        catch (NullPointerException e) {
            login.setUser_id(400); // 400이면 emial 오류
            return login;
        }


    }

}
