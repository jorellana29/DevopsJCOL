package com.devops.bpichincha.devoptest.models;


public class MessageIn {


	private String message;
	private String toPerson;
	private String fromPerson;
	private int timeToLifeSec;
	
	public MessageIn() {
		
	}
	
	public MessageIn(String message, String toPerson, String fromPerson, int timeToLifeSec) {

		this.message = message;
		this.toPerson = toPerson;
		this.fromPerson = fromPerson;
		this.timeToLifeSec = timeToLifeSec;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getToPerson() {
		return toPerson;
	}
	public void setToPerson(String toPerson) {
		this.toPerson = toPerson;
	}
	

	public String getFromPerson() {
		return fromPerson;
	}
	public void setFromPerson(String fromPerson) {
		this.fromPerson = fromPerson;
	}
	

	public int getTimeToLifeSec() {
		return timeToLifeSec;
	}
	
	public void setTimeToLifeSec(int timeToLifeSec) {
		this.timeToLifeSec = timeToLifeSec;
	}
	
}
