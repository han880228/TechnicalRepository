
public class ū��ã�� {

	public static void main(String[] args) {
		
		//�־��� �� �� ���� ū ���� ã�´�.
		//1. ���� ������ �迭�� �����.
		
		int[] arCompareNum = new int[] {11,15,33,77,5, 99};
		
		int maxNum = arCompareNum[0];	//�ӽ� max��
		int maxIndex = 0;	//�ӽ� max index��
		
		//2.���� ū ���� �����Ѵ�.
		for(int i = 0; i < arCompareNum.length; i++)
		{
			if ( maxNum < arCompareNum[i])
			{
				maxNum = arCompareNum[i];
				maxIndex = i;
			}
			
		}
		
		
		//3.����Ѵ�.
		System.out.println(" ���� ū ���� " + maxNum + " �̴�.");
		System.out.println(" �ش� Index Num �� " + maxIndex + " �̴�.");
		
		

	}

}
