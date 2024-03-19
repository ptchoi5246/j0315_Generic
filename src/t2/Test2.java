package t2;

class MyClass2<T, V>{
	private T t; //변수 private
	private V v;

	//게터,세터
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}


public class Test2 {
	public static void main(String[] args) {
		//MyClass2<String, Integer> mc1 = new MyClass2<String, Integer>(); //<무조건 객체타입>
		MyClass2<String, Integer> mc1 = new MyClass2<>(); //앞의 타입을 작성했기 때문에 뒤에는 타입 생략 가능
		//mc1.setT(100));
		mc1.setT("안녕하세요");
		//mc1.setV("안녕");
		mc1.setV(100);
		System.out.println("key : " + mc1.getT() + ", value : " + mc1.getV());
		System.out.println();
		
		MyClass2<Integer, String> mc2 = new MyClass2<>();
		mc2.setT(200);
		mc2.setV("안녕");
		System.out.println("key : " + mc2.getT() + ", value : " + mc2.getV());
		System.out.println();
	}
}
