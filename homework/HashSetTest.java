import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetTest{
	public static void main(String[] args){
		Set<String> courses = new HashSet<String>();
		courses.add("高等数学");
		courses.add("线性代数");
		courses.add("概率论");
		courses.add("英语");
		courses.add("数学");

		Iterator<String> iter = courses.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
