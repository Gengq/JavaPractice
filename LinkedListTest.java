import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTest{
	public static void main(String[] args){
		List<String> a = new ArrayList<>();
		a.add("Amy1");
		a.add("Amy2");

		List<String> b = new ArrayList<>();
		b.add("Amy3");
		b.add("Amy4");

		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();

		while(bIter.hasNext()){
			if(aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		Scanner m = new Scanner(System.in);
		m.next();
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
	}
}
