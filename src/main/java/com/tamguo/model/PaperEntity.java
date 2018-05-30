package com.tamguo.model;

import java.io.Serializable;
import javax.persistence.*;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;


/**
 * The persistent class for the tiku_chapter database table.
 * 
 */
@Entity
@Table(name="tiku_paper")
@NamedQuery(name="PaperEntity.findAll", query="SELECT c FROM PaperEntity c")
public class PaperEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	@Column(name="subject_id")
	private String subjectId;
	
	@Column(name="course_id")
	private String courseId;
	
	@Column(name="school_id")
	private String schoolId;
	
	@Column(name="area_id")
	private String areaId;
	
	@Column(name="creater_id")
	private String createrId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="question_info")
	private String questionInfo;
	
	@Column(name="type")
	private String type;
	
	@Column(name="year")
	private String year;
	
	@Column(name="down_hits")
	private Integer downHits;
	
	@Column(name="open_hits")
	private Integer openHits;
	
	@Column(name="seo_title")
	private String seoTitle;
	
	@Column(name="seo_keywords")
	private String seoKeywords;
	
	@Column(name="seo_description")
	private String seoDescription;
	
	private String subjectName;
	
	private String courseName;
	
	private String areaName;
	
	private String schoolName;
	
	public JSONArray getQueInfo(){
		if(StringUtils.isEmpty(getQuestionInfo())){
			return null;
		}
		return JSONArray.parseArray(getQuestionInfo());
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public Integer getDownHits() {
		return downHits;
	}

	public void setDownHits(Integer downHits) {
		this.downHits = downHits;
	}

	public Integer getOpenHits() {
		return openHits;
	}

	public void setOpenHits(Integer openHits) {
		this.openHits = openHits;
	}

	public String getQuestionInfo() {
		return questionInfo;
	}

	public void setQuestionInfo(String questionInfo) {
		this.questionInfo = questionInfo;
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


}