package 알고출제;

import java.net.URLDecoder;

public class Main {

	public static void main(String[] args) {
		
		String str = "\\uc1a1\\uc9c4\\uc6b0";
		String decodeVal = URLDecoder.decode(str, "utf-8");
		System.out.println(decodeVal);

		
	}
}

