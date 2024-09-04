package kadai_018;

abstract public class Kato_Chapter18 {
	
	//フィールドの作成
	public String familyName = "加藤";//姓を表す
	public String givenName;//名を表す
	public String address = "東京都中野区○✕";//住所を表す
	
	//共通の紹介
	public void commonIntroduce () {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介
	abstract public void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}

	
	
}
