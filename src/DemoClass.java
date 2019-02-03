
public class DemoClass  {

	
	int a;
	String name;
	String add;
	String addm1;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
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
		DemoClass other = (DemoClass) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	//Added line1
	

	//1-change in master
	//2-change in master
	//3- change in master
	//4-th change in  master

	//5-th change in master

	//6th change in master
	//1st change on third

}
