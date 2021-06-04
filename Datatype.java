public class Datatype{
	public static void main(String[] args) {
		System.out.println(6); //Number
		System.out.println("six"); //String ""큰 따옴표로 묶이면 문자열로 처리함.
		
		System.out.println("6"); //String 6
		
		System.out.println(6+6); //12
		System.out.println("6"+"6"); //String 66
		
		System.out.println(6*6); //36
//		System.out.println("6"*"6"); 에러발생: 문자열끼리 곱연산이 불가능
		
		System.out.println("1111".length()); // 4
//		System.out.println(1111.length()); 에러발생: 숫자의 갯수를 셀 수 없다.
		
	}
}