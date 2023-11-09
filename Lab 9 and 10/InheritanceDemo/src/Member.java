import java.time.LocalDate;
public class Member extends Person {
	private String typeOfMembership;
	private double amount;
	public Member() {
		super();
		System.out.println("In default of Member");
	}
	public Member(int pid, String pname, String mobile, String email, String typeOfMembership, double amount) {
		super(pid, pname, mobile, email);
		System.out.println("In para of Member");
		this.typeOfMembership = typeOfMembership;
		this.amount = amount;
	}
	public String getTypeOfMembership() {
		return typeOfMembership;
	}
	public void setTypeOfMembership(String typeOfMembership) {
		this.typeOfMembership = typeOfMembership;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString() + "Member [typeOfMembership=" + typeOfMembership + ", amount=" + amount + ", toString()="
				+  "]";
	}

	
	
}
