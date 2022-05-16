package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0, num2 = 1, sum;
		int cnt = Integer.parseInt(in.readLine());
		
		if(cnt == 0) {
			num2 = 0;
		}
		
		for(int i=1; i<cnt; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println(num2);
		
		//Fibonacci(0, 1, Integer.parseInt(in.readLine()));
	}
	
//	private static void Fibonacci(int num1, int num2, int cnt) {
//		if(--cnt == 0) {
//			System.out.println(num2);
//		} else {
//			Fibonacci(num2, num1 + num2, cnt);
//		}
//	}
}
