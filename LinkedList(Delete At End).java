class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class LinkedList
{
	static Node head;

	void deleteAtEnd()
	{
		Node last = head;
		Node previousToLast = null;
		while(last.next!=null)
		{
			previousToLast = last;
			last = last.next;
		}
		previousToLast.next = null;
	}

	void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);

                list.deleteAtEnd();
		list.printList();
	}
}