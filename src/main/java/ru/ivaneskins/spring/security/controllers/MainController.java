package ru.ivaneskins.spring.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ivaneskins.spring.security.entities.User;
import ru.ivaneskins.spring.security.services.UserServiceImpl;

import java.security.Principal;

@RestController
public class MainController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(Principal principal) {

        User user = userService.getUserByName(principal.getName());
        return "secured part of web services: " + user.getUsername() + " " + user.getEmail();
    }

    @GetMapping("/read_profile")
    public String pageForReadProfile() {
        return "read profile page";
    }

    @GetMapping("/only_for_admins")
    public String pageOnlyForAdmins() {
        return "admins page";
    }

    @GetMapping("/test")
    public String pageTest() {
        return userService.getUserByName("user").getUsername();
    }
}
