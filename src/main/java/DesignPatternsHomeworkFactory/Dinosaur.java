package DesignPatternsHomeworkFactory;

public class Dinosaur implements Toys {
	@Override
	public void create(){
		System.out.println("The Dino is singing and dancing");
	}
}
