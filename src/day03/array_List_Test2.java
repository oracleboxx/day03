package day03;

public class array_List_Test2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int[] arr1 = new int[]{10,20,30};
		System.out.println("arr:"+arr.length);
		System.out.println("arr1:"+arr1.length);
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(i+"."+arr[i]);
		}
	}
}
