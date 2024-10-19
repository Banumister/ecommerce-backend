package com.vw.core.controller;

import com.vw.core.constants.StringMassage;
import com.vw.core.dto.UserDto;
import com.vw.core.dto.UserProfileDto;
import com.vw.core.entity.User;
import com.vw.core.handling.constants.HttpStatusCodeConstants;
import com.vw.core.handling.dto.ResponseDto;
import com.vw.core.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {
        User savedUser = userService.saveUser(userDto);
        return ResponseEntity.ok(savedUser);
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<ResponseDto> fetchUser(@PathVariable Integer id){
        UserDto fetchedUser = userService.fetchUser(id);
        return new ResponseEntity<>(new ResponseDto(HttpStatusCodeConstants.SUCCESS, fetchedUser, StringMassage.USER_DETAILS_FOUND), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<ResponseDto> fetchUserProfile(@RequestParam String userId){
        UserProfileDto fetchedUser = userService.fetchUserProfile(userId);
        return new ResponseEntity<>(new ResponseDto(HttpStatusCodeConstants.SUCCESS, fetchedUser, StringMassage.USER_DETAILS_FOUND), HttpStatus.OK);
    }

}
