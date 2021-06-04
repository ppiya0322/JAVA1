
public class Variable {

	public static void main(String[] args) {
		
//		a = 1; <ㅡ 다른 언어들은 이렇게 변수를 지정해도 되지만 Java에서는 데이터타입을 지정해줘야 함
		int a = 1; // Number이지만 동시에 Integer(정수)이다. (정수: ...,-1,0,+1,...)
		System.out.println(a);
		
//		int b = 1.1; <ㅡ 1.1은 Real number(실수)라서 오류발생
		double b = 1.1; //실수를 Java에선 double이라고 표시함.
		System.out.println(b);
		
		String c = "Hello World";
		System.out.println(c);
//		데이터타입을 꼭 지정해야 하는 이유는 
//		우리가 지나가다가 2가지 병에 담긴 물을 
//		마셔야 할 경우 표기가 있는 물을 마시겠는가? 
//		표기도 없는 물을 마시겠는가?

	}

}
