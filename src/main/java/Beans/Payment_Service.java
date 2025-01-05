package Beans;

public class Payment_Service 
{
	private Payment payment;

	
    public Payment_Service() 
    {
		System.out.println("Payment_Service Default Constructor Executed :");
	}

	public Payment_Service(Payment payment)
    {
		System.out.println("PaymentServices :: Param_Constructor:");
		
        this.payment=payment;
    }
	public void setPayment(Payment payment)
	{
		System.out.println("Setter Method called ...");
		this.payment=payment;
	}

    public void doPayment(double billAmount)
    {
       boolean paymentStatus= payment.processPayment(billAmount);

       if(paymentStatus)
       {
           System.out.println("Receipt Printing :");
       }
       else
       {
           System.out.println(" Your Card Declined for payment :");
       }
    }
}
