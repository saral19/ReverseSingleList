
public class LinkList {
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;		//To make a temporary node
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void inserAtStart(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next = head;
		head = node;
	}
	public void insertAtAPos(int pos,int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		if(pos == 0)
		{
			inserAtStart(data);
		} 
		for(int i=0;i<pos-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	public void deleteStart()
	{
		Node n = head;
		head = n.next;
		n.next = null;
	}
	public void deleteEnd()
	{
		Node n = head;
		int index = count();
		for(int i=0;i<index-2;i++)
		{
			n = n.next;
		}
		n.next = null;
	}
	public void deleteAtPos(int pos)
	{
		Node n = head;
		Node n1 = null;
		for(int i=0;i<pos-1;i++)
		{
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
		
	}
	public int count()
	{
		Node n = head;
		int count = 0;
		while(n.next!=null)
		{
			count++;
			n = n.next;
		}
		count++;
		System.out.println("The total count is " + count);
		return count;
	}
	public void deleteList()
	{
		head = null;
		System.out.println("The list is empty now");
	}
	public void show()
	{
		Node n = head;
		while(n.next != null)
		{
			System.out.println("node data is " + n.data);
			n = n.next;			//To shift to next node
		}
		System.out.println("node data is " + n.data);
	}
	public void reverse()
	{
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
}
