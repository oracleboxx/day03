package day03;

public class protice2 {

	public static void main(String[] args) {
		
		String str =new String("it is a fun hava programming");
		int i =0;
		int num_a = 0 , num_g = 0;
		while(i<str.length()) {
			if(str.charAt(i) == 'a') 
				num_a++;
			
				else if(str.charAt(i) == 'g') 
					num_g++;
					i++;
			}
		System.out.println("a:"+num_a);
		System.out.println("g:"+num_g);
		System.out.println("총 개수:"+str.length());
		}
	
	}


