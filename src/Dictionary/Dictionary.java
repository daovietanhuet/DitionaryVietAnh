package Dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	private List<Word> listWord = new ArrayList<Word>();

	public List<Word> getListWord() {
		return listWord;
	}

	public void setListWord(List<Word> listWord) {
		this.listWord = listWord;
	}
	
	public void setListWordElement(Word word) {
		this.listWord.add(word);
	}
	
	public Word getListWordElement(int index) {
		return this.listWord.get(index);
	}
	
	public void removeListWordElement(int index) {
		listWord.remove(index);
	}
}
