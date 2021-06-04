
public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World"); // ""안에는 String 문자열
		System.out.println('H'); // ''안에는 Character 문자: 한 글자를 나타냄
		System.out.println("H"); // "H" 문자열
		
		System.out.println("Hello"
				+ "World");
		System.out.println("Hello \nWorld"); //\n: 줄 바꿈(주의사항: 역슬래시)
		System.out.println("Hello \"World\""); // Hello "World"
		//escape: \뒤에 오는 것에 역할을 탈출시켜서 "를 표시할 수 있게 됨.

	}

}
