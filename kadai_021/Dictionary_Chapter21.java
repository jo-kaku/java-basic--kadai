package kadai_021;

import java.util.HashMap;
//親クラス
public class Dictionary_Chapter21 {

	private HashMap <String,String> dictionary = new HashMap <String,String>();//HashMapを宣言
		
	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();
		
		//英単語と意味を追加
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
		//繰り返し処理
	 public void search(String[] words) {
	        for (String word : words) {
	            if (dictionary.get(word) == null) {
	                System.out.println(word + "は辞書に存在しません");
	            } else {
	                System.out.println(word + "の意味は" + dictionary.get(word) + "です");
	            }
	        }
	    }
	}
