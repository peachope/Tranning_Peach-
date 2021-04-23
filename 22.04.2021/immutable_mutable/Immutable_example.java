package immutable_mutable;

public class Immutable_example {
	private final int id;
	private String major;
	
	public Immutable_example() {
		this.id = 0;
		this.major="";
	}
	
	public int getId() {
		return id;
	}

	public String getMajor() {
		return major;
	}
}
