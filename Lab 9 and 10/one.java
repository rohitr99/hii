package demo11;


public class one {

	protected void finalize() throws Throwable
	{
		try {
			System.out.println("inside demo's finalize()");
		    } 
		catch(Throwable e) {
			throw e;
		}
		
			finally {
			System.out.println("Calling finalize method"
							+ " of the Object class");
			super.finalize();
			}
	}
	public static void main(String[] args) throws Throwable
	{
		one d = new one();
		d=null;
		System.gc();
		//d.finalize();
	}
}