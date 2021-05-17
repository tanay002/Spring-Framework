package coremodule.setterinjection8.Map;

public class Experience 
{
private int totalExp;
private String compName;

public int getTotalExp() 
{
	return totalExp;
}
public void setTotalExp(int totalExp) 
{
	this.totalExp = totalExp;
}
public String getCompName() 
{
	return compName;
}
public void setCompName(String compName) 
{
	this.compName = compName;
}

public String toString()
{
	return "totalExp="+totalExp+" compName="+compName;
}

}
