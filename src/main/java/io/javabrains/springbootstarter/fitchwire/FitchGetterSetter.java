package io.javabrains.springbootstarter.fitchwire;

public class FitchGetterSetter {
	private String company;
	private String location;
	private String mobile;
	
	public FitchGetterSetter() {
		super();
	}

	public FitchGetterSetter(String company, String location, String mobile) {
		super();
		this.company = company;
		this.location = location;
		this.mobile = mobile;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
