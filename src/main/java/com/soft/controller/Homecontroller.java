package com.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.Entity.UserEntity;
import com.soft.Service.RegisterService;

@Controller
@RequestMapping("user")
public class Homecontroller {

	@Autowired
	private RegisterService regiServ;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@GetMapping("/home")
	public String homepage() {
		return "home";
	}
	
	@GetMapping("/register")
	public String Registerpage() {	
		return "Register";
	}
	
	@PostMapping("/save")   
    public String saveUser(@ModelAttribute UserEntity cust) {

        regiServ.saveRegister(cust);

        return "redirect:/user/login";   
    }

	    @GetMapping("/login")
	    public String loginPage() {
	        return "Login";
	    }
	
	    // ✅ Handle Login
	    @PostMapping("/loginuser")   
	    public String loginUser(@RequestParam String email, @RequestParam String password) {
	
	        UserEntity user = regiServ.loginUser(email, password);
	
	        if (user != null && encoder.matches(password, user.getPassword())) {
	        	//System.out.println("password is found");
	            return "redirect:/user/home";  
	        }
	        else{
	        	//System.out.println("run login page");
	        	
	        	return "Login";
	        }
	    }
	    
}
