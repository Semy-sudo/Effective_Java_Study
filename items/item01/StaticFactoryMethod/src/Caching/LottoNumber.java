package Caching;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
//미리 생성된 로또 번호 객체의 캐싱을 통해서 새로운 객체 생성의 부담을 덜 수 있다
//정해진 범위를 벗어나는 객체 생성을 막을 수 있다.
public class LottoNumber {
	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;
	
	private static Map<Integer, LottoNumber> lottoNumberCache = new HashMap<>();
	
	
	//1~45 까지의 로또번호를 캐시맵에 넣어준다.
	static {
		IntStream.range(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER)
					.forEach(i -> lottoNumberCache.put(i, new LottoNumber(i)));
		
	}
	
	private int number;
	
	private LottoNumber(int number) {
		this.number = number;
	}
	
	public LottoNumber of(int number) {
		return lottoNumberCache.get(number);
	}

}
