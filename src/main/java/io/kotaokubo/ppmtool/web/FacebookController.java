package io.kotaokubo.ppmtool.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api/user")
public class FacebookController {

    @GetMapping
    public Principal getUser(Principal user) {
        return user;
    }
}
