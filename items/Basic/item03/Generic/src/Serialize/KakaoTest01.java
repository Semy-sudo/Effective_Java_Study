package Serialize;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] arr = new int[id_list.length];//신고받은 횟수
        boolean[][] check = new boolean[id_list.length][id_list.length];
        int action = 0, actioned = 0;
        //1. 각 유저별 신고받은 횟수, 신고한 유저목록
        for(int r=0;r<report.length; r++) {
        	String[] s = report[r].split(" ");
        	for(int i=0;i<id_list.length;i++) {
        		if(id_list[i].equals(s[0])) {
        			action = i;
        		}
        		if(id_list[i].equals(s[1])) {
        			actioned = i;
        		}
        	}
        	//신고한 사람과 신고당한 사람의 idx가 결정
        	if(!check[action][actioned]) {
        		arr[actioned] +=1;
        		check[action][actioned] = true;        		
        	}
        	
        }
        
        //2. 본인이 신고한 사람이 신고되었는지 확인
        for(int i=0;i<id_list.length;i++) {
        	for(int j=0;j<id_list.length;j++) {
        		if(check[i][j] && arr[j]>=k) answer[i]++;
        	}
        }
        
        //출력
        for(int p=0;p<id_list.length;p++) {
        	System.out.print(answer[p]);
        }
        
        return answer;
    }
}

public class KakaoTest01 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		sol.solution(id_list, report, k);
	}

}
