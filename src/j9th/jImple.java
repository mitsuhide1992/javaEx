package j9th;


public class jImple implements jInterface {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("in imple hello");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("in imple hi");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jInterface [] jI = {new jImple(), new jImpleC()};
		for (jInterface jIter : jI) {
			jIter.sayHello();
			jIter.sayHi();
		}
	}

}
