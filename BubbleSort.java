
public class BubbleSort {

	public static void main(String[] args) {
		//�־��� �迭 ���� ������ ���� ������� �迭�Ѵ�.
		
		//1.�迭�� �����.
		int[] arBB = new int[] {13, 52, 34, 67, 88, 5, 11};
		
		
		
		BubbleS(arBB);	//Bubblesort �� ���� �迭�� �����Ľ�Ų��.
		
		PrintBB(arBB);	//�迭�� ����Ѵ�.
		
		
		
	}

	
	
	//2.bubble sort �޼ҵ带 �����Ѵ�. 
	public static void BubbleS(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			for(int k = 0; k < ar.length-1; k++)
			{
				
				if(ar[k] > ar[k+1])		//�ε��� k ���� k+1�� ũ�� �����Ѵ�.
					swap(ar, k, k+1);
				
				
			}
		
	}
	
	
	
	//3.swap �޼ҵ带 �����.
	public static void swap(int[] ar, int a, int b)
	{
		int temp;	//������ ���� ������ ����
		
		temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	
	
	
	//4.��¸޼ҵ带 �����.
	public static void PrintBB(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		
	}
	
	
	
}
