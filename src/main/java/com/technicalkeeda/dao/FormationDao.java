package com.technicalkeeda.dao;

import java.util.List;

import com.technicalkeeda.bean.Formation;


public interface FormationDao {
	
	public int addFormation(Formation formation);
	 
    public int updateFormation(Formation formation, int formId);
 
    public int deleteFormation(int formId);
 
    public Formation find(int formId);
 
    public List < Formation > findAll();

}
