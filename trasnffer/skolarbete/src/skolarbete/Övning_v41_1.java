package sk
olarbete;

import java.util.Scanner;

public class Övning_v41_1 {

	public static void main(String[] args) {
		//lol();
		//System.out.println(minsta(2, 5));
		//count(5);
		//double x = kelvin(33); System.out.println(x);
		//ageControl(65);
		//stair(5); 
	}
	
	public static String lol() {
	
		System.out.println("Hahahahahah");
		return "";
		
		}
	
	// void och string andvänder olika slut kod. String andvänder return "";
	
	
	public static int minsta(int a, int b) {
		
		
		if (a > b) {
		return a;
		}
		
		else if (a < b) {
		return b;}
		
		return 0;
		
	}		 

	public static void count(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
		}
	
	public static double kelvin(double celcius) {
		return celcius + 273.15;
		
	}
 
	public static int ageControl(int age) {
		if (age <= 5) System.out.println("Små barn får inte göra något"); 
		else if (age >= 6 && age <= 12) System.out.println("Du får spela Fortnite."); 
		else if (age >= 13 && age <= 14) System.out.println("Du är tonåring."); 
		else if (age >= 15 && age <= 17) System.out.println("Du får köra moppe."); 
		else if (age >= 18 && age <= 19) System.out.println("Du får köra bil."); 
		else if (age >= 20 && age <= 64) System.out.println(" Du får gå på systemet"); 
		else if (age >= 65 && age <= 99) System.out.println("Du är pensionär."); 
		else if (age >= 100) System.out.println("R.I.P"); 
		return age;
		}

	public static void stair(int steps)
	for (int i =0; i <= steps; i++)



}




	
		