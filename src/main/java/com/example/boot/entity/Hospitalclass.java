package com.example.boot.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospital records")
public class Hospitalclass {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private char gender;
	@Column(name = "age")
	private int age;
	private BigInteger mobile;
	private String Adress;
	private String problem;

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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public BigInteger getMobile() {
		return mobile;
	}
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	public int getAge() {
		return age;
	}
	public Hospitalclass(int age) {
		super();
		this.age = age;
	}
 
	@Override
	public String toString() {
		return "Hospitalclass [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", mobile="
				+ mobile + ", Adress=" + Adress + ", problem=" + problem + "]";
	}
	public Hospitalclass(int id, String name, char gender, BigInteger mobile, String adress, String problem) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.Adress = adress;
		this.problem = problem;
	}
	public Hospitalclass() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
