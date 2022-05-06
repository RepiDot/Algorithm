package beakjoon;

import java.util.Scanner;

public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		// 사분면 구분 및 출력(Quadrant classification and output)
		if(x > 0 && y > 0)			System.out.println("1");
		else if(x < 0 && y > 0)		System.out.println("2");
		else if(x < 0 && y < 0)		System.out.println("3");
		else if(x > 0 && y < 0)		System.out.println("4");
	}
}
