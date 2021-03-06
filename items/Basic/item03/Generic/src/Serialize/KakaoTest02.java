package Serialize;

import java.util.Arrays;

class Solution02 {
    public int solution(int n, int k) {
    	int ans = 0;
        //1. 소수로 만들기
    	int next = n;
    	StringBuilder sb = new StringBuilder();
    	while(next>=k) {
    		sb.append(next%k);
    		next = next/k;
    	}
    	sb.append(next);
    	
    	char[] arr = sb.toString().toCharArray();
    	//배열 거꾸로 돌리기
    	String string_ans = "";
    	char[] ch_arr = new char[arr.length];
    	for(int c=0;c<arr.length;c++) {
    		ch_arr[c] = arr[arr.length-1-c];
    		string_ans += Character.toString(ch_arr[c]);
    	}
    	
    	
    	
    	//2. 만들어진 숫자스트링으로 해당 조건에 만족하는 개수 세주기
    	int r =0;
    	int l = r+1;
    	while(l<ch_arr.length) {
    		if(ch_arr[r]=='0') {
    			r++;
    			l++;
    		}
    		//System.out.println("r:"+r+" l:"+l);
    		//마지막 위치일 경우
    		if(r!=0 && l >= ch_arr.length-1 && ch_arr[r-1]=='0') {
    			//int num = Integer.parseInt(ch_arr.toString().substring(r, l+1));
    			int n_r = r;
    			String st = "";
    			while(n_r!=l+1) {
    				st+=ch_arr[n_r];
    				n_r++;
    			}
    			int num = Integer.parseInt(st);
    			if(isdecimal(num) && num!=1) {
    				ans++;
    			}
    			l++;
    			continue;
    		}
    		if(ch_arr[l]=='0') {
    			int n_r = r;
    			String st = "";
    			while(n_r!=l) {
    				st+=ch_arr[n_r];
    				n_r++;
    			}
    			//int num = Integer.parseInt(ch_arr.toString().substring(r, l));
    			int num = Integer.parseInt(st);
    			if(isdecimal(num) && num!=1) {//소수이면
    				ans++;
    			}
    			r = l+1;
    			l = r+1;//위치변경
    			
    		}else {
    			l++;
    		}
    		
    	}
    	
    	System.out.println(ans);
    	
    	if(r==0 && l==ch_arr.length) {
    		return 1;
    	}else {
    		return ans;
    	}

    	
    	
    }

	private boolean isdecimal(int num) {
		boolean result = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) result = false; 
		}
		return result;
	}
}

public class KakaoTest02 {

	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		Solution02 sol = new Solution02();
		sol.solution(n, k);

	}

}
