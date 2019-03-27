package treeSet;


public class Item implements Comparable<Item>{
	private int Id;
	public Item(){}
	public Item(int id){
		Id = id;
	}
	public String toString(){
		return "ID:"+Id;
	}
	public int compareTo(Item other){
		return Integer.compare(Id, other.Id);
	}
}
