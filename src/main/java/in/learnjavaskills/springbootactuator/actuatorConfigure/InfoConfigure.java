package in.learnjavaskills.springbootactuator.actuatorConfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Configuration;

import in.learnjavaskills.springbootactuator.service.UserService;

@Configuration
public class InfoConfigure implements InfoContributor
{
	@Autowired
	private UserService userService;
	
	@Override
	public void contribute(Builder builder)
	{
		builder.withDetail("Active Users", userService.getActiveusers());
	}

}
