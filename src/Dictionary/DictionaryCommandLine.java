package Dictionary;

import java.util.List;
//import java.util.Scanner;

public class DictionaryCommandLine {
	DictionaryManagement dictionaryManagement = new DictionaryManagement();
	private List<Word> listNewWord;
	public void showAllWords() {
		listNewWord = dictionaryManagement.getDictionary().getListWord();
		System.out.println("No        |English             |Vietnamese         ");
		for (int i = 0; i < listNewWord.size(); i++) {
			System.out.format("%-10d%s%n",(i+1),listNewWord.get(i).toString());
		}
	}
	// phien_ban_1
	public void dictionatyBasic() {
		dictionaryManagement.insertFromCommandline();
		this.showAllWords();
	}
}
