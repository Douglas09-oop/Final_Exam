public class Customer {

    //fields
    private int    customerID;
    private String accountName;
    private double balance;

    //constructor, takes 3 parameters
    public Customer(int id, String name, double bal) {
        customerID  = id;
        accountName = name;
        balance     = bal;
    }

    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: $" + balance);
    }
}
