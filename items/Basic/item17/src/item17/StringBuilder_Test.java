package item17;

public class StringBuilder_Test {

	public static void main(String[] args) {
		String stringVal1 = "Test 1";
		String stringVal2 = "Test 2";
		
		//hashcode 가 string 클래스에서는 서로 같은 문자열을 가지면 같은 해시코드값이 나오게
		//재정의 되어있기에 서로 다른 해쉬코드가 나올것으로 예상
		System.out.println("stringVal1:" +stringVal1.hashCode());//-1793304509
		System.out.println("stringVal2:" +stringVal2.hashCode());//-1793304508
		
		stringVal1 = stringVal1 + stringVal2;
		System.out.println("stringVal1: "+stringVal1.hashCode());//-505925049
		//=> 문자열에 변경이 있을때 마다 서로 다른 해쉬코드값이 생성됨
		
		StringBuilder sb = new StringBuilder();
		sb.append("Test StringBuilder");
		System.out.println(sb.hashCode());//1605283233
		sb.append("Test StringBuilderBuilder");
		System.out.println(sb.hashCode());//1605283233
		//=> 문자열 변경이 있어도 같은 해시코드값이 나옴

	}

}
