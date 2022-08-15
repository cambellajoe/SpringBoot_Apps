
/*
*we're using @SpringBootApplication as our primary application configuration class. 
*Behind the scenes, that's equivalent to @Configuration, @EnableAutoConfiguration, and @ComponentScan together.

*@EnableJpaRepositories to scan the specified package for repositories
*@EntityScan to pick up our JPA entities
*/

package com.baeldung.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.baeldung.demo")
@EnableJpaRepositories("com.baeldung.demo.persistence.repo")
@EntityScan("com.baeldung.demo.persistence.model")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
