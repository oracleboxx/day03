package day03;

import java.util.Scanner;

public class array_List_Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] str = new String[3];
		for(int i =0 ; i<str.length ; i++ ) {
			System.out.println(i+".번째 입력");
			str[i] =input.next();
			
		}
		for(int i = 0 ; i<str.length ; i++) {
			System.out.println(i+"."+str);
		}
	}

}
