package item37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import item37.Plant.LifeCycle;

public class Client {
	
	public static void main(String[] args) {
//		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[])new Set[Plant.LifeCycle.values().length];//생명주기의 종류만큼 set 크기 지정
//		for(int i=0;i<plantsByLifeCycle.length;i++) {
//			plantsByLifeCycle[i] = new HashSet<>();
//		}
//		
//		for(Plant p: garden) {
//			plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
//		}
//		
//		final Map<TestEnum, Integer> map = new EnumMap<>(TestEnum.class);
		
		//Stream 을 이용해서 더 최적화해보기
		Plant[] garden = new Plant[6];
		garden[0] = new Plant("가", Plant.LifeCycle.ANNUAL);
		garden[1] = new Plant("나", Plant.LifeCycle.BIENNIAL);
		garden[2] = new Plant("다", Plant.LifeCycle.PERENNIAL);
		garden[3] = new Plant("마", Plant.LifeCycle.ANNUAL);
		garden[4] = new Plant("바", Plant.LifeCycle.BIENNIAL);
		garden[5] = new Plant("사", Plant.LifeCycle.PERENNIAL);
		
		
//		System.out.println(Arrays.stream(garden)
//                .collect(Collectors.groupingBy(p -> p.lifeCycle)));
		
		Map<Object, List<Plant>> hmap = Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.lifeCycle));
		System.out.println(hmap.get(Plant.LifeCycle.ANNUAL).size());
		
		System.out.println(Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.lifeCycle,
                                              () -> new EnumMap<>(LifeCycle.class), Collectors.toSet())));
		
		
		
		 
		
	}
	

}
