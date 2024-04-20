package com.kodnest.objectaorientation.Encapsulation003;

public class DogApp {
public static void main(String[] args) {
	Dog dog = new Dog("rockey","brown",3,"normal");
	System.out.println(dog.getName()+" "+dog.getcolor()+" "+dog.getAge()+" "+dog.getBreed());
}
}
