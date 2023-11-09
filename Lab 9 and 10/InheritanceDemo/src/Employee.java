import java.time.LocalDate;
abstract public class Employee extends Person {
	private String dept;
	private String desg;
	private LocalDate doj;
	public Employee() {
		super();
		System.out.println("In Default of Employee");
	}

	public Employee(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj) {
		super(pid, pname, mobile, email);
		System.out.println("In Parameterised of Employee");
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double calculateSal()
	{
		return 0;
	}
	public double calculateBonus()
	{
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+ "Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	

}
