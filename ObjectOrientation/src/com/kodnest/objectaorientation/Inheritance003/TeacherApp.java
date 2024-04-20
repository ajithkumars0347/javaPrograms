package com.kodnest.objectaorientation.Inheritance003;

public class TeacherApp {
public static void main(String[] args) {
	PhysicsTeacher physicsTeacher=new PhysicsTeacher();
	physicsTeacher.name="sophia";
	physicsTeacher.sub="physics";
	physicsTeacher.Do_exp();
	ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
	chemistryTeacher.name="varalakshmi";
	chemistryTeacher.sub="chmisty";
	chemistryTeacher.doChemExp(); 
	BiologyTeacher biologyTeacher=new BiologyTeacher();
	biologyTeacher.name="ramesh";
	biologyTeacher.sub="biology";
	biologyTeacher.doDisExp();
}
}
