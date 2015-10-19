package com.acm.adcampaigncontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Campaign {
	private String campaignName;
	private String campaignDescription;
	private Long campaignUID;
	private Date campaignStartDate;
	private ArrayList<String> campaignTargetRegions;
	private Ad campaignAd;
	
	public Ad getCampaignAd(){
		return campaignAd;
	}
	
	public void setCampaignAd(Ad campaignAd){
		this.campaignAd = campaignAd;
	}
	
	public Long getCampaignUID() {
		return campaignUID;
	}
	public void setCampaignUID(Long campaignUID) {
		this.campaignUID = campaignUID;
	}
	public Date getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public ArrayList<String> getCampaignTargetRegions() {
		return campaignTargetRegions;
	}
	public void setStudentSkills(ArrayList<String> campaignTargetRegions) {
		this.campaignTargetRegions = campaignTargetRegions;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDescription() {
		return campaignDescription;
	}
	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

}
