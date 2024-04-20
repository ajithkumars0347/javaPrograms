package com.kodnest.objectaorientation.finalAndThisAndsuper;

public class VehicleApp {
public static void main(String[] args) {
	final int a=3478;
	//a=43; error
	Vehicle vehicle=new Vehicle();
	vehicle.move();
    Bike bike=new Bike();
    bike.move();
    R15 r15=new R15();
    r15.move();
    Pulser120 ref = new Pulser220();
    ref.withoutStatic();
    ref.staticCheck();
    ((Pulser220)(ref)).staticCheck();
    
}
}
