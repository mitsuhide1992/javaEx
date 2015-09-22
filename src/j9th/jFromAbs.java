package j9th;

public class jFromAbs extends jAbstract {
	
	private int pj = 2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jFromAbs ja = new jFromAbs(); 
//		ja.outSay();
 	}
	
	public void outSay() {
		System.out.print("in out say non abs" + pj + "\n" );
	}
	
	public void imp(jAbstract ja) {
		jFromAbs jfab = (jFromAbs)ja;
		jfab.outSay();
	}
}
