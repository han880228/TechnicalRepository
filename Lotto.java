
public class Lotto {

	public static void main(String[] args) {

		
		//�ζǹ�ȣ�� �����ϴ� �ڵ带 �����.
		
		//1.�ζǸ� ������ �迭�� ������ ���� �����.
		
		int[] Lotto = new int[6];
		int loNum;
		
		int Count = 0;
		boolean isExist = false;	
		
		
		while(Count < Lotto.length)
		{
		
			loNum = (int)(Math.random() * 45) + 1;
				
				for(int i = 0; i < Lotto.length; i++)
				{
						//2.�ߺ��Ǵ� ���� �ִ��� Ȯ���Ѵ�.
						if( loNum == Lotto[i])	
						{
							isExist = true;	//���� ���� �ִٸ� true;
							break;
						}
					
				}
				
				//3.�ߺ����� �ʾҴٸ� �ζ� �迭�� �����Ѵ�.
				if( isExist == false )
				{
					Lotto[Count] = loNum;
					Count++;	//�迭�� index �� ������ count �Ѵ�.
				}
		
				
			isExist = false;	
		}
		
		
		//4.���
		System.out.println(" �ζ� ��÷ ��ȣ ");
		
		for(int i = 0; i < 6; i++)
			System.out.print(Lotto[i] + "  ");
		

	}

}
