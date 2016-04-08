package org.bluss.tutorials.tutorialspoint.model;

import com.bluss.tutorials.tutorialspoint.tututilitymodel.TutContentBar;
import com.bluss.tutorials.tutorialspoint.tututilitymodel.TutSideBar;

public class TutDetailModel {
	private TutContentBar contentBar;
	private TutSideBar sideBar;
	public TutContentBar getContentBar() {
		return contentBar;
	}
	public void setContentBar(TutContentBar contentBar) {
		this.contentBar = contentBar;
	}
	public TutSideBar getSideBar() {
		return sideBar;
	}
	public void setSideBar(TutSideBar sideBar) {
		this.sideBar = sideBar;
	}
}
