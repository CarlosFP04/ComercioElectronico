package com.component.app.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComponentResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private double disponibility;
	
	public ComponentResponse() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDisponibility() {
		return disponibility;
	}

	public void setDisponibility(double disponibility) {
		this.disponibility = disponibility;
	}

}
