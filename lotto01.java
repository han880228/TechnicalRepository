
public class lotto01 {
public static void main(String[] args) {
		
		//�ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//1.������ �� 1~50 �� ����� ���� �ۼ�
		//2.6���� �迭�� ���� ��
		//3.6���� �迭�� ������ ���� ����.
		//4.������ ���� ��ġ�� �ʵ����ϴ� ��
		
		int ran;	//��������
		int[] ar = new int[6];	//�ζǹ�ȣ ���� �迭
		
		boolean tf = true;	//�ߺ�üũ ������
		
		System.out.println("�ζ� ��ȣ");
		
		
			for	(int k = 0; k < ar.length; k++)	
			{
				//�迭�� �����ѹ� �Է�
				ran = (int)(Math.random() * 50) + 1;	//1~50 ������ ������ �� ����
				
				ar[k] = ran;	
				
				
				
					for(int i = 0 ;i < ar.length; i++)	
					{
						
						if(k != i)	
						{
							
								if(ar[k] == ar[i])	//��ġ�¼��� ������ tf�� flase
								{	
									tf = false;
									break;
								}
						}
						
					}
				
					
				// ���
				if(tf == true)	//��ġ�� ���� ������ ���
				{	
					
					System.out.println(ar[k]);
				}
				
				
				else	//��ġ�� ���� ������ �ش� ar[k] �� �ٽ� ������.
				{	
					
					k = k - 1;
				}
				
				
				
				tf = true;
				
			}
		

	}

}
