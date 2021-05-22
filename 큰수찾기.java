
public class 큰수찾기 {

	public static void main(String[] args) {
		
		//주어진 값 중 가장 큰 값을 찾는다.
		//1. 값을 저장한 배열을 만든다.
		
		int[] arCompareNum = new int[] {11,15,33,77,5, 99};
		
		int maxNum = arCompareNum[0];	//임시 max값
		int maxIndex = 0;	//임시 max index값
		
		//2.가장 큰 값을 저장한다.
		for(int i = 0; i < arCompareNum.length; i++)
		{
			if ( maxNum < arCompareNum[i])
			{
				maxNum = arCompareNum[i];
				maxIndex = i;
			}
			
		}
		
		
		//3.출력한다.
		System.out.println(" 가장 큰 값은 " + maxNum + " 이다.");
		System.out.println(" 해당 Index Num 는 " + maxIndex + " 이다.");
		
		

	}

}
