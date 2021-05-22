
public class saveReverseArray {

	public static void main(String[] args) {
		
		//11,13,33,77,5 의 수들을 배열에 차례대로 저장후 반대로 다시 저장한다.
		
		//1.저장할 배열과 반대로 저장할 배열을 만든다.
		int[] Array = new int[] {11, 13, 33, 77, 5};
		int[] arReverse = new int[Array.length];	//반대로 저장할 배열
		
		int rc = Array.length - 1;
		
		//2. 반대로 저장한다.
		for(int i = 0; i < Array.length; i++)
		{
			arReverse[rc] = Array[i];
			
			rc--;	//역카운트
		}
	
		
		//3.출력
		for(int i = 0; i < Array.length; i++)
			System.out.println(arReverse[i]);
		
		
		
	}

}
