
import treeSet.*;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetTest{
	public static void main(String[] args){
		Item a = new Item(20);
		SortedSet<Item> parts = new TreeSet<Item>();
		parts.add(new Item(10));
		parts.add(new Item(50));
		parts.add(new Item(30));
		parts.add(new Item(90));
		parts.add(new Item(20));

		System.out.println(parts);

	}
}
