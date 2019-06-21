package com.component.app.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComponentBody implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String name;
	@NotNull
	private String date;
	
	
	public ComponentBody () {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
