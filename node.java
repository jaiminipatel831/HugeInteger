import src.Node;

public class node {
	private int payload;
	private Node nextNode;
	
	public Node(int payload)
	{
		this.payload = payload;
		this.nextNode = null;
	}
	public void setNextNode(Node n)
	{
		this.nextNode = n;
	}
	public Node getNextNode()
	{
		return this.nextNode;
	}
	public int getPayload()
	{
		return this.payload;
	}
	public void display()
	{
		System.out.println(this.payload);
	}
}
