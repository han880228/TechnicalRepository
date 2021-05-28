
public class LottoMethod {

	public static void main(String[] args) {
		//로또번호를 출력한다.
		
		//1. 로또번호를 저장할 배열을 생성한다.
		int[] arLotto = new int[6];
		
		boolean res = getLotto(arLotto);
		
		
		if( res == false )
			System.out.println("프로그램 오류");
		
		
		else
		{	
			System.out.println("로또 당첨 번호");
		
			for(int i = 0; i < 6; i++)
			{
				
				System.out.print(arLotto[i] + " ");
			}
		}

	}

	
	
	
	//로또번호를 저장하는 메소드
	public static boolean getLotto(int[] ar)
	{
		int ranNum;	//1~45 사이의 임의의 수
		boolean isExist = true;	//중복여부를 판별하는 논리연산
		int ind = 0;	//배열의 인덱스 값
		
		
		while( ind < 6 )
		{
			
			ranNum = (int)(Math.random() * 45) + 1;
			
				//중복여부 확인
				for(int i = 0; i < 6; i++)
				{
					if(ranNum == ar[i])		//이미 있는 값이면 false
						isExist = false;
					
				}
				
				
				//로또번호 저장
				if(isExist == true)	//중복되지 않은 수 이므로 저장
				{
					ar[ind] = ranNum;
					ind++;
				}
				
				
			isExist = true;
		
		}
		
		
		return true;
		
	}
}
