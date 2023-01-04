public class TestCustomers
{
	public static void main(String[] args)
	{
		//Creating a customer and a vip customer
        Customer customer = new Customer(1001, "Nancy", 1000.23);
        VIPCustomer vipCustomer = new
			VIPCustomer(1002, "Jim", 3456.78, 0.15);

        //Calling the display methods to print the info.
        customer.display();
        vipCustomer.display();
	}
}
