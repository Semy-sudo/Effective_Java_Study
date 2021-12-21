package item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

//reduce vs collect
//reduce - 파이프 라인에서 만들어진 모든 원소를 하나로 합치는 과정
//collect - 가변축소수행하기에 병렬화에 적합하지 않다
public class Collect_Test2 {

	public static void main(String[] args) {
			System.out.println(pi(5)); //1,2, 5
			
		

	}
	
	//소수 계산 스트림 파이프라인
	static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
	
	//병렬화 버전
	static long pi_parallel(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel() // 기존 로직에 추가된 부분
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

}
