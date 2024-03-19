package t2;

class Apple {}
class Food {}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.setT(new Apple());
		Apple apple = goods1.getT();
		System.out.println("apple : " + apple);
		System.out.println();
		
		Goods<Food> goods2 = new Goods<>();
		goods2.setT(new Food());
		Food food = goods2.getT();
		System.out.println("food : " + food);
		System.out.println();
		
		//잘못 사용한 예
		Goods<Apple> goods3 = new Goods<>();
		goods3.setT(new Apple());
//		Food food2 = (Food)goods3.getT(); //오류 제너릭을 사용해서 캐스팅 문제 있어서 오류 발생시켜줌
//		System.out.println("food2 : " + food2);
		System.out.println();
	}
}
