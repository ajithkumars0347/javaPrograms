package com.kodnest.objectsType.Program001;

public class StudentObj {
	int id;
	String name;
	int mark;
	public StudentObj(int id, String name, int mark){
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	
	void study() {
		System.out.println(name+" studying");
	}
	
}

