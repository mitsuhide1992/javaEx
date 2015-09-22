package GenericT;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static<T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
}
