import java.util.*;

public class �Ҽ��Ǻ� {

	public static void main(String[] args) {
		
		//�Ҽ��Ǻ�
		//���ͷ��� n �� �Է� ���� �� �Ҽ����� �ƴ��� �Ǻ��� �� �ִ� �ڵ�
		
		//1. �Ǻ��� n �������� �����.		(2~(n-1)�� ���ڷ� ���������� �ʴ� ���� �Ҽ� 2,3,4,5,6,7,8,9,10,11,12)
		/*
		Scanner scan = new Scanner(System.in);
		int isPrimeNum = scan.nextInt();
		
		
		int div = 2;
		
		boolean isExist = true;		//3.�Ҽ����� �Ǻ��� �� ������ �����.
		
		
		
		//2.�Ҽ��� �Ǻ��ϴ� ������ �����.
		for(int i = 0; i < isPrimeNum-2; i++)
		{
			
				if(0 == isPrimeNum % div)
				{
					isExist = false;	//0�� ������ �ռ���
					break;
				}
			
		}
		
		
		
				//���
				if(isExist == true)//true�� �Ҽ�
				{
					System.out.println(isPrimeNum + " ��(��) �Ҽ�.");
				}
				
				else
				{
					System.out.println(isPrimeNum + " ��(��) �ռ���.");
				}
	*/
		
		//���õǴ� ���� �ȿ��ִ� ��� �Ҽ��� �Ǻ��Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		
		//1. �Ҽ��� �Ǻ��� ������ �迭�� �����.
		boolean[] arPrimeNum = new boolean[Num];
		int div = 2;
		int value = 0;
		
		//2.�迭���� ��� ���� ������ ������.
		for(int i = 0; i < Num; i++)
		{
		arPrimeNum[i] = true;
					
		
					//3.�迭 ���� ��� ���� �Ǻ��Ѵ�.
					for(int k = 0; k < value-2; k++)
					{
						if(0 == value % div)	//false�� �ռ���
						{
							arPrimeNum[i] = false;
							break;
						}
						
						div++;
					}
					
					
					
					if(value <2)	//2���� ���� ���� ����
					{		arPrimeNum[i] = false;		}
					
					
					
				div = 2;
				value++;
		}
		
		
		//4.���
		for(int n = 0; n < arPrimeNum.length; n++)
		{
			if( arPrimeNum[n] == true )
			{
				System.out.println(n + " ��(��) �Ҽ��Դϴ�.");
			}
			
		}
		
		
		
		
	}

}
