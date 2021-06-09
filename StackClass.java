
public class StackClass {

final int Def_size = 10;	//default ȣ��� stack �迭 ũ��
	
	private int[] arData;	//stack ���� �迭
	private int size;		//�迭ũ��
	private int pos;		//�迭��ġ
	
	
	//1.default �ʱ�ȭ
	StackClass()	
	{
		size = Def_size;
		arData = new int[size];
		pos = -1;
	}
	
	
	//2.overloading �ʱ�ȭ	(����ڰ� stack size �� �����Ѵ�.)
	StackClass(int sz)	
	{
		size = sz;
		arData = new int[size];
		pos = -1;
	}

	
	//3.push �޼ҵ� ����
	public boolean push(int data)
	{
		if(pos == size)	//stack ������ data �� �������� push false
			return false;
		
		pos++;
		arData[pos] = data;	//stack ������ data push
		
		return true;
	}
	
	
	//4.pop �޼ҵ� ����
	public boolean pop()
	{
		if(pos < 0)	//stack ������ ������� pop false
			return false;
		
		arData[pos] = 0;	
		pos--;		//stack �������� data pop
		
		return true;
	}
	
	
	//5.stack data �� ��������.
	public boolean getStack(int[] ar)
	{
		if(pos < 0)
			return false;
		
		for(int i = 0; i < size; i++)
			ar[i] = arData[i];
		
		return true;
	}
	
	
	//6.data ���
	public void printS(int[] ar)
	{
		for(int i = 0; i < size; i++)
			System.out.print(ar[i] + " ");
	}
	
	
	
}




public class StackMain {

	public static void main(String[] args) {
		
		//1.����Ŭ������ �ν��Ͻ�ȭ �Ѵ�.
		int[] arStack = new int[10];	//stack ������ data�� ������ �迭
		StackClass sc = new StackClass();	//stack���� �ν��Ͻ�ȭ

		//2.stack ������ data �� push/pop �Ѵ�.
		sc.push(100);
		sc.push(200);
		sc.push(300);
		sc.push(400);
		sc.push(500);
		sc.push(600);
		
		sc.pop();
		sc.pop();
		
		sc.push(700);
		
		
		
		//3.stack data ����
		sc.getStack(arStack);
		
		//4.stack data ���
		sc.printS(arStack);
	
		
	}

}

