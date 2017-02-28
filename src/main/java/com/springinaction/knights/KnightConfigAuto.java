package com.springinaction.knights;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class KnightConfigAuto {
	@Bean
	public PrintStream stream(){
		return (System.out);
	}
}
