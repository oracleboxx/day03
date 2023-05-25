package day03;

public class array_List_test5 {

	public static void main(String[] args) {
		int[] arr = new int[] {10,54,13,17,25,30};
		
		for(int i =0; i<arr.length; i++) {
			
				if(arr[i]%2 ==0) {
					System.out.println("짝 수");
			}
				else {
					System.out.println("홀 수");
				}
		}
		for(int x : arr) {
			System.out.println(x);
			if(x%2 == 0) {
				System.out.println("짝 수");
			}
			else {
				System.out.println("홀 수");
			}
		}
	}

}
