package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = KnightConfigAuto.class)
public class KnightMain {
	@Autowired
	private static Knight knight;

	public static void main(String[] args) {
		knight.embarkOnQuest();

	}

}
