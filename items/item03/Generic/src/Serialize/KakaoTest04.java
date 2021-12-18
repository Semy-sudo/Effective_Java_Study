package Serialize;

class Solution04 {
	static int[] num;
	static int[] answer;
	static int score;
	static boolean iswin;
	
    public int[] solution(int n, int[] info) {
        answer = new int[11];
        num = new int[11]; //10~0 까지 맞힌 과녁의 개수
        score = 0;
        
        
       
        recur(0,0,n,info);//현재 과녁번호, 맞춘개수


        if(!iswin) {
        	return new int[]{-1};
        }else {
        	return answer;
        }
        
    }
    
	private void recur(int idx, int cnt,int n,int[] info) {
		if(idx==11 || cnt>=n) {
			//어피치 과녁이랑 비교해서 점수 내보기
			int a = 0;//어파치 점수
			int b = 0;//라이언 점수
			for(int t=0;t<11;t++) {
				if(info[t]==0 && num[t]==0) {
					continue;
				}else if(info[t]>=num[t]) {
					a+= (10-t);
				}else {
					b+= (10-t);
				}
			}
			//이긴경우
			if(b>a) {
				iswin = true;
				if(score<b-a) {
					score = b-a;
					for(int q=0;q<11;q++) {
						answer[q] = num[q];
					}
				}else if(score==b-a) {
					//더 작은 점수를 많이 획득한 애가 답이된다.
					for(int s=10;s!=-1;s--) {
						if(answer[s]>num[s]) {
							break;
						}else if(answer[s]<num[s]) {
							for(int q=0;q<11;q++) {
								answer[q] = num[q];
							}
							break;
						}
					}
				
				}
			}
			
			
			return;
		}
		
		//현재 idx를 0~n 개 까지 맞춘다고 가정
		for(int i=n; i!=-1;i--) {
			if(cnt+i>n) continue;
			num[idx] = i;
			recur(idx+1,cnt+i,n,info);
		}
		
	}
}

public class KakaoTest04 {

	public static void main(String[] args) {
		int n = 10;
		int[] info = {0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3};
		Solution04 sol = new Solution04();
		sol.solution(n, info);

	}

}
