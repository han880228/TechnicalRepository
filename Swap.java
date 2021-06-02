
public class Swap {

	public static void main(String[] args) {
		
		//a와 b를 비교하고 swap 한다.
		
		//1. 변수 a와 b 를 define 한다.
		int a = 9;
		int b = 5;
		
		int temp;	//임의의 값을 저장할 변수
		
		
		//2. a 가 b 보다 크면 swap한다.
		if(a > b)	
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		//3.출력한다.
		System.out.println("a = " + a + " , b = " + b);
		
		
	}

	
}
