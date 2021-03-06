package Serialize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution3 {
	static class Car implements Comparable<Car>{
		int num;
		int total_time;//분으로 저장
		int start_h;
		int start_m;
		boolean isout;//차량이 out 상태인지 체크
		public Car(int num,int total_time,int start_h,int start_m,boolean isout) {
			this.num = num;
			this.total_time = total_time;
			this.start_h = start_h;
			this.start_m = start_m;
			this.isout = isout;
		}
		@Override
		public int compareTo(Car o) {
			return this.num - o.num;//오름차순 정렬
		}
	}
	
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        ArrayList<Car> list = new ArrayList<>();
        
        for(int r=0;r<records.length;r++) {
        	String[] st = records[r].split(" ");
        	//st[0] 시간
        	//st[1] 차량번호
        	//st[2] in out 여부
        	int car_num = Integer.parseInt(st[1]);
        	String[] time = st[0].split(":");
        	int hour = Integer.parseInt(time[0]);
        	int minute = Integer.parseInt(time[1]);
        	
        	boolean iscar = false;
        	//리스트에 차가 있는 경우
        	for(int l = 0;l<list.size();l++) {
        		if(list.get(l).num==car_num){
        			iscar = true;
        			if(st[2].equals("IN")) {
        				list.get(l).start_h = hour;
        				list.get(l).start_m = minute;
        				list.get(l).isout = false;
        			}else {
        				if(list.get(l).start_m>minute) {
        					list.get(l).total_time += (hour-1-list.get(l).start_h)*60;
        					list.get(l).total_time +=  60-list.get(l).start_m+minute;
        				}else {
        					list.get(l).total_time += (hour-list.get(l).start_h)*60+(minute-list.get(l).start_m);
        				}
        				list.get(l).isout = true;
        			}
        		}
        	}
        	//차가 없는 경우, 추가해 주기
        	if(!iscar) {
        		list.add(new Car(car_num,0,hour,minute,false));
        	}
        
        }
        
        //정렬
        Collections.sort(list);
        answer = new int[list.size()];
        //요금 계산
        for(int i=0;i<list.size();i++) {
        	//나간 차량이 아니면 23:59 에 출차된것으로 간주
        	if(!list.get(i).isout) {
        		list.get(i).total_time += (23-list.get(i).start_h)*60+(59-list.get(i).start_m);
        	}
        	
        	if(list.get(i).total_time<fees[0]) {
        		answer[i] = fees[1];
        	}else {
        		answer[i] += fees[1];
        		if((list.get(i).total_time-fees[0])%fees[2]!=0) {
        			answer[i] += (((list.get(i).total_time-fees[0])/fees[2])+1)*fees[3];
        		}else {
        			answer[i] += ((list.get(i).total_time-fees[0])/fees[2])*fees[3];
        		}
        	}
        }
        
//        //출력
//        for(int i=0;i<answer.length;i++) {
//        	//System.out.print("차량번호"+list.get(i).num);
//        	System.out.println(answer[i]);
//        }
        
        
        return answer;
    }
}

public class KakaoTest03 {

	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		Solution3 sol = new Solution3();
		sol.solution(fees, records);

	}

}
