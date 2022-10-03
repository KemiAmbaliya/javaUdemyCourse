package com.opps2.interfaces;
interface Flyable{
	void fly();
}
class Bird implements Flyable{

@Override
public void fly() {
	System.out.println("With Wings");
	
}
}
class Aeroplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("with fuel");
		
	}
	
}

public class InterfaceRunner {

	public static void main(String[] args) {
		Flyable[]flyingObjectsFlyables = {new Bird(), new Aeroplane()};
		for(Flyable object : flyingObjects) {
			object.fly();
		}

	}

}

