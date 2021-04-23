package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Employee em1 = new Employee(001,"Hop");
		Employee em2 = new Employee(002,"Gau");
		
		
		HashMap<Employee, String> empHashMap = new HashMap<>();
		
		empHashMap.put(em1,"User1");
		empHashMap.put(em2,"User2");
		
		for(Map.Entry<Employee, String> entry : empHashMap.entrySet()) {
			System.out.println(entry.getKey()+ "==" + entry.getValue());
			
			
		}
		

	}

}
