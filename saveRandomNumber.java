
public class saveRandomNumber {

	public static void main(String[] args) {
		//주어진 범위내에 임의의수를 저장하고, 포함되지 않은 숫자를 판단한다.
		
		//1.임의의 수 배열과, 논리연산 배열을 만든다.
		
		
		int arNum = 50;	//저장 배열 범위
		int RanRange = 12;	//임의의수 범위
		
		int[] arSaveRanNum = new int[arNum];	//랜덤넘버를 저장할 배열
		
		boolean[] isExist = new boolean[RanRange + 1];	
		
		int value;
		int Random;
		int Count = 0;
		
		for(int k = 0; k < isExist.length; k++)
			isExist[k] = false;
		
		
				
				//2.임의의수를 저장
				for(int i = 0; i < arSaveRanNum.length; i++)
				{
					Random = (int)( Math.random()  *  ( RanRange + 1 ) );
					
					arSaveRanNum[i] = Random;
					
				}
				
				
				//3.저장된 임의의수 확인
				for(int v = 0; v < arSaveRanNum.length; v++)
				{
					value = arSaveRanNum[v];
					
					isExist[value] = true;	//저장된수는 true
				}
				
				
				
				
				//4.저장되지 않은 수 출력
				for(int a = 0; a < isExist.length; a++)
				{
					
					if(isExist[a] == false)		//false는 저장되지 않은 수
					{
						System.out.println(a + "는 저장되지 않은 수 입니다.");
						Count++;	//카운트되면 저장되지 않은 값이 있는 것이다.
					}
					
				}
		
				if( Count == 0 )	//모두 저장되면 Count == 0
					System.out.println("모든 임의의 수가 저장되었습니다.");
				
				
	}

}
