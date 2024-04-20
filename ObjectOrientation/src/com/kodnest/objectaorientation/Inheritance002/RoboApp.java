package com.kodnest.objectaorientation.Inheritance002;

public class RoboApp {
	public static void main(String[] args) {
TeacherRobo teacherRobo=new TeacherRobo();
teacherRobo.name="chitti";
teacherRobo.teach();
ChefRobo chefRobo=new ChefRobo();
chefRobo.name="amy";
chefRobo.cooking();
DriverRobo driverRobo=new DriverRobo();
driverRobo.name="arno";
driverRobo.drive();
}
}