package com.technicalkeeda.services;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.technicalkeeda.bean.Formation;
import com.technicalkeeda.configuration.ApplicationConfig;
import com.technicalkeeda.dao.FormationDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class FormationServiceTest {

	
	@Autowired
	FormationDao  formationDao;
	
	
	@Autowired
	FormationService  formationService;
	
	
	@Test
	public void testAddFormation(){
		
		
		//given
		Formation formation= new Formation(51,"JUNIT","test junit");
		
		//test
		int result = formationService.addFormation(formation);
		
		
		//verify
		
		assertEquals( result,1);
		
		
		
	}
	
	
	
	
}
