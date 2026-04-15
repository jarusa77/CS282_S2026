
public class BST 
{
	private class Node
	{
		public Node Left=null;
		public Node Right=null;
		
		public int Key;
		
		public String data;
		
		public Node(int k,String d)
		{
			data=d;
			Key=k;
		}
	}
	
	private Node Root=null;
	private Node current; //iterator
	private Node parent;
	
	public void Add(int key,String data)
	{
		
		if(isEmpty())
		{
			Node temp = new Node(key,data);
			Root = temp;
			return;
		}
		
		AddNode(key,data,Root);
	}
	
	private void AddNode(int key, String data,Node root)
	{
		if(key < root.Key)
		{
			if(root.Left==null)
			{
				Node temp = new Node(key,data);
				root.Left=temp;
			}
			else
			{
				AddNode(key,data,root.Left);
			}
		}
		else //key>=root.key
		{
			if(root.Right==null)
			{
				Node temp = new Node(key,data);
				root.Right=temp;
			}
			else
			{
				AddNode(key,data,root.Right);
			}
		}
	}
	
	public void PrintTree()
	{
		if(isEmpty())
		{
			System.out.println("Empty Tree");
			return;
		}
		
		String str = PrintNodes(Root);
		System.out.println(str);
	}
	
	private String  PrintNodes(Node root)
	{
		if(root==null) return "";
		
		String str = String.format("%d", root.Key);
		
		str=str +","+PrintNodes(root.Left) + PrintNodes(root.Right);
		
		return str;
	}
	
	
	//Delete
	//FindNode
	public boolean isEmpty()
	{
		if(Root==null)
			return  true;
		
		return false;
	}

}
