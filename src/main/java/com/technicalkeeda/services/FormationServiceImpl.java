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
	public int addFormation(Formation formation) {
		return formationDao.addFormation(formation);
		
	}

	@Override
	public int updateFormation(Formation formation, int formId) {
		return formationDao.updateFormation(formation, formId);
		
	}

	@Override
	public int deleteFormation(int formId) {
		return formationDao.deleteFormation(formId);
		
	}

	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
