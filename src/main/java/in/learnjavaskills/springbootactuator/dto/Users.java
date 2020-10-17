package in.learnjavaskills.springbootactuator.dto;

import org.springframework.stereotype.Component;

@Component
public class Users
{
	private String username;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
}
