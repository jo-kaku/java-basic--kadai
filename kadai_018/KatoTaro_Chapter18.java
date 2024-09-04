package kadai_018;
//子クラス
public class  KatoTaro_Chapter18 extends Kato_Chapter18 { 
	
	//コンストラクタで名前を設定
	public KatoTaro_Chapter18() {
        setGivenName();
	}
	
	//名を表すフィールド
	public void setGivenName() {
		givenName = "太郎";
	}
	//特技・趣味を表す
	public void eachIntroduce () {
		System.out.println("Javaが得意です");
	}
}
