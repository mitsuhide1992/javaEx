package j8th;

 
public class Sub extends Super {
	public int field = 1;
	
	@Override
	public int getField() {
		return field;
	}
	
	/**
	 * @return
	 */
	public int getSuperField() {
		return super.field;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Super sub = new Sub();
		System.out.println("sub field is " + sub.field);
		System.out.println("sub getField is " + sub.getField());
		Sub sub1 =new Sub();
		System.out.println("sub field is " + sub1.field);
		System.out.println("sub getField is " + sub1.getField());
		System.out.println("sub getSuperField is " + sub1.getSuperField());
	}
}
