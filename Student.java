package com.cn.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * ѧ����
 * 
 * @author Administrator
 *
 */
public class Student {
	private String name;
	private String id;
	private double scroe;// ����
	private ArrayList<Title> titles;// ѧ������Ŀ
	private List<Xuanxiang> answers;// ѧ���Ĵ�

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
