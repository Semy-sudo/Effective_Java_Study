package try_with_resources;

import java.io.IOException;


//첫번째 예외를 두번째 예외가 덮어써버리는 문제점
public class Test_try_finally {
	
	public static void main(String[] args) throws IOException {
		firstLineOfFile("..");
	}
	
	static String firstLineOfFile(String path) throws IOException {
		  try {
		    throw new IllegalArgumentException();
		  } finally {
		    throw new NullPointerException();
		  }
	}
}