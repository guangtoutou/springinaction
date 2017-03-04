package com.springinaction.knights;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class KnightConfig {

@Bean
public PrintStream setStream(){
	return System.out;
}
	
}
