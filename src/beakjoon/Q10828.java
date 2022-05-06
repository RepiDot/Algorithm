package beakjoon;

import java.util.Scanner;

public class Q10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int NUMBER_OF_INSTRUCTIONS = in.nextInt();
		String operator = "0";
		int operand;
		int stackSize = 0;
		int[] stack = new int[123];
		
		for(int i=0; i<NUMBER_OF_INSTRUCTIONS; i++) {
			operator = in.next();
			if(operator.equals("push")) {
				stackSize++;
				operand = in.nextInt();
				stack[stackSize - 1] = operand;
				
			} else if(operator.equals("pop")) {
				if(stackSize == 0) {
					System.out.println(-1);
					continue;
				}
				System.out.println(stack[stackSize - 1]);
				stackSize--;
				
			} else if(operator.equals("size")) {
				System.out.println(stackSize);
				
			} else if(operator.equals("empty")) {
				if(stackSize == 0) {
					System.out.println(1);
					continue;
				}
				System.out.println(0);
				
			} else if(operator.equals("top")) {
				if(stackSize == 0) {
					System.out.println(-1);
					continue;
				}
				System.out.println(stack[stackSize - 1]);
			}
		}
	}

}
