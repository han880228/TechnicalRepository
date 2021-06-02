
public class BubbleSort {

	public static void main(String[] args) {
		//주어진 배열 안의 임의의 값을 순서대로 배열한다.
		
		//1.배열을 만든다.
		int[] arBB = new int[] {13, 52, 34, 67, 88, 5, 11};
		
		
		
		BubbleS(arBB);	//Bubblesort 를 통해 배열을 재정렬시킨다.
		
		PrintBB(arBB);	//배열을 출력한다.
		
		
		
	}

	
	
	//2.bubble sort 메소드를 생성한다. 
	public static void BubbleS(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			for(int k = 0; k < ar.length-1; k++)
			{
				
				if(ar[k] > ar[k+1])		//인덱스 k 보다 k+1이 크면 스왑한다.
					swap(ar, k, k+1);
				
				
			}
		
	}
	
	
	
	//3.swap 메소드를 만든다.
	public static void swap(int[] ar, int a, int b)
	{
		int temp;	//임의의 값을 저장할 변수
		
		temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	
	
	
	//4.출력메소드를 만든다.
	public static void PrintBB(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		
	}
	
	
	
}
