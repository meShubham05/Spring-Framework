package Beans;

public class Credit_Card implements Payment 
{ 
	public Credit_Card()
	{
		System.out.println("Credit Card :: Constructor :");
	}
	 public boolean processPayment(double billAmount) 
	 {
	        System.out.println("CreditCard payment successfully...");
	        return true;
	 }

}
