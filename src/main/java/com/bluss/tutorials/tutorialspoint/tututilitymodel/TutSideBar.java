package com.bluss.tutorials.tutorialspoint.tututilitymodel;

import java.util.List;

public class TutSideBar{
	private String logoUrl;
	public TutSideBarSection getSections() {
		return sections;
	}
	public void setSections(TutSideBarSection sections) {
		this.sections = sections;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	private TutSideBarSection sections; 
}
