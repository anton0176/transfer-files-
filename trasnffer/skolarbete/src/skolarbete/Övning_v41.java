package skolarbete;

public class Övning_v41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(2, 7, 3));

	}

	public static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else if (c >= a && c >= b) {
			return c;
		} else {
			return a; // spelar ingen roll
		}

	}
}

