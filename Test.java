import java.util.Scanner;

public enum Test{
	SMALL, MEDIUM;
}
class MainTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a;
		while(in.hasNext()){
			a = in.next();
			System.out.println(a);
		}
	}
}
