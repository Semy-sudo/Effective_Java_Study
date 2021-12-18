package item34_EnumTest;

public enum PayrollDay {
	//1) 만약 휴가와 같은 새로운 상수가 추가된다면 case 를 늘려서 추가해 주어야 함
//	MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY;
//	
//	private static final int MINS_PER_SHIFT = 8*60;
//	
//	int pay(int minutesWorked, int payRate) {
//		int basePay = minutesWorked*payRate;//기본급여
//		int overtimePay;
//		switch(this) {
//		case SATURDAY:
//		case SUNDAY:
//			overtimePay = basePay/2;
//			break;
//		default:
//			overtimePay = minutesWorked <= MINS_PER_SHIFT ?
//                    0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
//		}
//		
//		return basePay + overtimePay;
//	}
	
	//2) 전략 열거 타입 패턴
	MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);
	
	private final PayType payType;
	
	PayrollDay(PayType payType){
		this.payType = payType;
	}
	
	int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked,payRate);
	}
	
	private enum PayType{
		//주말인지 주중인지에 따라 overtimepay 에 대한 계산이 달라짐
		WEEKDAY {
            int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked <= MINS_PER_SHIFT ?
                        0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked * payRate / 2;
            }
        };
		
		abstract int overtimePay(int miniutesWorked, int payRate);
		
		private static final int MINS_PER_SHIFT = 8 * 60;
		int pay(int minutesWorked, int payRate) {
			int basePay = minutesWorked*payRate;
			return basePay + overtimePay(minutesWorked,payRate);
		}

	}
	



}
