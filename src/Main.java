
public class Main {


    public static void main(String[] args) {
    	
    	int arr[] = new int[]{1,2,3,4,5};
    	int d = 1;
    	int length = arr.length;
    	arr = rotate(arr,d,length);
    	for(int i =0;i<length;i++){
    		System.out.print(arr[i]);
    	}
    }

	private static int[] rotate(int[] arr, int d, int length) {
		int rotateCount =0;
		while(rotateCount<d){
			int swap = arr[0];
			for(int i =0;i<length-1;i++){
				arr[i] = arr[i+1];
			}
			arr[length-1] = swap;
			rotateCount++;
		}
		return arr;
	}
}
