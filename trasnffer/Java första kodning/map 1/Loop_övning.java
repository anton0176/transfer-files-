import static javax.swing.JOptionPane.*;
public class Loop_övning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y = 0;
		float c =0;
		String indata;
		indata = showInputDialog("vilken multiplikaton");
		x = Integer.parseInt (indata);
			
			while(y<100){
				System.out.println( c );
				c = c+x;
				
				y= y+1;
				
				
			}
		}
	}