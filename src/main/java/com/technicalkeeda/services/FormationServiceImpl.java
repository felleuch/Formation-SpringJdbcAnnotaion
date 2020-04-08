package com.technicalkeeda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicalkeeda.bean.Formation;
import com.technicalkeeda.dao.FormationDao;


@Service("formationService")
public class FormationServiceImpl implements FormationService{
	
	@Autowired
	FormationDao  formationDao;
	
	

	@Override
	public void addFormation(Formation formation) {
		formationDao.addFormation(formation);
		
	}

	@Override
	public void updateFormation(Formation formation, int formId) {
		formationDao.updateFormation(formation, formId);
		
	}

	@Override
	public void deleteFormation(int formId) {
		formationDao.deleteFormation(formId);
		
	}

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
