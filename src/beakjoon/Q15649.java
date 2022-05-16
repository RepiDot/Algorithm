package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q15649 {
	static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int output = 1;
		String s;
		array = new int[m];
		
		for(int i=0; i<m; i++) {
			array[i] = i+1;
			output *= n-i;
		}
		
		for(int i=0; i<output; i++) {
			s = Arrays.toString(array);
			s = s.replace(",", "");
			s = s.replace("[", "");
			s = s.replace("]", "");
			System.out.println(s);
			sum(m-1, n);
		}
	}
	
	public static void sum(int loc, int max) {
		if(loc < 0) {
			return;
		}
		array[loc]++;
		if(array[loc] > max) {
			sum(loc-1, max);
			array[loc] = 1;
		}
		
		boolean bool;
		for(int i=0; i<loc; i++) {
			bool = array[loc] == array[i];
			if(bool) {
				sum(loc, max);
				break;
			}
		}
	}
}

