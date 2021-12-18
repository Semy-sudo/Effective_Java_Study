package try_with_resources;

//try-with-resource 를 사용하면 다수의 예외처리도 간단하게 가능하다
public class Test2_try_with_resources {

	static boolean firstLine(String defaultVal) {
		try (Open o = new Open()) {
			Integer i = null;
			return i == 3; // NullPointerException
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(defaultVal);
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		firstLine("Toppy McTopFace");
	}

}

class Open implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new NullPointerException();
	}
}