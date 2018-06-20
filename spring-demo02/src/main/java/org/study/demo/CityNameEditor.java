package org.study.demo;

import java.beans.PropertyEditorSupport;

public class CityNameEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String cityName) throws IllegalArgumentException {
		
		if(cityName.contains("seoul")) {
			setValue("seoul metropolian");
		}else if(cityName.contains("busan")) {
			setValue("busan special");
		}else {
			setValue(cityName);
		}
	}
	
}
