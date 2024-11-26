package DesignPatternsHomeworkAbstractFactory;

import DesignPatternsHomeworkFactory.Dinosaur;
import DesignPatternsHomeworkFactory.Doll;
import DesignPatternsHomeworkFactory.Toys;

public class Library {

	public static Book getBooks(String bookType){
		if (bookType == null){
			return null;
		}
		if (bookType.equalsIgnoreCase( "LatestBook" )){
			return new LatestBook();
		} else if ( bookType.equalsIgnoreCase( "OldBook" ) ) {
			return new OldBook();
		}
		return null;
	}

	public static Dictionary getDictionaries(String dictionaryType){
		if (dictionaryType == null){
			return null;
		}
		if (dictionaryType.equalsIgnoreCase( "LatestDictionary" )){
			return new LatestDictionary();
		} else if ( dictionaryType.equalsIgnoreCase( "OldDictionary" ) ) {
			return new OldDictionary();
		}
		return null;
	}
}
