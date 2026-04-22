
public class Demo 
{

	public static void main(String[] args) 
	{
		BST t = new BST();
		t.PrintTree();
		t.Add(22, "Tacos");
		t.Add(19, "Burritos");
		t.Add(15, "Carnitas");
		t.Add(13, "Burgers");
		t.Add(16, "Spaghetti");
		t.Add(32, "Fries");
		t.PrintTree();
		
		t.Delete(32);
		
		t.PrintTree();

	}

}
