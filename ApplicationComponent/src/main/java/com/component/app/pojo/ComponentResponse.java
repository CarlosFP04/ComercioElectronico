package com.component.app.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComponentResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String componentName;
	private double disponibility;
	
	public ComponentResponse() {
		
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public double getDisponibility() {
		return disponibility;
	}

	public void setDisponibility(double disponibility) {
		this.disponibility = disponibility;
	}

}
