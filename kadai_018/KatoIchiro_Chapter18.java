package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	public KatoIchiro_Chapter18() {
        setGivenName();
	}
	//名を表すフィールド
	public void setGivenName() {
		givenName = "一郎";
	}
	//特技・趣味を表す
	public void eachIntroduce () {
		System.out.println("好きな食べ物はリンゴです");
	} 

}
