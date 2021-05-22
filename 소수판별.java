import java.util.*;

public class 소수판별 {

	public static void main(String[] args) {
		
		//소수판별
		//리터럴값 n 을 입력 했을 때 소수인지 아닌지 판별할 수 있는 코드
		
		//1. 판별할 n 변수값을 만든다.		(2~(n-1)의 숫자로 나누어지지 않는 수는 소수 2,3,4,5,6,7,8,9,10,11,12)
		/*
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
	*/
		
		//제시되는 숫자 안에있는 모든 소수를 판별한다.
		
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		
		//1. 소수를 판별할 논리연산 배열을 만든다.
		boolean[] arPrimeNum = new boolean[Num];
		int div = 2;
		int value = 0;
		
		//2.배열안의 모든 수를 루프로 도린다.
		for(int i = 0; i < Num; i++)
		{
		arPrimeNum[i] = true;
					
		
					//3.배열 안의 모든 수를 판별한다.
					for(int k = 0; k < value-2; k++)
					{
						if(0 == value % div)	//false면 합성수
						{
							arPrimeNum[i] = false;
							break;
						}
						
						div++;
					}
					
					
					
					if(value <2)	//2보다 작은 수는 제외
					{		arPrimeNum[i] = false;		}
					
					
					
				div = 2;
				value++;
		}
		
		
		//4.출력
		for(int n = 0; n < arPrimeNum.length; n++)
		{
			if( arPrimeNum[n] == true )
			{
				System.out.println(n + " 은(는) 소수입니다.");
			}
			
		}
		
		
		
		
	}

}
