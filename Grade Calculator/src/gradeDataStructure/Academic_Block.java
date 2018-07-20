package gradeDataStructure;

public abstract class Academic_Block {

	private String name;
	private Academic_Block children;
	
	
	public Academic_Block getChildren() {
		
		return children;
		
	}


	public String getName() {
		
		return name;
		
	}


	public void setName(String name) {
		
		this.name = name;
		
	}
	
}
