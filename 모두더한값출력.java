
public class 모두더한값출력 {

	public static void main(String[] args) {
		
		//1~100 까지의 합을 구하시오.
		
		
		// 1. 목표값 과 더하는 수 설정
		int Target = 100;
		int total = 0;
		int incNum = 1;
		
		//2. 루프를 돌려 더한다.
		for ( int i = 0; i < Target; i++)
		{
			
			total = total + incNum;
			
			incNum++;
		}
		
		//3. 출력
		System.out.println("total = " + total);
		
		
		
		
	}

}
