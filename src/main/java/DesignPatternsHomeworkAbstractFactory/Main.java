package DesignPatternsHomeworkAbstractFactory;

public class Main {
	public static void main( String[] args ) {

		PublishingHouse latestPublishing = new LatestPublishing();

		Book latestBook = latestPublishing.createBook();
		Dictionary latestDictionary = latestPublishing.createDictionary();

		latestBook.read();
		latestDictionary.find();


		PublishingHouse oldPublish = new OldPublishing();

		Book oldBook = oldPublish.createBook();
		Dictionary oldDictionary = oldPublish.createDictionary();

		oldBook.read();
		oldDictionary.find();




	}
}
