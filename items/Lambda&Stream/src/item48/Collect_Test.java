package item48;

import java.util.ArrayList;

//non-paralled 환경에서는 combiner가 절대 호출되지 않는다.
public class Collect_Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("bcd");
		list.add("Ddd");
		
		//without paralled
		String collect = list.stream().collect(
				StringBuilder::new,
				(res,elem) -> {
					System.out.println("accumulator call!!");
					res.append(" ").append(elem);
					System.out.println(res);
				},(res1,res2) -> {
					System.out.println("combined call!!!");
					res1.append(" ").append(res2);
				}
				).toString();
				
		System.out.println(collect);
		
		//paralled
				String collect2 = list.stream().collect(
						StringBuilder::new,
						(res,elem) -> {
							System.out.println("accumulator call!!");
							res.append(" ").append(elem);
							System.out.println(res);
						},(res1,res2) -> {
							System.out.println("combined call!!!");
							res1.append(" ").append(res2);
						}
						).toString();
						
				System.out.println(collect2);

	}

}
