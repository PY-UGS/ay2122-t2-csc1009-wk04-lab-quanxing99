
public class customStackApplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StackOfInteger stack001 = new StackOfInteger();
		
		
		for (int i =0; i < 10; i++) 
		{
			stack001.push(i);
		}
		
		
		while(!stack001.empty()) 
		{
			System.out.print(stack001.pop() + " ");
		}

	}

}
