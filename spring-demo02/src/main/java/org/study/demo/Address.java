package org.study.demo;

public class Address {
	
	private String country;
	private String city;
	private String zipcode;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}
