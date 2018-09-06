package com.jason.clouduser.controller;

import com.jason.clouduser.dto.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @GetMapping("/form")
    public MessageDTO formRegister() {
        MessageDTO msg = new MessageDTO(HttpStatus.OK.value(), "1", "OK", "");
        return msg;
    }
}
