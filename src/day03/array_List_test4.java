package day03;

public class array_List_test4 {

	public static void main(String[] args) {
		String[] s =new String[3];
		double[] d =new double[3];
		System.out.println(s[0]);
		System.out.println(d[0]);
		
		String[] s1 = {"가","나","다"};
		double[] d1 = {1.1,1.2,1.3};
		
	
	for(int i =0; i<s1.length; i++) {
		System.out.println(s1[i]);
	}
	for(String x :s1) {
		System.out.println(x);
	}
	int d2 =1;
	for(double dd:d1) {
		System.out.println(d2+":\t"+dd);
		d2 ++;
	}

}
}
