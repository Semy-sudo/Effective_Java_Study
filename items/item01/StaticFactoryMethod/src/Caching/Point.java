package Caching;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.ExecutionException;

// Point라는 클래스에서
public class Point {
  // (0, 0) 은 자주 사용되므로 미리 만들어 놓는다.
  // 클라이언트를 위해서 ORIGIN이라는 오브젝트에 대한 이름도 잘 작성해 놓는다.
	private static final Point ORIGIN = new Point(0, 0);
  
  // 또한 자주 사용하는 포인트들을 캐싱해 놓는다.
  // 여기선 캐싱을 위해 구글의 CacheBuilder을 이용했다. 	  
  private static final Cache<Integer, Cache<Integer, Point>> POINTS_BY_X_Y = CacheBuilder.newBuilder().build();
  // (0, 0) 에 대한 요청이 들어온다면 만들어놓았던 ORIGIN을 반환한다. 
	public static Point ofXY(int x, int y) {
		if (x == 0 && y == 0)
			return ORIGIN;
		//instance-control: 자주 사용되는 포인트에 대해서 캐시를 관리한다. 
		if (Math.abs(x) <= 10 && Math.abs(y) <= 10)
			try {
				return POINTS_BY_X_Y
						.get(x, () -> CacheBuilder.newBuilder().build())
						.get(y, () -> new Point(x, y));
			} catch (ExecutionException e) {
				// do nothing, ignore the cache, and construct a new point
			}
		return new Point(x, y);
	}