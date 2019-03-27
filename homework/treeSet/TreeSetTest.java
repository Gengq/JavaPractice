package treeSet;
import treeSet.*;

import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetTest{
	public static void main(String[] args){
		SortedSet<Person> persons = new TreeSet<Person>();
		persons.add(new Person(111,"aaa","computer science",10,20,30));
		persons.add(new Person(222,"bbb","computer science",20,30,50));
		persons.add(new Person(333,"ccc","computer science",10,50,10));
		persons.add(new Person(444,"ddd","computer science",20,40,30));
		persons.add(new Person(555,"eee","computer science",10,40,30));

		System.out.println(persons);
	}
}
