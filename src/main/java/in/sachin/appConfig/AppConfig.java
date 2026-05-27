package in.sachin.appConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"in.sachin"})

public class AppConfig {
	public AppConfig() {
		System.out.println("Constructor::AppConfig");
	}
}
