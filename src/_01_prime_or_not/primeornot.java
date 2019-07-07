package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	
	String x = JOptionPane.showInputDialog("give me a number");
	int y = Integer.parseInt(x);
	for(int i=2 ; i<y;i++) {
if(y%i==0) {
	System.out.println("not prime");
return;
}

}
System.out.println("prime");


	
		
	}
}

