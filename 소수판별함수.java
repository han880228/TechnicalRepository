
public class �Ҽ��Ǻ��Լ� {

	public static void main(String[] args) {
		
		//�Ҽ��Ǻ� �Լ��� �����.
		//1.������ ���� �������� �Ҽ� �Ǻ��� ���� �� �迭�� �����.
		int Range = 50;
		
		boolean[] arPrimeNum = new boolean[Range];
		
		getPrime(arPrimeNum);
		
		for(int i = 0; i < Range; i++)
		{
			if(arPrimeNum[i] == true)
			System.out.println(i + " ��(��) �Ҽ��Դϴ�.");
		
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
