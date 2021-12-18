package try_with_resources;

//첫번째 예외를 두번째 예외가 덮어 써버리는 문제점 해결??
public class Test_try_with_resources {
	static String firstLineOfFile() throws Exception {
		try (Open o = new Open()) {
			throw new IllegalArgumentException();
		}
	}

	

	public static void main(String[] args) throws Exception {
		System.out.println(firstLineOfFile());
	}

}