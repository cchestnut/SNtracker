package com.chestnut.batprojects.sntracker.model;

public class RawLocation {
	private String loc;
	private Integer time;
	private int correspondence;
	private double confidence;
	
	public RawLocation(){
		
	}
	public RawLocation(String l, Integer t){
		loc = l;
		time = t;
	}	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public int getCorrespondence() {
		return correspondence;
	}
	public void setCorrespondence(int correspondence) {
		this.correspondence = correspondence;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
}
