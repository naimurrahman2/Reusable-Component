package com.bjit.AuthenticationModule.temp.controller;

import com.bjit.AuthenticationModule.temp.dto.RegistrationRequest;
import com.bjit.AuthenticationModule.temp.service.TempUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/user/registration")
@AllArgsConstructor
public class TempUserController {

     TempUserService tempUserService;

    @PostMapping
    String register(@RequestBody RegistrationRequest request) {
        return tempUserService.signUp(request);
    }
    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return tempUserService.confirmToken(token);
    }
}
