
public class saveReverseArray {

	public static void main(String[] args) {
		
		//11,13,33,77,5 �� ������ �迭�� ���ʴ�� ������ �ݴ�� �ٽ� �����Ѵ�.
		
		//1.������ �迭�� �ݴ�� ������ �迭�� �����.
		int[] Array = new int[] {11, 13, 33, 77, 5};
		int[] arReverse = new int[Array.length];	//�ݴ�� ������ �迭
		
		int rc = Array.length - 1;
		
		//2. �ݴ�� �����Ѵ�.
		for(int i = 0; i < Array.length; i++)
		{
			arReverse[rc] = Array[i];
			
			rc--;	//��ī��Ʈ
		}
	
		
		//3.���
		for(int i = 0; i < Array.length; i++)
			System.out.println(arReverse[i]);
		
		
		
	}

}
