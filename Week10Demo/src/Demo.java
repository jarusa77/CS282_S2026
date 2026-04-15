
public class Demo 
{

	public static void main(String[] args) 
	{
		BST t = new BST();
		t.PrintTree();
		t.Add(22, "Tacos");
		t.Add(19, "Burritos");
		t.Add(15, "Carnitas");
		
		t.PrintTree();

	}

}
