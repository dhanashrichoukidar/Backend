package com.institute.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "edudetails")
public class EducationalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String title;
	private double percent;
	private int passingyear;
	@ManyToOne
	@JoinColumn(name = "sid")
	private StudentInfo studInfo;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}
	public StudentInfo getStudInfo() {
		return studInfo;
	}
	public void setStudInfo(StudentInfo studInfo) {
		this.studInfo = studInfo;
	}
	
	
}