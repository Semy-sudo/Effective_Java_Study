package 알고출제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static int N;
	static int[][] map,dp;
	static class Point{
		int x;
		int y;
		Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
			}
		}//input end!
		
		dp = new int[N][N];//진구가 현재 칸에서 가지고 있을 수 있는 최대 금액을 채워나감
		dp[0][0] = 100;//처음에는 100가지고 있음
		bfs();
		
		if(dp[N-1][N-1]==0) {
			System.out.println(-1);
		}else {
			System.out.println(dp[N-1][N-1]);			
		}

	}
	private static void bfs() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(0,0));//0,0에서 시작!
		while(!q.isEmpty()) {
			Point p = q.poll();
			
			for(int t=0;t<8;t++) {
				int x = p.x + dx[t];
				int y = p.y + dy[t];
				if(x>=0 && x<N && y>=0 && y<N) {
					if(Math.abs(p.x-x)+Math.abs(p.y-y)==1) {//상하좌우
						if(dp[p.x][p.y]-1-map[x][y] > dp[x][y]) {//가는게 더 이득이면 go
							q.add(new Point(x,y));
							dp[x][y] = dp[p.x][p.y]-1-map[x][y];
						}
					}else {//대각선
						if(dp[p.x][p.y]-3-map[x][y] > dp[x][y]) {//가는게 더 이득이면 go
							q.add(new Point(x,y));
							dp[x][y] = dp[p.x][p.y]-3-map[x][y];
						}
					}
				}
			}
		}
		
	}

}
