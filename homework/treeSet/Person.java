package treeSet;


public class Person implements Comparable<Person>{
	private int id;
	private String name;
	private String major;
	private int mathScore;
	private int englishScore;
	private int javaScore;

	Person(int aId, String aName, String aMajor, int aMathScore, int aEnglish, int aJavaScore){
		id = aId;name = aName; major = aMajor; mathScore = aMathScore; englishScore = aEnglish; javaScore = aJavaScore;
	}
	public int sumScore(){return mathScore+englishScore+javaScore;}
	public int getId(){return this.id;}
	public String toString(){return "\nID:"+id+" name:"+name+" major:"+major+" mathScore:"+mathScore+" englishScore:"+englishScore+" javaScore:"+javaScore+" sumScore:"+sumScore();}
	public int compareTo(Person p){
		int sum = Integer.compare(sumScore(), p.sumScore());
		return sum != 0 ? sum : Integer.compare(id,p.getId());
	}

}
