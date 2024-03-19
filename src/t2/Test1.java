package t2;

class MyClass<T>{
	private T t; //변수 private
	//게터,세터
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}


public class Test1 {
	public static void main(String[] args) {
		//MyClass<String> mc1 = new MyClass<String>(); //<무조건 객체타입>
		MyClass<String> mc1 = new MyClass<>(); //앞의 타입을 작성했기 때문에 뒤에는 타입 생략 가능
		mc1.setT("안녕하세요");
		System.out.println("mc1 : " + mc1.getT());
		System.out.println();
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);
		System.out.println("mc2 : " + mc2.getT());
		System.out.println();
	}
}
