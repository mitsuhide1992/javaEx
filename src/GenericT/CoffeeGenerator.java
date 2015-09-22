package GenericT;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Breve.class, Americano.class};
	private static Random rand = new Random(47);
	
	private int size = 0;
	
	public  CoffeeGenerator () {
		
	}
	
	public CoffeeGenerator (int sz) {
		this.size = sz;
	}
	
	@Override
	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}
	
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		public boolean hasNext() {
			return count>0;
		}
		
		public Coffee next() {
			count--;
			System.out.println("foreach in next");
			return CoffeeGenerator.this.next();
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
	
	public static void main(String [] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		
		for (Coffee c : new CoffeeGenerator(10)) {
			System.out.println(c);
		}
	}
}

