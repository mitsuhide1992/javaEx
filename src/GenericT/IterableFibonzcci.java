package GenericT;

import java.util.Iterator;

public class IterableFibonzcci extends Fibonacci implements Iterable<Integer> {
	
	private int n;
	public IterableFibonzcci(int count) {
		n = count;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}
			public Integer next() {
				n--;
				return IterableFibonzcci.this.next();
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String [] args) {
		for (int i : new IterableFibonzcci(18)) {
			System.out.println(i + " ");
		}
	}

}
