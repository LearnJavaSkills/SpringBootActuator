package in.learnjavaskills.springbootactuator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.learnjavaskills.springbootactuator.dto.Users;
import in.learnjavaskills.springbootactuator.service.UserService;

@RestController
public class UserController
{
	@Autowired
	private UserService userService;
	
	@GetMapping("activeUsers")
	public List<Users> getActiveUsers()
	{
		return userService.getActiveusers();
	}
	
	@PostMapping("login")
	public String login(@RequestBody Users user)
	{
		return userService.login(user);
	}
	
	@PostMapping("logout")
	public String logout(@RequestBody Users user)
	{
		return userService.logout(user);
	}
}
