import java.io.*;
import java.util.*;
 
class Node
{
	int item;
	int count;
	Node parent;
	Node next;
	ArrayList<Node> children = new ArrayList<Node>();

	public int GetItem()
	{
		return this.item;
	}

	public void SetItem(int x)
	{
		this.item = x;
	}

	public void SetParent(Node parent)
	{
		this.parent = parent;
	}

	public Node GetParent()
	{
		return this.parent;
	}

	public void SetChildren(ArrayList<Node> children)
	{
		this.children = children;
	}

	public ArrayList<Node> GetChildren()
	{
		return this.children;
	}

	public int getCount(){
		return this.count;
	}

}



public class FPTree
{
	Node root;
	ArrayList<ArrayList<Node>> HeaderTable;


	public FPTree()
	{
		root = new Node();
		HeaderTable = new ArrayList<ArrayList<Node>>();
	}

	public void insert(ArrayList<Integer>)
	{	
		Node pointer = this.root;

	}

	public readTransactions()
	{

	}


}








