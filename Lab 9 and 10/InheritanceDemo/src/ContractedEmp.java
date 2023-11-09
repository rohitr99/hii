import java.time.LocalDate;
public class ContractedEmp extends Employee {
	private int hrs;
	private double charges;
	public ContractedEmp() {
		super();
		System.out.println("In Default of Contract Emp");
	}
	public ContractedEmp(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,
			int hrs, double charges) {
		super(pid, pname, mobile, email, dept, desg, doj);
		System.out.println("In para of Contract Emp");
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public double calculateSal()
	{
		return hrs*charges;
	}
	@Override
	public String toString() {
		return super.toString() + "ContractedEmp [hrs=" + hrs + ", charges=" + charges + ", toString()=" +  "]";
	}
	
	
}
