package try_with_resources;

public class AutoCloseable구현 {

	public static void main(String[] args) throws Exception {
		System.out.println(function());

	}
	
	static String function() throws Exception {
		try(Close c = new Close();
				Open o = new Open()){
			return "";
		}
	}

}

class Close implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("print close");
	}
	
}

class Open implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("print open");
	}
	
}