package com.tugas.deploy.controller;

import com.tugas.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller

public class UserController {

    private final String USERNAME = "admin";
    private final String PASSWORD = "20230140173";

    private List<User> daftarUser = new ArrayList<>();
    private AtomicLong idGenerator = new AtomicLong(1);

    @GetMapping
    public String loginPage() { return "login"; }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            return "home";
        } else {
            model.addAttribute("error", "Username atau Password salah!");
            return "login";
        }
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("mahasiswaList", daftarUser);
        return "home";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("mahasiswa", new User());
        return "form";
    }

    @PostMapping("/simpan")
    public String simpanUser(@ModelAttribute User user) {
        user.setId(idGenerator.getAndIncrement());
        daftarUser.add(user);
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}
