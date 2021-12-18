package item34_EnumTest;

public class WeekDayTest {
	public static final int MONDAY = 0;
	void name() {
		//enumTypeMethod(MONDAY);
		enumTypeMethod(WeekDay.MONDAY);
		//enumTypeMethod(WeekDay.FRIDAY);
	}
	private void enumTypeMethod(WeekDay weekDay) {
		System.out.println(weekDay+"입니다.");
	}

	public static void main(String[] args) {
		//name();
	}
}
