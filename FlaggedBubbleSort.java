
public class FlaggedBubbleSort {

public static void main(String[] args) {
		
		//Flag ����� �̿��� bubble sort �ۼ�
		
		//1.sort ���� �迭 ����
		int[] arBB = new int[] {13, 55, 34, 47, 89, 24, 5, 18, 75, 4, 98};
		
		
		
		bubble(arBB);	//flagged bubble sort method
		
		
		
		//4.����Ѵ�.
		for(int i = 0; i < arBB.length; i++)
			System.out.print(arBB[i] + " ");
		
	}



	//2.�����Ʈ �޼ҵ� ����
	public static void bubble(int[] ar)
	{
		int temp, flag = 0;
		
		while( flag == 0 )		//flag �� 0 �̸� ����
		{
			flag++;
			
				for(int i = 0; i < ar.length-1; i++)
				{
					
					if(ar[i] > ar[i+1])	 //3.���� �迭 ���� ũ�� �ٲ۴�.
					{
						temp = ar[i];
						ar[i] = ar[i+1];
						ar[i+1] = temp;
					
						flag = 0;		//swap �� �Ͼ�ٸ� flag �� 0 �̴�.
					}
					
					
				}
			
			
		}
		
		
		
	}
	
	

}
