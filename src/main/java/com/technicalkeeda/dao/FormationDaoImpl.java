package com.technicalkeeda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.technicalkeeda.bean.Formation;

@Repository
@Qualifier("formationDao")
public class FormationDaoImpl implements FormationDao{
	
    @Autowired
    JdbcTemplate jdbcTemplate;
	

	@Override
	public int addFormation(Formation formation) {
		
	    int result = jdbcTemplate.update("INSERT INTO trn_formation (form_id, form_name, form_desc) VALUES (?, ?, ?)",
	    		formation.getId(), formation.getName(), formation.getDescription());
	        System.out.println("Formation Added!!");
		
		return result;
		
	}

	@Override
	public void updateFormation(Formation formation, int formId) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public Formation find(int formId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFormation(int formId) {
		// TODO Auto-generated method stub
		
	}

}
