
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Kod_1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Vad heter du?");
		String name=input.nextLine();
		System.out.println("VIlken addres har du?");
		String adress=input.nextLine();
		System.out.println("vad är ditt mobil nummer?");
		String mobil=input.nextLine();
		System.out.println("Vilken klass går du i?");
		String klass=input.nextLine();
		
		System.out.println("Namn:" + name);
		System.out.println("Adress:" + adress);
		System.out.println("Mobil nummer:" + mobil);
		System.out.println("Klass:" + klass);
		System.out.println("Wow");

	}

}
