package com.technicalkeeda.bean;

public class Formation {
	
	int id;
	
	String name;
	
	String description;

	public Formation(int id, String name, String desc) {
		this.id=id;
		this.name=name;
		this.description=desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
