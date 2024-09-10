package kadai_026;

import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter26 {
	public String getMyChoice() {
		System.out.println("自分のジャンケンの手を入力する");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		//出した手の取得		
		Scanner scanner = new Scanner(System.in);
		String myChoice = scanner.next();
		//出した手の判定		
		if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p") ) {	
		return myChoice;
		}  else {
			System.out.println("正しいジャンケンの手ではありません。再度手を選んでください");
			return getMyChoice();
		}
	}
	public String getRandom() {
		String[] hands = {"r","s","p"};
		
		int random = (int)Math.floor(Math.random()* hands.length);
		return hands[random];
	}
	public void playGame(String me, String you) {
		
	HashMap <String,String> jyanken = new HashMap <String,String>();//HashMapを宣言
	jyanken = new HashMap<>();
	
	jyanken.put("r","グー");
	jyanken.put("s","チョキ");
	jyanken.put("p","パー");
	
	System.out.println("自分の手は" + jyanken.get(me) + "対戦相手は" + jyanken.get(you));
	
	if(me.equals(you)) {
	System.out.println("あいこです");
	} else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p") ) || (me.equals("p") && you.equals("r"))) {
		} else {
			System.out.println("自分の負けです");
		}
}
	
	
}
