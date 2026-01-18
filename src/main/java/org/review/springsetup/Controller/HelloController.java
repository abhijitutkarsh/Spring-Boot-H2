package org.review.springsetup.Controller;

import jakarta.validation.Valid;
import org.review.springsetup.Model.User;
import org.review.springsetup.Service.UserService;
import org.review.springsetup.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/")
    public String hello(){
        return "Hello from Spring boot";
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDto request)
    {
        User createdUser = userService.createUser(request);
        // ✅ UserService.createUser() MUST return UserDto
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/all")
    public List<User> allData (){
        return userService.getAllUser();
    }
}
