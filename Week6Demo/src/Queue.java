
public class Queue 
{
	private int [] Data;
	private int Size;//represents number of elements
	private int MaxSize = 100;//represents  max  elements  allowed
	private int First;
	
	Queue()
	{
		Data = new int[MaxSize];
		Size=0;
		First = 0;
	}
	
	public boolean Enqueue(int input)
	{
		if(Size>=MaxSize) return false;

		int idx = (First + Size)%MaxSize;
		Data[idx] = input;
		Size++;
		return true;
	}
	
	public int Dequeue()
	{
		if(isEmpty()) return -99999;
		//System.out.println("Debug A" +First);

		int temp = Data[First];
		First = (++First) % MaxSize;
		Size--;
		
		return temp;
		
	}
	
	public int getFirst()
	{
		if(isEmpty()) return -999999;
		
		return Data[First];
	}
	
	public int getSize()
	{
		return Size;
	}
	
	public boolean isEmpty()
	{
		if(Size == 0)
			return  true;
		
		return false;
	}
	
	public void PrintList()
	{
		for(int item : Data)
		{
			if(item==0)
				break;
				
			System.out.println(item);
		}
	}
	
	
}
