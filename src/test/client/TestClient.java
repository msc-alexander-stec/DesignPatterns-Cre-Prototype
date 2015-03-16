package test.client;

import pkg.factory.CloneFactory;
import pkg.prototype.concrete.Sheep;

/*
 * See:
 * https://www.youtube.com/watch?v=AFbZhRL0Uz8
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		CloneFactory animalMaker = new CloneFactory();
		Sheep originSheep = new Sheep();
		Sheep clonedSheep = (Sheep) animalMaker.getClone(originSheep);

		System.out.println(originSheep);
		System.out.println(clonedSheep);
		System.out
				.println("Origin Hashcode: "
						+ System.identityHashCode(System
								.identityHashCode(originSheep)));
		System.out
				.println("Copy Hashcode: "
						+ System.identityHashCode(System
								.identityHashCode(clonedSheep)));

	}

}