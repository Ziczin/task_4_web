package com.example.task_4_main.controllers;

import com.example.task_4_main.models.User;
import com.example.task_4_main.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;

    @GetMapping("/")
    public String users(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "users";
    }

    @GetMapping("/user/{id}")
    public String modifyUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "modify-user";
    }

    @PostMapping("/user/create")
    public String createUser(User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @PostMapping("/user/modify/{id}")
    public String modifyUser(@PathVariable Long id, User user) {
        userService.replaceUser(id, user);
        return "redirect:/";
    }
}
