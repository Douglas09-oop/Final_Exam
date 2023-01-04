public class VIPCustomer extends Customer
{
    //fields
    double discountRate;

    //constructor, takes 4 parameters
    public VIPCustomer(int id, String name, double bal, double rate)
    {
        //Calling the parent class's constructor
        super(id, name, bal);
        discountRate = rate;
    }

    public void display()
    {
        //Calling the parent's class's sdisplay method.
		super.display();
		System.out.println("Discount rate is " + discountRate );
    }
}
