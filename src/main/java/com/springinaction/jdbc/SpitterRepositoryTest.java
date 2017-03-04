package com.springinaction.jdbc;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
public class SpitterRepositoryTest {
	@Autowired
	private SpitterRepository spitterRepository;

	@Test
	public void testFindSpitterByID() {
		spitterRepository.findSpitterByID(Long.parseLong("1"));
	}
}
