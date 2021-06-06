import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		//�Ǻ���ġ ������ �����Ѵ�.
		//0. ��ĳ�ʸ� �ν��Ͻ�ȭ�Ѵ�.
		Scanner scan = new Scanner(System.in);
		
		int range = scan.nextInt();			//range �Է��ϸ� �Ǻ���ġ�� ��µȴ�.
		
		int[] arFibo = new int[range];
		
		
		
		
		mFibo(arFibo, range);	
		printP(arFibo);
		
		

		
		
	}
	
	
	
	
	//1.�Ǻ���ġ �޼ҵ带 �����.
	public static boolean mFibo(int[] arF, int range)
	{
		int[] fbn = new int[range];;	//�Ǻ���ġ ������ �Է��� �迭 (ũ��� ���õǴ� ���������� �Ѵ�.)
		int table = 0;	//�Ǻ���ġ ������ �ӽ÷� ������ ���̺�
		fbn[0] = 1;		//0 �ε����� �ʱ�ȭ
		
		
		
		if(range < 3)		//������ 3 ���� ���� ��� �Ǻ���ġ�� ���� �Ұ��ϹǷ� false 
			return false;
		
		
		
		//2.�Ǻ���ġ ������ �����.
		else
		{
		
			
				for(int i = 0; i < range-1; i++)
				{
						if(i != 0)		//�ε��� 0 �� �ƴ϶�� ���Ұ��� �����.
						table = fbn[i-1];
						
						fbn[i+1] = table + fbn[i];	//���Ѵ�.
						
				}
				
				
					//3.�Ǻ���ġ ������ �����Ѵ�.
					for(int k = 0; k < range; k++)
						arF[k] = fbn[k];
					
					
					
		return true;
		
		}
		
		
	}
	
	
	
	
	//4.��� �޼ҵ带 �����.
	public static void printP(int[] ar)
	{
		
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		
	}
	
}
