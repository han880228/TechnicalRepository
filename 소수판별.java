import java.util.*;

public class 소수판별 {

	public static void main(String[] args) {
		
		//소수판별
		//리터럴값 n 을 입력 했을 때 소수인지 아닌지 판별할 수 있는 코드
		
		//1. 판별할 n 변수값을 만든다.		(2~(n-1)의 숫자로 나누어지지 않는 수는 소수 2,3,4,5,6,7,8,9,10,11,12)
		
		Scanner scan = new Scanner(System.in);
		int isPrimeNum = scan.nextInt();
		
		
		int div = 2;
		
		boolean isExist = true;		//3.소수인지 판별할 논리 연산을 만든다.
		
		
		
		//2.소수를 판별하는 루프를 만든다.
		for(int i = 0; i < isPrimeNum-2; i++)
		{
			
				if(0 == isPrimeNum % div)
				{
					isExist = false;	//0이 나오면 합성수
					break;
				}
			
		}
		
		
		
				//출력
				if(isExist == true)//true면 소수
				{
					System.out.println(isPrimeNum + " 은(는) 소수.");
				}
				
				else
				{
					System.out.println(isPrimeNum + " 은(는) 합성수.");
				}
				
		
		
	}

}
