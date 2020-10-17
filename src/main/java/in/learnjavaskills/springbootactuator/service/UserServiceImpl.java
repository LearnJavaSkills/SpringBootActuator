package in.learnjavaskills.springbootactuator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.learnjavaskills.springbootactuator.dto.Users;

@Service
public class UserServiceImpl implements UserService
{
	
	private List<Users> activeUser = new ArrayList<>();
	
	@Override
	public List<Users> getActiveusers()
	{
		return activeUser;
	}

	@Override
	public String login(Users user)
	{
		activeUser.add(user);
		return "Welcome " + user.getUsername() + " to the Spring boot actuator tutorial.";
	}


	@Override
	public String logout(Users user)
	{
		String username = user.getUsername();
		activeUser.removeIf(currentUser -> 
			currentUser.getUsername().equalsIgnoreCase(username));
	
		return username + ", you have logout.";
	}
}
