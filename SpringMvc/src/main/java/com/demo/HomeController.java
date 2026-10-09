package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.model.User;

@Controller
public class HomeController {
	@GetMapping("/hello")
    public String showHome(Model model) {
        User user = new User();
        user.setName("Dr. Vinay Singhal CSE");
        user.setEmail("vinay@example.com");
        user.setAge(39);
        model.addAttribute("user", user);
        return "home"; 
    }
	
	@GetMapping("/hi")
    public String showHi(Model model) {
        User user = new User();
        user.setName("Example Name");
        user.setEmail("abc@example.com");
        model.addAttribute("user", user);
        return "home"; 
    }

}
