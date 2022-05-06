package beakjoon;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int column = in.nextInt();				// 열 입력(column input)
		
		for(int i=column; i>=1; i--) {			// column -> 1
			for(int j=1; j<=column; j++) {		// 1 -> column
				if(i <= j) {
					System.out.print("*");		// 행 출력 '*'(column output '*')
				} else {
					System.out.print(" ");		// 행 출력 ' '(column output ' ')
				}
			}
			System.out.println();				// 행 출력 끝나면 줄 바꿈(Separate line when column output is finished)
		}
	}
}