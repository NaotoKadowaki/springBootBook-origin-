package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class SpringIocAopApplication implements CommandLineRunner {
	private final ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] allBeanNames = appContext.getBeanDefinitionNames();
		for (String beanName: allBeanNames) {
			log.info("Bean名:{}",beanName);
		}
	}
}
