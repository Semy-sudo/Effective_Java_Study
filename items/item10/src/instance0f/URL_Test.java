package instance0f;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Test {

	public static void main(String[] args) throws MalformedURLException {
		URL url1 = new URL("https://www.naver.com/");
		URL url2 = new URL("https://www.naver.com/");
		if(url1.equals(url2)) {
			System.out.println("동일한 url 입니다.");
		}
		System.out.println(url1.getUserInfo());
		System.out.println(url2.getPort());
		

	}

}
