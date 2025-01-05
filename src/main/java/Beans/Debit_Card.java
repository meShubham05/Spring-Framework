package Beans;

public class Debit_Card implements Payment {

	public Debit_Card()
	{
		System.out.println("DebitCard Payment :: Constructor :");
	}
	 public boolean processPayment(double billAmount) 
	 {
	        System.out.println("DebitCard payment successfully...");
	        return true;
	 }
}
