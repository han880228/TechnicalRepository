
public class 소수판별함수 {

	public static void main(String[] args) {
		
		//소수판별 함수를 만든다.
		//1.범위를 위한 변수값과 소수 판별을 위한 논리 배열을 만든다.
		int Range = 50;
		
		boolean[] arPrimeNum = new boolean[Range];
		
		getPrime(arPrimeNum);
		
		for(int i = 0; i < Range; i++)
		{
			if(arPrimeNum[i] == true)
			System.out.println(i + " 은(는) 소수입니다.");
		
		}
		

	}
	
	
	
	

	
	
	public static void getPrime(boolean[] arPrimeNum)
	{
		int div = 2;
		int value = 0;
		
		for(int i = 0; i < arPrimeNum.length; i++)
		{
			arPrimeNum[i] = true;
			
				for(int k = 0; k < value-2; k++)
				{
					
						if( 0 == value % div )
						{
							arPrimeNum[i] = false;
							break;
						}
					div++;
				}
			
				if(value < 2)
					arPrimeNum[i] = false;
				
				
			div = 2;
			value++;
		}
		
		
		
	}
	
	
}
