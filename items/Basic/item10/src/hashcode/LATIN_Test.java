package hashcode;

public class LATIN_Test {

	public static void main(String[] args) {
		//String value = "hihello";
		byte[] value = {1,0,1,2};
		int h = 0;
		for(byte v: value) {
			h = 31*h+(v&0xff);
			System.out.println(h);
		}
		
		byte v =  (byte) 2555;
		System.out.println(v);
		System.out.println(v&0xff);
		
		
	}

}
