
public class FlaggedBubbleSort {

public static void main(String[] args) {
		
		//Flag 기법을 이용한 bubble sort 작성
		
		//1.sort 돌릴 배열 생성
		int[] arBB = new int[] {13, 55, 34, 47, 89, 24, 5, 18, 75, 4, 98};
		
		
		
		bubble(arBB);	//flagged bubble sort method
		
		
		
		//4.출력한다.
		for(int i = 0; i < arBB.length; i++)
			System.out.print(arBB[i] + " ");
		
	}



	//2.버블소트 메소드 생성
	public static void bubble(int[] ar)
	{
		int temp, flag = 0;
		
		while( flag == 0 )		//flag 가 0 이면 루프
		{
			flag++;
			
				for(int i = 0; i < ar.length-1; i++)
				{
					
					if(ar[i] > ar[i+1])	 //3.다음 배열 보다 크면 바꾼다.
					{
						temp = ar[i];
						ar[i] = ar[i+1];
						ar[i+1] = temp;
					
						flag = 0;		//swap 이 일어났다면 flag 는 0 이다.
					}
					
					
				}
			
			
		}
		
		
		
	}
	
	

}
