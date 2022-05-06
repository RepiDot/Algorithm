package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sub = in.nextInt();
		int[] point = new int[sub];
		double max;
		double tot = 0;
		
		for(int i=0; i<sub; i++)	point[i] = in.nextInt();

		
		Arrays.sort(point);
		max = point[sub-1];
		for(int i=0; i<sub; i++)	tot += (double)point[i] / max * 100;
		
		System.out.println(tot / sub);
	}

}
