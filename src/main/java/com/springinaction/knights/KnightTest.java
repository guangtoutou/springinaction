package com.springinaction.knights;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class)
public class KnightTest {

	@Autowired
	private Knight knight;

	@Test
	public void knightShouldNotBeNull() {
		knight.embarkOnQuest();

		assertNotNull(knight);

	}

}
