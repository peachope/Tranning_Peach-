package hashmap;

public class Employee {
	
  private int id;
  private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

   public Employee(int id2, String name2) {
	  this.id = id2;
	  this.name = name2;
}
   
   
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
   public String toString() {
	return "Employee [empId= " + id+", name ="+name+"]";
	    
   }
}
