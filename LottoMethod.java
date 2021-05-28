
public class LottoMethod {

	public static void main(String[] args) {
		//�ζǹ�ȣ�� ����Ѵ�.
		
		//1. �ζǹ�ȣ�� ������ �迭�� �����Ѵ�.
		int[] arLotto = new int[6];
		
		boolean res = getLotto(arLotto);
		
		
		if( res == false )
			System.out.println("���α׷� ����");
		
		
		else
		{	
			System.out.println("�ζ� ��÷ ��ȣ");
		
			for(int i = 0; i < 6; i++)
			{
				
				System.out.print(arLotto[i] + " ");
			}
		}

	}

	
	
	
	//�ζǹ�ȣ�� �����ϴ� �޼ҵ�
	public static boolean getLotto(int[] ar)
	{
		int ranNum;	//1~45 ������ ������ ��
		boolean isExist = true;	//�ߺ����θ� �Ǻ��ϴ� ������
		int ind = 0;	//�迭�� �ε��� ��
		
		
		while( ind < 6 )
		{
			
			ranNum = (int)(Math.random() * 45) + 1;
			
				//�ߺ����� Ȯ��
				for(int i = 0; i < 6; i++)
				{
					if(ranNum == ar[i])		//�̹� �ִ� ���̸� false
						isExist = false;
					
				}
				
				
				//�ζǹ�ȣ ����
				if(isExist == true)	//�ߺ����� ���� �� �̹Ƿ� ����
				{
					ar[ind] = ranNum;
					ind++;
				}
				
				
			isExist = true;
		
		}
		
		
		return true;
		
	}
}
