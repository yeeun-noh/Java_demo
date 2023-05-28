package Tests3;
//정의된 메서드를 작성하고 테스트하기:

public class Exercise6_20 {
	public static int[] shuffle(int[] arr) {
		for(int i=0; i<arr.length; i++){
			int tmp = (int)(Math.random()*arr.length);
			int empty = arr[i];
			arr[i] = arr[tmp];
			arr[tmp] = empty;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
