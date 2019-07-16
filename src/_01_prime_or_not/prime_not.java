package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_not {
	public static void main(String[] args) {
			
String number = JOptionPane.showInputDialog("pick a number");
int num = Integer.parseInt(number);
boolean prime = false;
for (int i = 2; i < num/2; i++) 
{
if(num % i == 0)	
{
	prime = true;
	break;
}


}

if(prime == true)
{
	JOptionPane.showMessageDialog(null, "it is not prime");
}
else
{
	JOptionPane.showMessageDialog(null, "it is prime");
}


}
}
