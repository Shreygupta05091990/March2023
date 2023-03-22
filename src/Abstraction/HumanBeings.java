package Abstraction;

abstract class Humans {

	void happiness() {

		System.out.println("Human beings are happy creatures");
	}

}

class Mother extends Humans {

	@Override
	void happiness() {
		System.out.println("Mothers get happiness by taking care of there  families ");

	}

}

class Father extends Humans {
	@Override
	void happiness() {
		System.out.println("Fathers get happiness by earning money .");

	}

}

public class HumanBeings {

	public static void main(String[] args) {
		Humans Anju = new Mother();
		Anju.happiness();
		Humans Pradeep = new Father();
		Pradeep.happiness();
	}
}
