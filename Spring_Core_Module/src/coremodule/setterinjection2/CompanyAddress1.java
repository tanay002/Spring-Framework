package coremodule.setterinjection2;

public class CompanyAddress1 
{
	private String city;
    private String country;
    
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String toString() {
		return "city="+city+" country="+country;
	}
	
}
