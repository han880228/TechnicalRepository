import java.util.*;

public class �Ҽ��Ǻ� {

	public static void main(String[] args) {
		
		//�Ҽ��Ǻ�
		//���ͷ��� n �� �Է� ���� �� �Ҽ����� �ƴ��� �Ǻ��� �� �ִ� �ڵ�
		
		//1. �Ǻ��� n �������� �����.		(2~(n-1)�� ���ڷ� ���������� �ʴ� ���� �Ҽ� 2,3,4,5,6,7,8,9,10,11,12)
		
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
				
		
		
	}

}
