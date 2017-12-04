package com.cn.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生类
 * 
 * @author Administrator
 *
 */
public class Student {
	private String name;
	private String id;
	private double scroe;// 分数
	private ArrayList<Title> titles;// 学生的题目
	private List<Xuanxiang> answers;// 学生的答案

	public Student() {
		titles = new ArrayList<Title>();
		answers = new ArrayList<Xuanxiang>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getScroe() {
		return scroe;
	}

	public void setScroe(double scroe) {
		this.scroe = scroe;
	}

	public ArrayList<Title> getTitles() {
		return titles;
	}

	public void setTitles(ArrayList<Title> titles) {
		this.titles = titles;
	}

	public List<Xuanxiang> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Xuanxiang> answers) {
		this.answers = answers;
	}
}
