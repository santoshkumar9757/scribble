package org.santosh.scribble;

import org.santosh.scribble.spring.BeanLifeCycleB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScribbleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ScribbleApplication.class, args);
		BeanLifeCycleB b = applicationContext.getBean(BeanLifeCycleB.class);
		b.display();
	}

}
