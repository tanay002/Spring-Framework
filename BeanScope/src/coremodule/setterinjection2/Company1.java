package coremodule.setterinjection2;

public class Company1 
{
	private int cno;
	private String cname;
	private CompanyAddress1 cadd;
	public int getCno()
	{
		return cno;
	}
	public void setCno(int cno) 
	{
		this.cno = cno;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public CompanyAddress1 getCadd() 
	{
		return cadd;
	}
	public void setCadd(CompanyAddress1 cadd) 
	{
		this.cadd = cadd;
	}

	public String toString() {
		return "cno="+cno+" cname="+cname+" cadd["+cadd+"]";
	}
  
}
