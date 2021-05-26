
public class Lotto {

	public static void main(String[] args) {

		
		//로또번호를 생성하는 코드를 만든다.
		
		//1.로또를 저장할 배열과 임의의 수를 만든다.
		
		int[] Lotto = new int[6];
		int loNum;
		
		int Count = 0;
		boolean isExist = false;	
		
		
		while(Count < Lotto.length)
		{
		
			loNum = (int)(Math.random() * 45) + 1;
				
				for(int i = 0; i < Lotto.length; i++)
				{
						//2.중복되는 수가 있는지 확인한다.
						if( loNum == Lotto[i])	
						{
							isExist = true;	//같은 수가 있다면 true;
							break;
						}
					
				}
				
				//3.중복되지 않았다면 로또 배열에 저장한다.
				if( isExist == false )
				{
					Lotto[Count] = loNum;
					Count++;	//배열의 index 와 루프를 count 한다.
				}
		
				
			isExist = false;	
		}
		
		
		//4.출력
		System.out.println(" 로또 당첨 번호 ");
		
		for(int i = 0; i < 6; i++)
			System.out.print(Lotto[i] + "  ");
		

	}

}
