package skolarbete;
import java.util.Scanner;
public class heml�xa_v41 {

	public static void main(String[] args) {
		//System.out.println(volume(5));
		//System.out.println(reverse("hejsan alla "));
		System.out.println(count("din mamma", 'm'));
		//System.out.println(sjorovare("hej"));
	}
	public static double volume(double radius) {
		return (4 * Math.PI * Math.pow(radius, 3) / 3);
		
	}
	
	public static String reverse(String str) {
		
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
		return reverse;
	}
	
	
		public static int count(String str, char c) 
	    {
	        int counter = 0;
	        for (int i = 0; i<str.length(); i++) {
	            if(str.charAt(i) == c)
	                counter++;
	        }
	        return counter;
	    }
		
		public static String sjorovare(String str) 
	    {
	        String klartext = "";
	        char kons[] = "bcdfghjklmnpqrstvwxz".toCharArray();
	        for (int i = 0; i < str.length(); i++) 
	        {
	            String add = "";
	            for(int y = 0; y < kons.length; y++) {
	                if(str.charAt(i) == kons[y]) {
	                    add = "o" + str.charAt(i);
	                    break;
	                }
	            }
	            klartext = klartext + str.charAt(i) + add; 
	        }
	        return klartext;
	    }


}
