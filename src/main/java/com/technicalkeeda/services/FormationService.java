package com.technicalkeeda.services;

import java.util.List;

import com.technicalkeeda.bean.Formation;

public interface FormationService {
	    public int addFormation(Formation formation);
	 
	    public void updateFormation(Formation formation, int formId);
	 
	    public void deleteFormation(int formationId);
	 
	    public List < Formation > findAll();
}
