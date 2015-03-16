package pkg.prototype.concrete;

import pkg.prototype.Animal;

public class Sheep implements Animal {

	//
	// Constructor
	//
	
	public Sheep() {
		
		System.out.println("Sheep is Made");
	}
	
	//
	// Interface Implementation
	//
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Sheep Copy is in Work");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheepObject;
	}

	//public String toString() {
	//	return "Dolly is my Hero, Baaaaa";
	//}
	
}