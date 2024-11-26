package DesignPatternsHomeworkFactory;

public class ToysFactory {
	public static Toys getToys(String toysType){
		if (toysType == null){
			return null;
		}
		if (toysType.equalsIgnoreCase( "Doll" )){
			return new Doll();
		} else if ( toysType.equalsIgnoreCase( "Dinosaur" ) ) {
			return new Dinosaur();
		}
		return null;
	}

}
