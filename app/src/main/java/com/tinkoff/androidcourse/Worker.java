package com.tinkoff.androidcourse;

public class Worker {
	public static String MALE = "male";
	public static String FEMALE = "female";

	private int id;
	private String name;
	private Integer photo;
	private String age;
	private String position;
	private String gender;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPhoto() {
		return photo;
	}


	public void setPhoto(Integer photo) {
		this.photo = photo;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
}
