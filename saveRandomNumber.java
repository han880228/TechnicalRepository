
public class saveRandomNumber {

	public static void main(String[] args) {
		//�־��� �������� �����Ǽ��� �����ϰ�, ���Ե��� ���� ���ڸ� �Ǵ��Ѵ�.
		
		//1.������ �� �迭��, ������ �迭�� �����.
		
		
		int arNum = 50;	//���� �迭 ����
		int RanRange = 12;	//�����Ǽ� ����
		
		int[] arSaveRanNum = new int[arNum];	//�����ѹ��� ������ �迭
		
		boolean[] isExist = new boolean[RanRange + 1];	
		
		int value;
		int Random;
		int Count = 0;
		
		for(int k = 0; k < isExist.length; k++)
			isExist[k] = false;
		
		
				
				//2.�����Ǽ��� ����
				for(int i = 0; i < arSaveRanNum.length; i++)
				{
					Random = (int)( Math.random()  *  ( RanRange + 1 ) );
					
					arSaveRanNum[i] = Random;
					
				}
				
				
				//3.����� �����Ǽ� Ȯ��
				for(int v = 0; v < arSaveRanNum.length; v++)
				{
					value = arSaveRanNum[v];
					
					isExist[value] = true;	//����ȼ��� true
				}
				
				
				
				
				//4.������� ���� �� ���
				for(int a = 0; a < isExist.length; a++)
				{
					
					if(isExist[a] == false)		//false�� ������� ���� ��
					{
						System.out.println(a + "�� ������� ���� �� �Դϴ�.");
						Count++;	//ī��Ʈ�Ǹ� ������� ���� ���� �ִ� ���̴�.
					}
					
				}
		
				if( Count == 0 )	//��� ����Ǹ� Count == 0
					System.out.println("��� ������ ���� ����Ǿ����ϴ�.");
				
				
	}

}
