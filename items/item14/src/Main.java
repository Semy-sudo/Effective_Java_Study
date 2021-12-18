import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Main {
	static class Point implements Comparable<Point>{
		int a;
		Point(int a){
			this.a = a;
		}
		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	public static void main(String[] args) {
		Point[] p_arr = new Point[3];
		p_arr[0] = new Point(5);
		p_arr[1] = new Point(3);
		p_arr[2] = new Point(7);
		//정렬기준을 default 로 해 놓고 비교해 보기,정렬이 되지 않음
		Arrays.sort(p_arr);
		for(Point p: p_arr) {
			System.out.println(p.a);
		}
		
		Set<Integer> set
	}

}
