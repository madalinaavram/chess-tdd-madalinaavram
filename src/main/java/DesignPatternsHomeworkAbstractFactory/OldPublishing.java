package DesignPatternsHomeworkAbstractFactory;

public class OldPublishing implements PublishingHouse{

	public Book createBook(){
		return new OldBook();
	}

	public Dictionary createDictionary(){
		return new OldDictionary();
	}
}
