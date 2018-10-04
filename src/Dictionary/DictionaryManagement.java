package Dictionary;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {
	
	private Dictionary dictionary = new Dictionary();
	
	//phien_ban_1
	public void insertFromCommandline(){
		int soLuong = 0;
		Word newWord;
		String word_target;
		String word_explain;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Phần mềm Dictionary 1.0 Phiên bản 1 bởi APD-UET-Team");
		System.out.println("| Xin mời nhập số lượng từ vựng: ");
		soLuong = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < soLuong; i++) {
			System.out.println("| Từ vựng: ");
			word_target = scanner.nextLine();
			System.out.println("| Gỉai nghĩa: ");
			word_explain = scanner.nextLine();
			newWord = new Word(word_target, word_explain);
			dictionary.setListWordElement(newWord);
		}
		scanner.close();
	}
	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
}
