package item34_EnumTest;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {
	//방법1)
//	PLUS, MINUS, TIMES, DIVIDE;
//	
//	//상수가 뜻하는 연산을 수행한다.
//	public double apply(double x, double y) {
//		switch(this) {
//		case PLUS: return x+y;
//		case MINUS: return x-y;
//		case TIMES: return x*y;
//		case DIVIDE: return x/y;
//		}
//		throw new AssertionError("알수없는 연산: "+this);
//	}//-> 근데 이런 방식은 상수가 추가될때 마다 case 를 추가해야함. 만약 없다면 assertionerror 런타임 에러
//	
	
	//방법2) apply 가 추상메서드 이므로 각 상수에서 구현하지 않으면, 컴파일 오류

	
	
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x+y;
		}

		@Override
		public Operation inverse(Operation operation) {
			return Operation.MINUS;
		}
	},
	MINUS("-") {

		@Override
		public double apply(double x, double y) {
			return x-y;
		}

		@Override
		public Operation inverse(Operation operation) {
			return Operation.PLUS;
		}
		
	},
	TIMES("*") {

		@Override
		public double apply(double x, double y) {
			return x*y;
		}

		@Override
		public Operation inverse(Operation operation) {
			return Operation.DIVIDE;
		}
	},
	DIVIDE("/") {

		@Override
		public double apply(double x, double y) {
			return x/y;
		}

		@Override
		public Operation inverse(Operation operation) {
			return Operation.TIMES;
		}
		
	};
	
	private final String symbol;//상수 중 하나
	
	Operation(String symbol){
		this.symbol = symbol;
		//stringToEnum.put("+", DIVIDE) -> 이거 안됨, 1. 열거타입 상수가 생성 2. 정적필드 초기화
	}
	//????
	//인스턴스 변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 정적필드 즉, 클래스 필드는 인스턴스 생성없이
	//호출가능한 걸로 알고 있습니다.
	//그래서 보통 클래스 메서드나 필드에서 인스턴스 변수의 사용을 금지하지만, 인스턴스 메소드나 필드에서는 static 이 붙은
	//멤버들을 사용하는게 언제나 가능한 걸로 알고 있습니다.
	
	
	
	@Override
	public String toString() {//상수 이름 반환
		return symbol;
	}
	
	//여기서 map 에 상수가 추가되는 시점은!! 정적 필드(stringToEnum)가 초기화 되는 시점!!
	private static final Map<String, Operation> stringToEnum =
            Stream.of(Operation.values())
                    .collect(Collectors.toMap(Operation::toString, operation -> operation));
	
	//Optional 로 반환하여 값이 존재하지 않을 상황을 클라이언트에게 알린다.
	public static Optional<Operation> fromString(String symbol) {
	    return Optional.ofNullable(stringToEnum.get(symbol));
	}
			
	
	public abstract double apply(double x, double y);
	public abstract Operation inverse(Operation operation);
	

}
