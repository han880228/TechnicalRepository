
public class StackClass {

final int Def_size = 10;	//default 호출시 stack 배열 크기
	
	private int[] arData;	//stack 구조 배열
	private int size;		//배열크기
	private int pos;		//배열위치
	
	
	//1.default 초기화
	StackClass()	
	{
		size = Def_size;
		arData = new int[size];
		pos = -1;
	}
	
	
	//2.overloading 초기화	(사용자가 stack size 를 설정한다.)
	StackClass(int sz)	
	{
		size = sz;
		arData = new int[size];
		pos = -1;
	}

	
	//3.push 메소드 생성
	public boolean push(int data)
	{
		if(pos == size)	//stack 구조에 data 가 가득차서 push false
			return false;
		
		pos++;
		arData[pos] = data;	//stack 구조에 data push
		
		return true;
	}
	
	
	//4.pop 메소드 생성
	public boolean pop()
	{
		if(pos < 0)	//stack 구조가 비었으니 pop false
			return false;
		
		arData[pos] = 0;	
		pos--;		//stack 구조에서 data pop
		
		return true;
	}
	
	
	//5.stack data 를 내보낸다.
	public boolean getStack(int[] ar)
	{
		if(pos < 0)
			return false;
		
		for(int i = 0; i < size; i++)
			ar[i] = arData[i];
		
		return true;
	}
	
	
	//6.data 출력
	public void printS(int[] ar)
	{
		for(int i = 0; i < size; i++)
			System.out.print(ar[i] + " ");
	}
	
	
	
}




public class StackMain {

	public static void main(String[] args) {
		
		//1.스택클래스를 인스턴스화 한다.
		int[] arStack = new int[10];	//stack 구조의 data를 저장할 배열
		StackClass sc = new StackClass();	//stack구조 인스턴스화

		//2.stack 구조에 data 를 push/pop 한다.
		sc.push(100);
		sc.push(200);
		sc.push(300);
		sc.push(400);
		sc.push(500);
		sc.push(600);
		
		sc.pop();
		sc.pop();
		
		sc.push(700);
		
		
		
		//3.stack data 저장
		sc.getStack(arStack);
		
		//4.stack data 출력
		sc.printS(arStack);
	
		
	}

}

