import src.Node;

public class linkedlist {
	private Node head;
	private int count;
	public LinkedList()
	{
		head = null;
		count = 0;
	}
	public Node get(int index) throws Exception
	{
		if(index < 0 || index > this.length()-1)
		{
			throw new Exception("Exception out of bounds:" + index);
		}
		
		else
		{
			Node nodeToReturn = head;
			for(int i=0; i < index; i++)
			{
				nodeToReturn = nodeToReturn.getNextNode();
			}
			return nodeToReturn;
		}
	}
	public Node removeFirst()
	{
		if(head == null)
		{
			return head;
		}
		Node nodeToReturn = head;
		head = head.getNextNode();
		nodeToReturn.setNextNode(null);
		count--;
		return nodeToReturn;
	}
	public Node removeLast()
	{
		Node nodeToReturn = head;
		if(head == null) 
		{
			return head;
		}
		else if(head.getNextNode() == null)
		{
			head = null;
		}
		else
		{
			while(nodeToReturn.getNextNode() != null)
			{
				nodeToReturn = nodeToReturn.getNextNode();
			}
			Node currNode = head;
			while(currNode.getNextNode() != nodeToReturn)
			{
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(null);
		}
		count--;
		return nodeToReturn;
	}
	public void addFirst(int value)
	{
		Node n = new Node(value);
		if(head == null)
		{
			head = n;
		}
		else
		{
			n.setNextNode(head);
			head = n;
		}
		count++;
	}
	public int length()
	{
		return this.count;
	}
	public Node deleteAtIndex(int index) throws Exception
	{
		if(index < 0 || index > this.length()-1)
		{
			throw new Exception("Exception out of bounds:" + index);
		}
		else if(index == 0)
		{
			return this.removeFirst();
		}
		else if(index == this.length()-1)
		{
			return this.removeLast();
		}
		else
		{
			Node nodeToReturn = head;
			for(int i=0; i < index; i++)
			{
				nodeToReturn = nodeToReturn.getNextNode();
			}
			Node pNode =head;
			while(pNode.getNextNode() != nodeToReturn)
			{
				pNode = pNode.getNextNode();
			}
			pNode.setNextNode(nodeToReturn.getNextNode());
			nodeToReturn.setNextNode(null);
			count--;
			return nodeToReturn;
		}
	}
	public void addAtIndex(int value, int index) throws Exception
	{
		if(index < 0 || index > this.length())
		{
			throw new Exception("Exception out of bounds:" + index);
		}
		else if(index == 0)
		{
			this.addFirst(value);
		}
		else if(index == this.length())
		{
			this.addLast(value);
		}
		else
		{
			Node n = new Node(value);
			Node currNode = head;
			for(int i=0; i < index; i++)
			{
				currNode = currNode.getNextNode();
			}
			n.setNextNode(currNode);
			Node pNode =head;
			while(pNode.getNextNode() != currNode)
			{
				pNode = pNode.getNextNode();
			}
			pNode.setNextNode(n);
			count++;
		}
	}
	public void addLast(int value)
	{
		if(head == null)
		{
			this.addFirst(value);
		}
		else
		{
			Node n = new Node(value);
			Node currNode = head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(n);
			count++;
		}
	}
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node currNode = head;
			while(currNode != null)
			{
				System.out.print(currNode.getPayload() + " -> ");
				currNode = currNode.getNextNode();
			}
			System.out.println("null");
		}
	}
}
