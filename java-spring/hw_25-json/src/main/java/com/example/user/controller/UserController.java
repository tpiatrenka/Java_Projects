package com.example.user.controller;

import com.example.user.service.UserService;
import com.example.user.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public  UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/save")
    public long save(@RequestBody UserDto userDto) throws Exception {
        return userService.save(userDto);
    }

    @GetMapping("/all")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        return userService.getById(id);
    }

}
