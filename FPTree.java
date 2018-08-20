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
		this.count++;
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

// FP-tree constructor
	public FPTree()
	{
		root = new Node();
		HeaderTable = new ArrayList<ArrayList<Node>>();
		searchHT = new HashMap<Integer, Integer>();
	}

// Insert given transaction into FP-tree as a path
	public void insert(ArrayList<Integer> new_itemset)
 	{	
 		Node pointer = this.root;

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

//	Obtain hashmap for each item to map item to its support
	public HashMap<Integer, Integer> makeHashmap(Scanner s)
	{	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (s.hasNext()) 
		{
			int t = s.next();
			if (map.containsKey(t)) 
			{
            	int count = map.get(t);
				map.put(t, count + 1);
			} 
			else 
			{
				map.put(temp, 1);
			}
		}
		return map;
	}


//	Get hashmap as per descending values of counts of items
	private static HashMap<Integer, Integer> sortHashmap(HashMap<Integer, Integer> map, int minSup)
	{
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() 
		{
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		list.removeIf(p -> p.getValue() < minSup);	

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) 
		{
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		} 
		
		return sortedHashMap;
	}

//	Remove non frequent items from each transaction itemset
	private static ArrayList<Integer> RemoveNonFrequent(ArrayList<Integer> transaction, int minSup, HashMap<Integer, Integer> map)
	{
		ArrayList<Integer> list = transaction;
		Collections.sort(list, new Comparator() 
		{
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		list.removeIf(p -> p.getValue() < minSup);

		return list;

	}



	public constructTree(){
		// Read all items and create hashmap to 


	}

// build Conditional Pattern Base
	public buildCPB(ArrayList<Integer> itemset){
		List<List<Integer>> cpb = new ArrayList<Integer>(); 


	}



}








