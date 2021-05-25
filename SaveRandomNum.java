
public class SaveRandomNum {

	public static void main(String[] args) {

		//0~12사이의 임의의 수를 배열에 순서대로 저장 후 모든 수가 저장되었는지 판별한다.
		
		//1.랜덤 변수와 저장 배열을 만든다.
		
		
		int[] arSaveRan = new int[50];	//저장 배열
		int ranRange = 12;	//임의의 수 범위
		
		int compNum = 0;	//비교하는 값
		int randomNum;		//랜덤값
		
		int Count = 0;
		boolean isExist = false;
		
		//2.임의의 수를 배열에 저장한다.
		for(int i = 0; i < arSaveRan.length; i++)
		{
			
			randomNum = (int)( Math.random()  *  (ranRange+1) ) ;
			arSaveRan[i] = randomNum;
		}
		
		
		
		//3. 0~12의 수가 모두 저장되었는지 확인한다.
		for(int k = 0; k < ranRange+1; k++)
		{
			
			for(int n = 0; n < arSaveRan.length; n++)
			{
				if( compNum == arSaveRan[n])
				{
					isExist = true;		//해당수가 있으면 true
					break;
				}
				
			}
			
			if( isExist == false)	//isExist false 는 없는 수가 있다는 것이므로 카운트를 센다.
			{		Count++;		}
			
			
			isExist = false;
			compNum++;
		}
		
		
		//4.출력
		if( Count != 0 )
		{
			System.out.println("0~12 중 저장되지 않은 수가 있다.");
			System.out.println(Count + "개의 수가 저장되지 않았습니다.");
		}
		
		else
			System.out.println("0~12 모든 수가 저장되었다.");
		
		

	}

}
