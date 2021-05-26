
public class lotto01 {
public static void main(String[] args) {
		
		//로또번호를 생성하는 프로그램을 작성하시오.
		//1.임의의 수 1~50 을 만드는 식을 작성
		//2.6개의 배열을 만들 것
		//3.6개의 배열에 임의의 수를 저장.
		//4.임의의 수가 겹치지 않도록하는 식
		
		int ran;	//랜덤변수
		int[] ar = new int[6];	//로또번호 저장 배열
		
		boolean tf = true;	//중복체크 논리연산
		
		System.out.println("로또 번호");
		
		
			for	(int k = 0; k < ar.length; k++)	
			{
				//배열에 랜덤넘버 입력
				ran = (int)(Math.random() * 50) + 1;	//1~50 까지의 임의의 수 생성
				
				ar[k] = ran;	
				
				
				
					for(int i = 0 ;i < ar.length; i++)	
					{
						
						if(k != i)	
						{
							
								if(ar[k] == ar[i])	//겹치는수가 있으면 tf는 flase
								{	
									tf = false;
									break;
								}
						}
						
					}
				
					
				// 출력
				if(tf == true)	//겹치는 수가 없으면 출력
				{	
					
					System.out.println(ar[k]);
				}
				
				
				else	//겹치는 수가 있으면 해당 ar[k] 를 다시 돌린다.
				{	
					
					k = k - 1;
				}
				
				
				
				tf = true;
				
			}
		

	}

}
