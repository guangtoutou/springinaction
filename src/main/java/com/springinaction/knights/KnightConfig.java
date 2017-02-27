package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

	@Bean
	public Knight setKnight(){
		return new BraveKnight(setQuest());
	}
	
	@Bean
	public Quest setQuest(){
		return new SlayDragonQuest(System.out);
	}
}
