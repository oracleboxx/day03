package day03;

import java.util.Scanner;

public class array_List_test7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = {10,54,13,17,25,30};
		String odd_even =null;
		System.out.println("짝수,홀수 입력:");
		odd_even = input.next();
	
	for(int i =0; i<arr.length; i++) {
		if(odd_even.equals("짝수")) {
			if(i%2==0) {
				System.out.println("짝수 출력"+arr[i]);
			}
		}
			
			else  if(i%2 ==1) {
				System.out.println("홀수 출력"+arr[i]);
			}
	}
			
			//if
		}//if
	//for

}//main
//class
