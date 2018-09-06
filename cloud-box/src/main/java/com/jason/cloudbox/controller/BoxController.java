package com.jason.cloudbox.controller;

import com.jason.cloudbox.dto.MessageDTO;
import com.jason.cloudbox.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/box")
public class BoxController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/msg")
    public MessageDTO returnMessage() {
        return new MessageDTO(HttpStatus.OK.value(), "1", "OK", "");
    }

    @GetMapping("/user")
    public MessageDTO getUserMessage() {
        return userFeign.getMessage();
    }
}
