
public class test {

	public class testing {  
	    public static void main(String[] args) {
	        String song;
	        int amount = 0;
	        Scanner kdb = new Scanner(System.in);
	        while (amount < 5) {
	            System.out.println("enter song:");
	            song = kdb.next();
	            amount++;
	            System.out.println("you chose " + song + amount + " more required");
	        }
	    }
	}