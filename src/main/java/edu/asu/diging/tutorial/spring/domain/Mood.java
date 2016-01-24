package edu.asu.diging.tutorial.spring.domain;
 
public class Mood {
 
    private String feeling;
    private String feelingReason;
 
    public Mood(String mood) {
        feeling = mood;
    }
    public Mood(String mood, String reason) {
        feeling = mood;
        feelingReason = reason;
    }
	public String getFeeling() {
		return feeling;
	}
	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	public String getFeelingReason() {
		return feelingReason;
	}
	public void setFeelingReason(String feelingReason) {
		this.feelingReason = feelingReason;
	}
 

    

}