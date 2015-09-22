package j2nd;

public class jAttrTwo extends jAttrOne {

	/**
	 * @param args
	 */
	private int jTint = pstatic("in jAttrTwo private int");
	private static int jTSint = pstatic("in jAttrTwo static int");
	
	public jAttrTwo() {
		// TODO Auto-generated constructor stub
		System.out.println("in j2 constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in j2 main");
		jAttrTwo j2 = new jAttrTwo();
		j2.outSay();
	}
	void outSay() {
		System.out.println("in j2 say");
		super.outSay();
	}
	
}
