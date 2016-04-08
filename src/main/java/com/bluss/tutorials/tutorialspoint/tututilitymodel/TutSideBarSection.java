package com.bluss.tutorials.tutorialspoint.tututilitymodel;

import java.util.List;

import com.bluss.tutorials.tutorialspoint.utilitymodel.Hiperlink;

public class TutSideBarSection {
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Hiperlink> getListOfHiperLinks() {
		return listOfHiperLinks;
	}
	public void setListOfHiperLinks(List<Hiperlink> listOfHiperLinks) {
		this.listOfHiperLinks = listOfHiperLinks;
	}
	String title;
	List<Hiperlink> listOfHiperLinks;
}
