package q4;

public class copyOfDemo {
public static void main(String[] args) {
	/*
	 * Q4. Write a method called copyOf, which accept an integer array and returns a copy of the given 
           array. The method's signature is as follows:
           public static int[] copyOf(int[] array)
	 */
	int arr[]= {3,5,7,8};
	
	int temp[]=copyOf(arr);
}
	public static int[] copyOf(int arr[]) {
		int temp[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
}
