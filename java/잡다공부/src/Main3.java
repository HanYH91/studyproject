interface C {
	int plus(int input1, int input2);
	int minus(int input1, int input2);
	
	default void multiplication(int input1, int input2){
		System.out.println(input1*input2);
	}
	
	public static void division(int input1, int input2){
		if (input2==0){
			System.out.println("Cannot be divided by zero");
		}
		else
			System.out.println(input1/input2);
	}
}

interface Calculator extends C {
	
}


class Calculator1 implements Calculator {

	@Override
	public int plus(int input1, int input2) {
		return input1+input2;
	}

	@Override
	public int minus(int input1, int input2) {
		return input1-input2;
	}
}

public class Main3 {
	public static void main(String[] args){
		
		Calculator calculator_object1 = new Calculator1();
		
		//인터페이스에 선언된 default 함수를 객체를 통하여 호출
		calculator_object1.multiplication(3, 5);
		calculator_object1.plus(1, 2);
		//인터페이스에 선언된 static 함수를 호출 ( static이므로 객체를 통하지 x)
		C.division(4, 2);
		
	}
}