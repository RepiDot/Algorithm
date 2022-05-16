package baekjoon;

import java.util.Scanner;

public class Q1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t;
		int[] x = new int[2], y = new int[2], r = new int[2];
		double r3;
		
		t = in.nextInt();
		for(int i=0; i<t; i++) {
			for(int j=0; j<2; j++) {
				x[j] = in.nextInt();
				y[j] = in.nextInt();
				r[j] = in.nextInt();
			}
			r3 = Math.sqrt(Math.pow(Math.abs(x[0] - x[1]), 2) + Math.pow(Math.abs(y[0] - y[1]), 2));
			
			if(r3 > r[0] + r[1] || r3 < Math.abs(r[0] - r[1])) {
				System.out.println(0);
			} else if(r3 == r[0] + r[1] || r3 == Math.abs(r[0] - r[1])) {
				if(x[0] == x[1] && y[0] == y[1]) {
					System.out.println(-1);
					continue;
				}
				System.out.println(1);
			} else if(r3 < r[0] + r[1] || r3 > Math.abs(r[0] - r[1])) {
				System.out.println(2);
			}
		}
	}
}
