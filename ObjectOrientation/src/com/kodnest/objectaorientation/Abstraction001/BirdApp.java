package com.kodnest.objectaorientation.Abstraction001;

public class BirdApp {
public static void main(String[] args) {
	PolyBird bird=new PolyBird();
	bird.CollectRef(new GoldenEagle());
	bird.CollectRef(new SurpantEagle());
	bird.CollectRef(new MountainEagle());
	
	bird.CollectRef(new VegSparrow());
	bird.CollectRef(new NonVegSparro());
}
}
