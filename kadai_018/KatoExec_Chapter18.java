package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		taro.commonIntroduce();
		taro.eachIntroduce();
		System.out.println();
		
		ichiro.commonIntroduce();
		ichiro.eachIntroduce();
		System.out.println();
		
		hanako.commonIntroduce();
		hanako.eachIntroduce();
	}

}
