package day03;

import java.util.Scanner;

public class array_List_Test_Protice {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String idr =null, pwd =null;
		
		String[] id = new String[]{"ah","bh","ch","dh","eh"};
		String[] pw = new String[]{"1","2","3","4","5"};
		
		
		
		
		while(true) {
			
			System.out.println("1.로그인 하기");
			System.out.println("2.회원가입 하기");
			System.out.println("3.모든 회원보기");
			int num = input.nextInt();
			switch(num) {
			case 1 :	
					System.out.println("아이디와 비밀번호를 눌러주세요");
					System.out.println("ID");
					
					 System.out.println("PW");
					 for(int i =0; i<id.length; i++) {
						 if(idr.equals(id[i])) 
							 if(pwd.equals(pw[i]))
					 }
					 idr = input.next();
					 
					 if(idr == id[0]) {
						
						 if(pwd ==pw[0]) {
							 pwd = input.next();
							 System.out.println("로그인 성공");
						 }
						 else {
							 System.out.println("비밀번호 실패");
						 }
					 }
						 else if(idr == id[0]) {
							 System.out.println("아이디 실패했습니다");
						 }
					
					 }
					 
					 }	
			
					 }
	}
