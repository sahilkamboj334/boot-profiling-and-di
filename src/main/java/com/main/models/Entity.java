package com.main.models;

public class Entity {

	private String data;
	public Entity() {
	}
	public Entity(String data) {
	this.data=data;
	}
	
	public void init() {
		System.out.println("Bean Created :"+data);
	}
	public void destroy() {
		System.out.println("Bean Destroyed :"+data);
	}
	@Override
	public String toString() {
		return data;
	}
}
