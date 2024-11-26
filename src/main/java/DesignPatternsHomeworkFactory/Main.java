package DesignPatternsHomeworkFactory;

public class Main {
	public static void main( String[] args ) {
		Toys doll = ToysFactory.getToys( "Doll" );
		doll.create();

		Toys dinosaur = ToysFactory.getToys( "Dinosaur" );
		dinosaur.create();
	}
}
