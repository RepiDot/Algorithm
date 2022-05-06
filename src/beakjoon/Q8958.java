package beakjoon;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] O;
		int sum = 0;
		int tot = 0;
		
		for(int i=0; i<num; i++) {
			O = in.next().split("X");	// 'X'를 기준으로 문자열을 나누고(Divide strings by 'X')
										// 'O'로 이루어진 문자열을 배열로 입력 받음(and receive an array of 'O' strings)
			for(int j=0; j<O.length; j++) {
				for(int o=1; o<=O[j].length(); o++)		sum += o;	// 'O'의 갯수에 따라 더함(Add according to the number of 'O's)
				tot += sum;				// 점수를 총점에 더함(Adding points to the total score)
				sum = 0;				// 점수 초기화(Reset sum)
			}
			System.out.println(tot);	// 출력(Output)
			tot = 0;					// 총점 초기화(Reset tot)
		}
		
	}

}
