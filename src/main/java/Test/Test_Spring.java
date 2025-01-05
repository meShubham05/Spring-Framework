package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Payment_Service;

public class Test_Spring 
{
	public static void main(String[] args) 
	{		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Payment_Service service = context.getBean(Payment_Service.class);
		service.doPayment(200.50);;
		
		
	}
}
