import java.io.*;
import java.util.*;
 
class Node
{
	int item;
	int count;
	Node parent;
	Node next;
	List<Node> children;

	public Node()
	{
		this.item = -1;
		this.count = 0;
		this.parent = null;
		this.next = null;
		this.children = new ArrayList<Node>();

	}

	public Node(int item, int count)
	{
		this.item = item;
		this.count = count;
		this.parent = null;
		this.next = null;
		this.children = new ArrayList<Node>();

	}

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

	public int getCount()
	{
		return this.count;
	}

	public incrementCount()
	{
		this.count ++;
	}

	public Node hasChild(int i)
	{
		Iterator<Node> it = this.children.iterator();
		while(it.hasNext()){
			Node curr_node = it.next();
			if (curr_node.GetItem() == i){
				return curr_node;
			}
		}
		return null;
	}

}



public class FPTree
{
	Node root;
	List<List<Node>> HeaderTable;
	Map<Integer, Integer> searchHT;

// constructor
	public FPTree()
	{
		root = new Node();
		HeaderTable = new ArrayList<ArrayList<Node>>();
		searchHT = new HashMap<Integer, Integer>();
	}

// insert a transaction into the tree
	public void insert(ArrayList<Integer> new_itemset)
	{	
		Node curr_node = this.root;
		Iterator<Integer> it = new_itemset.iterator();
		while(it.hasNext()){
			int curr_item = it.next();
			Node child = curr_node.hasChild(curr_item);
			if (child != null){
				child.incrementCount();
				curr_node = child;
			}
			else{
				Node next_node = new Node(curr_item, 1);
				next_node.SetParent(curr_node);
				// [TODO]: Link next_node to last node of Header Table - hashmap of item and headertable ???
				curr_node = next_node;
			}
		}
	}

	public readTransactions()
	{

	}


}








