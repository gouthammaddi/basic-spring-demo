package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.BraveKnight;
import com.example.demo.Knight;
import com.example.demo.Quest;
import com.example.demo.SlayDragonQuest;



@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
