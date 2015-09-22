package j2nd;


public class jAttrOne {
	private int jint = pstatic("in jAttrOne private int");
	private static int jsint = pstatic("in jAttrOne static int");
	private char jchar;
	
	public jAttrOne() {
		// TODO Auto-generated constructor stub
		System.out.println("in j1 constructor");
	}
	
	public void outInt() {
		System.out.println(jint);
	}
	public void outChar() {
		System.out.println(jchar);
	}
	void outSay() {
		System.out.println("in out say");
	}
	public static int pstatic(String s) {
		System.out.println(s);
		return 10;
	}
}
