import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		//피보나치 수열을 구현한다.
		//0. 스캐너를 인스턴스화한다.
		Scanner scan = new Scanner(System.in);
		
		int range = scan.nextInt();			//range 입력하면 피보나치가 출력된다.
		
		int[] arFibo = new int[range];
		
		
		
		
		mFibo(arFibo, range);	
		printP(arFibo);
		
		

		
		
	}
	
	
	
	
	//1.피보나치 메소드를 만든다.
	public static boolean mFibo(int[] arF, int range)
	{
		int[] fbn = new int[range];;	//피보나치 수열을 입력할 배열 (크기는 제시되는 범위값으로 한다.)
		int table = 0;	//피보나치 수열을 임시로 저장할 테이블
		fbn[0] = 1;		//0 인덱스의 초기화
		
		
		
		if(range < 3)		//범위가 3 보다 작은 경우 피보나치가 성립 불가하므로 false 
			return false;
		
		
		
		//2.피보나치 수열을 만든다.
		else
		{
		
			
				for(int i = 0; i < range-1; i++)
				{
						if(i != 0)		//인덱스 0 이 아니라면 더할값을 만든다.
						table = fbn[i-1];
						
						fbn[i+1] = table + fbn[i];	//더한다.
						
				}
				
				
					//3.피보나치 수열을 저장한다.
					for(int k = 0; k < range; k++)
						arF[k] = fbn[k];
					
					
					
		return true;
		
		}
		
		
	}
	
	
	
	
	//4.출력 메소드를 만든다.
	public static void printP(int[] ar)
	{
		
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		
	}
	
}
