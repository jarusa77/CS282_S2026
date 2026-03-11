
public class main {

	public static void main(String[] args) 
	{
		
		System.out.println("-----Stack-----");

		Stack st=new Stack();
		
		st.push(9);
		st.push(99);
		st.push(22);
		System.out.println("Size: " + st.getSize());

		System.out.println(st.top());
		System.out.println("Size: " + st.getSize());

		System.out.println(st.pop());
		System.out.println("Size: " + st.getSize());

		System.out.println(st.pop());
		System.out.println(st.top());

		System.out.println("-----Queue-----");
		
		Queue q = new Queue();
		
		q.Enqueue(15);
		q.Enqueue(32);
		q.Enqueue(56);
		System.out.println(q.getSize());
		System.out.println(q.getFirst());
		System.out.println(q.getSize());
		System.out.println(q.Dequeue());
		System.out.println(q.getSize());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());



		

	}

}
