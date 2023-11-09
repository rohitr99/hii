
public class WrapperClass {

	public static void main(String[] args) {

		int a = 10;
		Integer b = a;// boxing
		System.out.println("int a=" + a);
		System.out.println("Integer b=" + b);

		int c = b;// unboxing
		System.out.println("int c=" + c);

		// valueof
		Integer I = Integer.valueOf("20");
		System.out.println(I);

		// parse
		int i = Integer.parseInt("10");
		System.out.println(i);

		// toString()
		Integer I1 = new Integer(30);

		String s = I1.toString();
		System.out.println(s);
	}

}
