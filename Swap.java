
public class Swap {

	public static void main(String[] args) {
		
		//a�� b�� ���ϰ� swap �Ѵ�.
		
		//1. ���� a�� b �� define �Ѵ�.
		int a = 9;
		int b = 5;
		
		int temp;	//������ ���� ������ ����
		
		
		//2. a �� b ���� ũ�� swap�Ѵ�.
		if(a > b)	
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		//3.����Ѵ�.
		System.out.println("a = " + a + " , b = " + b);
		
		
	}

	
}
