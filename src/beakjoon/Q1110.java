package beakjoon;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String num = in.next();
		int init = Integer.parseInt(num);
		String[] sum1;
		String[] sum2;
		int cnt = 0;
		
		if(num.length() < 2) {
			num = "0" + num;
		}
		
		do {
			sum1 = num.split("");
			num = Integer.toString(Integer.parseInt(sum1[0]) + Integer.parseInt(sum1[1]));
			
			if(num.length() < 2) {
				num = "0" + num;
			}
			sum2 = num.split("");
			num = sum1[1] + sum2[1];
	
			cnt++;
		}while(init != Integer.parseInt(num));
		
		System.out.println(cnt);
	}

}
