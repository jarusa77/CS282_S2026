
public class Stack 
{
	private int [] Data;
	private int Size;//represents number of elements
	private int MaxSize = 100;//represents  max  elements  allowed
	
	Stack()
	{
		Data = new int[MaxSize];
		Size=0;//is empty
	}
	
	public boolean push(int input)
	{
		if(Size < MaxSize)
		{
			Data[Size] = input;
			Size++;
			return true;//Success
		}
		
		return  false;//No Success
		
		
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			return  -99999;
		}
		
		return Data[--Size];
				
	}
	
	
	public int top()
	{
		int idx = Size-1;
		
		return Data[idx];
	}
	
	
	public  int  getSize()
	{
		return Size;
	}
	
	
	public boolean isEmpty()
	{
		if(Size==0)
			return true;
		
		return false;
	}
	
	

}
