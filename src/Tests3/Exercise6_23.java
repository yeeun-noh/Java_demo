package Tests3;
//정의된 메서드를 작성하고 테스트하기:

public class Exercise6_23 {
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;
		
		int maxNum = arr[0];
		for(int i=1; i<arr.length; i++)
			if(maxNum < arr[i]) maxNum = arr[i];		
		return maxNum;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[]{})); //크기가 0인 배열
	}

}
