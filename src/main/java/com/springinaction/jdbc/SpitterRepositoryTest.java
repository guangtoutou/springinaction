package com.springinaction.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
@ActiveProfiles("H2")
public class SpitterRepositoryTest {
	
	@Autowired
	private SpitterRepository spitterRepository;

	@Test
	public void testFindSpitterByID() {
		spitterRepository.findSpitterByID(Long.parseLong("1"));
	}
}
