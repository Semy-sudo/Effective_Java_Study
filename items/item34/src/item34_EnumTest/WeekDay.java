package item34_EnumTest;

//열거타입 자체는 클래스
//상수 하나당 자신의 인스턴스를 하나씩 만들어 public static final 필드로 공개
public enum WeekDay {
	MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);
	
	private final int value;//열거타입으로 만들어진 인스턴스들은 딱 하나만 존재
	
	WeekDay(int value){
		this.value = value;
	}

}
