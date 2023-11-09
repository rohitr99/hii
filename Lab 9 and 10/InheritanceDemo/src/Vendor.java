import java.time.LocalDate;
public class Vendor extends Employee{
	private int noOfEmp;
	private double amount;
	public Vendor() {
		super();
		System.out.println("In Default Of Vendor");
	}

	
	public Vendor(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,
			int noOfEmp, double amount) {
		super(pid, pname, mobile, email, dept, desg, doj);
		this.noOfEmp = noOfEmp;
		this.amount = amount;
	}


	public int getNoOfEmp() {
		return noOfEmp;
	}


	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double calculateSal()
	{
		return noOfEmp*amount;
	}

	@Override
	public String toString() {
		return super.toString() +"Vendor [noOfEmp=" + noOfEmp + ", amount=" + amount + ", toString()=" +  "]";
	}



	
}
