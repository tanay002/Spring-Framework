package com.bytecoder.core.mapud;

public class Answers 
{
	private int ano;
	private String ans;

	public String toString()
	{
		return ano+": "+ans;
	}

	public Answers(int ano, String ans) {
		this.ano = ano;
		this.ans = ans;
	}
  

}
