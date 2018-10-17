import java.util.Scanner;
public class Övning2_part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("skriv ett tal");
		x=input.nextInt();
		System.out.println("skriv ett till tal");
		y=input.nextInt();
		if (x<y) {
			System.out.println( y + " är större" );
			}
		if (y<x)
		System.out.println( x + " är större"  );
	}

}
		
	