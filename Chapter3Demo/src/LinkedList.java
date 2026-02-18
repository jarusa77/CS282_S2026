
public class LinkedList 
{
	//Node class
	public class Node
	{
		int data;
		Node  tail;
		
		Node(int d)
		{
			data=d;
			tail = null;
		}	
	}
	
	private Node Head=null;
	private Node Tail = null;
	private Node current = null;
	
	public void AddNode(int input)//adds Node to front of list
	{
		Node temp = new Node(input);
		temp.tail = Head;
		Head = temp;
		
		if(Tail==null)
			Tail=Head;
		
	}
	public void resetCurrent() //set Current to Head
	{
		current=Head;
	}

	public boolean isEmpty()
	{
		if(Head==null)
			return true;
		
		return  false;
	}
	
	public int getCurrent()
	{
		if(isEmpty())
			return -99999;
		
		return current.data;
	}
	
	//iterates current to next Node;
	public boolean iterateNode()
	{
		if(isEmpty()) return false;
		
		if(current.tail == null) return false;
		
		current = current.tail;
		return true;

	}

	public boolean findNode(int input)
	{
		if(isEmpty()) return false;
		
		resetCurrent();
		
		do
		{
			if(current.data == input)
				return true;
		}while(iterateNode());
		
		return  false;
	}
	
	
	
	public void DeleteNode(int input)
	{
		if(findNode(input))
		{
			if(current.tail!=null)
			{
				current.data = current.tail.data;
				current.tail = current.tail.tail;
			}
			else if(current == Head)//just the Head
			{
				Head=null;
				Tail=null;
				current=null;
			}
			else
			{
				//deleting last Node
				Node prev=Head;
				while(prev.tail!= current)
				{
					prev=prev.tail;
				}
				prev.tail=null;
				Tail=prev;
				current=prev;
			}
			
		}
	}
}
