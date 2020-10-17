package in.learnjavaskills.springbootactuator.service;

import java.util.List;

import in.learnjavaskills.springbootactuator.dto.Users;

public interface UserService
{
	public List<Users> getActiveusers();
	
	public String login(Users user);
	
	public String logout(Users user);
}
