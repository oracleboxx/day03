package day03;

public class String_ {

	public static void main(String[] args) {
		String str= "java ";
		
	
		str = str.toUpperCase();
		System.out.println("대문자"+str);
		str = "abcd";
		System.out.println("기본"+str);
		System.out.println(str.charAt(0));
		char ch = str.charAt(1);
		System.out.println("ch: "+ch);
		System.out.println(ch=='a');
		System.out.println(ch=='b');
		System.out.println("ch-32:"+(ch-32));
		System.out.println("ch-32:"+(char)(ch-32));
		
		System.out.println();
		char ch2 = str.charAt(0);
		String ss =(char)(ch-32)+"";
		System.out.println(ss);
		
		char ch2 =str.charAt(1);
		String ss =(char)(ch=32)+"";
		
		
		
		str = str.toUpperCase();
		System.out.println(""+str);
		str =str.toLowerCase();
		System.out.println(""+str);
	}

}
