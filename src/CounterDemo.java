

public class CounterDemo {
	public static void main(String[] args) {
		Counter a = new Counter();
		Counter b = new Counter();
		
		a.increment();
		a.increment();
		a.increment();
		b.increment();
		
		System.out.println("a.getMyCount() : "+a.getMyCount());
		System.out.println("b.getMyCount() : "+b.getMyCount());
		System.out.println("Counter.getGlobalCount() : "+Counter.getGlobalCount());
	}
}
