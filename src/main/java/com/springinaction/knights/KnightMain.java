package com.springinaction.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("knights.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfigAuto.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
