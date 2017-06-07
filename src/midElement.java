public class midElement {

	public static void main(String[] args) {
		int [] arr=new int[]{17,3,5,6,6,14,-1,0};		
		
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i-1]<=arr[i] && arr[i+1]<=arr[i]){
				System.out.println(arr[i]);
			}
		}
		
	}

}
