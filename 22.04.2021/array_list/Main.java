package array_list;

public class Main {
   public static void main(String [] args) {
	 
	  
	  Student <String, String> one = new Student<>("Hop","DPT");
	  Student <String, String> two = new Student<>("Gau","MR");
	  Student <String, String> three = new Student<>("Tra","Hutech");
	  
	  Student<String,Integer> four = new Student<>("Thanh",2);
	  
	 
	  
	  Person male = new Person("Gau");
	  
	  Person female = new Person("ysl");
	  
	  Student<Person, Person> couple = new Student<>(male, female);
	  
	  System.out.println(one.getKey() + "=" + one.getValue());
	  
	 
	  
	   
   }
}
