package DesignPatternsHomeworkAbstractFactory;

public class LatestBook implements Book {

	@Override
	public void read(){
		System.out.println("A new book has been released");
	}

}
