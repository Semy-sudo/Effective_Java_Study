package item17;

import java.math.BigInteger;
//BigInteger 를 사용해야 하는 이유?
//: 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든 담을 수 있음
public class BigTnteger_Test {
	public static void main(String[] args) {
		BigInteger bigNumber1 = new BigInteger("100000");//인자를 문자열로 넘겨줘야함
		BigInteger bigNumber2 = new BigInteger("200000");
		System.out.println("덧셈(+) :" +bigNumber1.add(bigNumber2));
		System.out.println("뺄셈(-) :" +bigNumber1.subtract(bigNumber2));
		System.out.println("곱셈(*) :" +bigNumber1.multiply(bigNumber2));
		System.out.println("나눗셈(/) :" +bigNumber1.divide(bigNumber2));
		System.out.println("나머지(%) :" +bigNumber1.remainder(bigNumber2));		
		
		
	}

}
