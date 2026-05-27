package in.sachin.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sachin.appConfig.*;

public class MainApp {
	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	}
	
}
