package com.component.app.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComponentBody implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String componentName;
	@NotNull
	private String month;
	@NotNull
	private String year;
	
	public ComponentBody () {
		
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
