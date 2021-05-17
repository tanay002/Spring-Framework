package com.bytecoder.core.mapud;

import java.util.Map;

public class Quiz 
{
	private int qid;
	private String qtopic;
	private Map<Questions,Answers> no;

	public Quiz(int qid, String qtopic, Map<Questions, Answers> no) {
		super();
		this.qid = qid;
		this.qtopic = qtopic;
		this.no = no;
	}

	public int getQid() {
		return qid;
	}

	public String getQtopic() {
		return qtopic;
	}

	public Map<Questions, Answers> getNo() {
		return no;
	}
	
	 
}
