package DesignPatternsHomeworkAbstractFactory;

public class OldBook implements Book {

	@Override
	public void read(){
		System.out.println("The old book is on the shelf");
	}
}
