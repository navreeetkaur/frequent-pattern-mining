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

	public int getCount(){
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

	public void insert(ArrayList<Integer>)
	{	
		Node pointer = this.root;

	}

	public readTransactions()
	{

	}

	private static List sortHashmap(HashMap<Integer, Integer> map)
	{
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() 
		{
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		return list;
	}

       /*
       // Here I am copying the sorted list in HashMap
       // using LinkedHashMap to preserve the insertion order
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
       */

	public HashMap<Integer, Integer> SortItemsByFrequency(Scanner s)
	{	
		HashMap<Integer, Integer> 
		while (s.hasNext()) 
		{
			int t = s.next();
			if (mapToFrequency.containsKey(t)) 
			{
            	int count = mapToFrequency.get(t);
				mapToFrequency.put(t, count + 1);
			} 
			else 
			{
				mapToFrequency.put(temp, 1);
			}
		}








	}


}








