import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person rafal = new Person("Rafal");
		Person nick = new Person("Nick");
		Person nate = new Person("Nate Reese");
		ArrayList<Person> temp = new ArrayList<>();
		temp.add(rafal);
		temp.add(rafal);
		temp.add(rafal);
		temp.add(rafal);
		temp.add(nick);
		temp.add(nick);
		temp.add(nick);
		temp.add(nick);
		temp.add(nick);
		temp.add(nate);
		System.out.println("ArrayList print:");
		for (Person name : temp) {
			System.out.println(name.getName());
		}
		Set<Person> uniqueTemp =  new HashSet<>();
		
		uniqueTemp.addAll(temp);
		System.out.println("Set print:");
		for(Person person: uniqueTemp) {
			System.out.println(person.getName());
		}
		HashMap<Person, Integer> yo = new HashMap<>();
		int i = 1;
		yo.put(rafal, i);
		yo.put(nick, i + 1);
		yo.put(nate, i + 2);
		System.out.println(yo);
		TreeMap<Person, Integer> yo2 = new TreeMap<>();
		int j = 1;
		yo2.put(rafal, j);
		yo2.put(nick, j + 1);
		yo2.put(nate, j + 2);
		System.out.println(yo2);
		
		System.out.println("HashMaps are not good for guaranteeing order. \nTreeMaps make it in order at all times based on the key. \nMake sure key has a comparable.");
		
	}

}
