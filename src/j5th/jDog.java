package j5th;

public class jDog {

	/**
	 * @param args
	 */
	public void bark (int i, String j) {
		System.out.println("barking");
	}
	
	public void bark (String j, int i) {
		System.out.println("howling");
		barkThis();
		this.barkThis();
	}
	
	protected void finalize () {
		System.out.println("dog finalize");
	}
	
	
	public void barkThis () {
		System.out.println("berber");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jDog berber = new jDog(); //finalize不打印
		berber.bark(1, "zly");
		berber.bark("zly", 1);
		new jDog();//finalize打印
		System.gc();
	}

}
