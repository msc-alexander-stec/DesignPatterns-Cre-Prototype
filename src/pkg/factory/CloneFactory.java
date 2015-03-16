package pkg.factory;

import pkg.prototype.Animal;

public class CloneFactory {

	public Animal getClone(Animal animalSample) {

		return animalSample.makeCopy();

	}
}
