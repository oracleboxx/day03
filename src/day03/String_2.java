package day03;

public class String_2 {

	public static void main(String[] args) {
		String str1 = "test";
		String id ="aaa ";
		String idx="aaa";
		System.out.println(id.equals(idx));
		System.out.println(id +".");
		System.out.println(idx+".");
		System.out.println(id.trim()+".");
		String addr ="서울/번호/이름";
		String[] addrs =addr.split("/");
		for(String x : addrs) {
			System.out.println(x);
		}
			String repl = addr.replace("/", "==>");
			System.out.println(repl);
		}
	}


