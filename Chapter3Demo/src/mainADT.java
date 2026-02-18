
public class mainADT {

	public static void main(String[] args) 
	{
		//int [] [] intArray = new int[10][10];
		
		LinkedList ll = new LinkedList();
		
		ll.AddNode(15);
		ll.AddNode(22);
		ll.AddNode(68);
		ll.AddNode(45);
		ll.AddNode(1);
		ll.AddNode(90);
		//ll.resetCurrent();
		
		//System.out.println(ll.getCurrent());
		
		//PrintList(ll);
		/*
		if(ll.findNode(5))
		{
			System.out.println(ll.getCurrent());
		}
		else
		{
			System.out.println("Node  not found");
		}
		*/
		
		PrintList(ll);
		
		ll.DeleteNode(45);
		
		System.out.println("----------");
		PrintList(ll);
		
		ll.DeleteNode(90);

		System.out.println("----------");
		PrintList(ll);
		
		ll.DeleteNode(15);
		
		System.out.println("----------");
		PrintList(ll);
	}
	
	public static void PrintList(LinkedList ll)
	{
		if(ll.isEmpty())
		{
			System.out.println("List is Empty");

		}
		else
		{
			ll.resetCurrent();
			do
			{
				System.out.println(ll.getCurrent());
			}while(ll.iterateNode());
				
		}
	}

}
