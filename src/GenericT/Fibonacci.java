package GenericT;

public class Fibonacci implements Generator<Integer> {

	private int count = 0;
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		
		return fib(count++);
	}
	
	public int fib (int n) {
		if (n < 2) return 1;
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String [] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 1; i <= 18; i++) {
			System.out.println(gen.next() +" ");
		}
	}
}
