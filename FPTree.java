import java.io.*;
import java.util.*;
 
class Node
{
	int item;
	int count;
	Node parent;
	Node next;
	List<Node> children;

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

}



public class FPTree
{
	Node root;
	List<List<Node>> HeaderTable;


	public FPTree()
	{
		root = new Node();
		HeaderTable = new ArrayList<ArrayList<Node>>();
	}

	public void insert(ArrayList<Integer> new_itemset)
	{	
		Node pointer = this.root;
		

	}

	public readTransactions()
	{

	}

//	Obtain hashmap for each item
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

//	Get hashmap as per descending values of counts
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




}








