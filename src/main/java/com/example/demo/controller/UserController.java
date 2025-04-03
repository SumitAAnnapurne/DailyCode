package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.binding.SignUpForm;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public String handleSignUp(@ModelAttribute("user") SignUpForm form, Model model) {

		boolean status = userService.signUp(form);

		if (status) {
			model.addAttribute("successMsg", "Accountis created || check your Email");
		} else {
			model.addAttribute("failed", "use unique email");
		}
		return "signup";
	}

	@GetMapping("login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("signup")
	public String signUpPage(Model model) {
		model.addAttribute("user" , new SignUpForm());
		return "signup";
	}

	@GetMapping("unlock")
	public String unlockPage() {
		return "unlock";
	}

	@GetMapping("forgot")
	public String forgotPwdPage() {
		return "forgotPwd";
	}

}
