
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
		
		String Middle = String.format("%d", root.Key);
		
		//Middle Left Right Pre-Order Notation
		String str=Middle +","+PrintNodes(root.Left) + PrintNodes(root.Right);
		
		String PostOrderStr = PrintNodes(root.Left) + PrintNodes(root.Right) + Middle + ", ";
				
		String InOrderStr = PrintNodes(root.Left)+ Middle +","+PrintNodes(root.Right);
		return InOrderStr;
	}
	
	
	public void Delete(int key)
	{
		if(isEmpty())
			return;
		
		if(!Find(key))
		{
			System.out.println("Key not Found!");
			return;
		}
		DeleteNode();
		
	}
	
	private void DeleteNode()
	{
		if(current==Root)
		{
			if(Root.Left==null && Root.Right==null)
				Root=null;
			else if(Root.Left==null)
				Root = Root.Right;
			else if(Root.Right==null)
				Root=Root.Left;
			else
			{
				Node RML = LeftMost(Root.Right);
				
				Root.Key = RML.Key;
				Root.data = RML.data;
				
				FindNode(Root.Right,Root.Key);
				DeleteNode();
				
			}
			return;
		}
		
		if(current.Left==null && current.Right==null)
		{
			if(parent.Left==current)
				parent.Left=null;
			else
				parent.Right=null;
		}
		else if(current.Left==null)//right child only
		{
			if(parent.Left==current)
				parent.Left=current.Right;
			else
				parent.Right=current.Right;
		}
		else if(current.Right==null)//left child only
		{
			if(parent.Left==current)
				parent.Left=current.Left;
			else
				parent.Right=current.Left;
		}
		else//Has both Left and Right Child
		{
			Node RML = LeftMost(current.Right);
			
			current.Key = RML.Key;
			current.data = RML.data;
			
			FindNode(current.Right,current.Key);
			DeleteNode();
		}
	}
	
	private Node LeftMost(Node root)
	{
		if(root.Left==null)
			return root;
		
		return LeftMost(root.Left);
	}
	
	//if found==true then current set to Key Node
	public boolean Find(int key)
	{
		current=null;
		parent=null;
		return FindNode(Root, key);
			
	}
	
	private boolean FindNode(Node root,int key)
	{
		if(root==null)return false;
		
		
		if(root.Key == key)
		{
			current=root;
			return true;
		}
		if(root.Key>key)
		{
			if(root.Left==null)
				return false;
			else
			{
				parent=root;
				return FindNode(root.Left,key);
			}
		}
		else//root.Key<=key
		{
			if(root.Right==null)
				return false;
			else
			{
				parent=root;
				return FindNode(root.Right,key);
			}
		}
		
	}
	
	
	public boolean isEmpty()
	{
		if(Root==null)
			return  true;
		
		return false;
	}

}
