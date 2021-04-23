package immutable_mutable;



public class Main {
   public static void main (String[] args) {
	   Mutable_example mt = new Mutable_example();
	   
	   mt.setAge(7);
	   mt.setName("Hop");
	   
	   Immutable_example imt = new Immutable_example();
	   
	   Immutable_example imt2 = imt;
	   
	    
	   System.out.printf(mt.getAge() + mt.getName());
	   
	   System.out.println(imt2.getId());
	   
	 
   }
}
 