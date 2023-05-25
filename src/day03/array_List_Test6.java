package day03;

import java.util.Scanner;

public class array_List_Test6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
		System.out.println("짝수,홀수 입력:");
		odd_even = input.next();

		for (int x : arr) {
		

			if (odd_even.equals("짝수")) {
				if (x % 2 == 0) {
					System.out.println("짝수:" + x);
				} 

				else if(odd_even.equals("홀수")) {
				  if (x % 2 == 1) {
					System.out.println("홀수:" + x);
				} 

				}
			}
		}
	}
}
