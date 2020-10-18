package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		for(int i=1; i<a;i++) {
			int sum = firstNum + secNum;
			secNum = firstNum;
			firstNum = sum;
			System.out.println(sum);
		}

	}

}
