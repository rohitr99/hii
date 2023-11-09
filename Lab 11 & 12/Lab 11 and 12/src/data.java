
public

class data {
	private String name;

	public void fun() {
		System.out.println("This is data class function");
	}

	// getter
	public String getname() {
		return this.name;
	}

	// setter
	public void setname(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		data a = new data();
		a.setname("Hello World");
		System.out.println(a.getname());
		a.fun();

	}

}
