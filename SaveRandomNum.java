
public class SaveRandomNum {

	public static void main(String[] args) {

		//0~12������ ������ ���� �迭�� ������� ���� �� ��� ���� ����Ǿ����� �Ǻ��Ѵ�.
		
		//1.���� ������ ���� �迭�� �����.
		
		
		int[] arSaveRan = new int[50];	//���� �迭
		int ranRange = 12;	//������ �� ����
		
		int compNum = 0;	//���ϴ� ��
		int randomNum;		//������
		
		int Count = 0;
		boolean isExist = false;
		
		//2.������ ���� �迭�� �����Ѵ�.
		for(int i = 0; i < arSaveRan.length; i++)
		{
			
			randomNum = (int)( Math.random()  *  (ranRange+1) ) ;
			arSaveRan[i] = randomNum;
		}
		
		
		
		//3. 0~12�� ���� ��� ����Ǿ����� Ȯ���Ѵ�.
		for(int k = 0; k < ranRange+1; k++)
		{
			
			for(int n = 0; n < arSaveRan.length; n++)
			{
				if( compNum == arSaveRan[n])
				{
					isExist = true;		//�ش���� ������ true
					break;
				}
				
			}
			
			if( isExist == false)	//isExist false �� ���� ���� �ִٴ� ���̹Ƿ� ī��Ʈ�� ����.
			{		Count++;		}
			
			
			isExist = false;
			compNum++;
		}
		
		
		//4.���
		if( Count != 0 )
		{
			System.out.println("0~12 �� ������� ���� ���� �ִ�.");
			System.out.println(Count + "���� ���� ������� �ʾҽ��ϴ�.");
		}
		
		else
			System.out.println("0~12 ��� ���� ����Ǿ���.");
		
		

	}

}
