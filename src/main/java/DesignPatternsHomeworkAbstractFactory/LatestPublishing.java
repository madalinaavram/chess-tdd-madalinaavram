package DesignPatternsHomeworkAbstractFactory;

public class LatestPublishing implements PublishingHouse{

	public Book createBook(){
		return  new LatestBook();
	}

	public Dictionary createDictionary(){
		return new LatestDictionary();
	}
}
