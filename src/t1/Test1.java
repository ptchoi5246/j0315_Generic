package t1;

class Apple {}
class Goods1 { //apple을 처리 할 VO
	private Apple apple = new Apple();
	
	//게터,세터
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}	
}

class Food{}
class Goods2 {
	private Food food = new Food();

	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
}

public class Test1 {
	public static void main(String[] args) {
		//Goods1을 통해서 Apple객체를 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		System.out.println("apple : " + apple);
		System.out.println();
		
		//Goods2을 통해서 Food객체를 추가 및 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setFood(new Food());
		Food food = goods2.getFood();
		System.out.println("food : " + food);
		
	}
}
