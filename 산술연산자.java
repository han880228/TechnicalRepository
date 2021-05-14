
public class 산술연산자 {

	public static void main(String[] args) {
		
	/*	int a = 5;
		int b = 6;
		int result1 = a + b;
		
		System.out.println("result = " + result1);
		
		float c = 1.7f;
		float d = 2.3f;
		float result2 = c * d;
		
		System.out.println("result = " + result2);
		
		double e = 31.0;
		double f = 4.0;
		double result3 = e / f;
		
		System.out.println("result = " + result3);
		
		int g = 26;
		int h = 3;
		int result4 = g % h;
		
		System.out.println("result = " + result4);		*/

	//// 함수화
		
		int a = 12;
		int b = 32;
		int res = add1(a,b);
		
		System.out.println("result = " + res);
	}
	
		
	public static int add1 (int a, int b)
	{
		int result;
		
		result = a + b;
		
		return result;
	}
		
		
		
	

}
