import java.util.Scanner;
public class Övning2_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("skriv ett tal");
		int x=input.nextInt();
		int sum = 0; 
		while (x > 0) {
			sum = sum + x % 10;
			x = x / 10;
			}
		System.out.println(sum);
	}

}



		