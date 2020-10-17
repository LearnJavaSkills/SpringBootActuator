package in.learnjavaskills.springbootactuator.actuatorConfigure;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpTraceConfigure
{
	@Bean
	public HttpTraceRepository enableHttpTrace()
	{
		return new InMemoryHttpTraceRepository();
	}
}
