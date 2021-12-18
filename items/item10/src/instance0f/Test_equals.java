package instance0f;

import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

public class Test_equals {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		ColorPoint cp = new ColorPoint(1,2,"yellow");
		
		//Point 기준으로 p 와 cp 비교
		if(p.equals(cp)) {
			System.out.println("Point 기준 비교 true");
		}
		//ColorPoint 기준으로 비교
		if(cp.equals(p)) {
			System.out.println("ColorPoint 기준 비교 true");
		}
		
		Date date = new Date(3);
		Timestamp ts = new Timestamp(3);
		if(date.equals(ts)) {
			System.out.println("date 기준 비교");
		}
		if(ts.equals(date)) {
			System.out.println("ts 기줌 비교");
		}
		
		URL url = new URL();
		url.equals(url)
	}

}
