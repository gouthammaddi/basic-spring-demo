package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.Knight;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) throws Exception {
//		ClassPathXmlApplicationContext context =
//				new ClassPathXmlApplicationContext(
//						"src/main/java/com/example/demo/KnightConfig.java");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.example.demo.KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}

