public class Customer extends Person {
    private int CustomerNumber;
    private boolean IsMailingList;

    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public void setMailingList(boolean mailingList) {
        IsMailingList = mailingList;
    }

    public String getMailingList() {
        String str;
        if (IsMailingList == true)
            str = "Yes";
        else
            str = "No";
        return str;

    }

    @Override
    public String toString() {
        return "Person:" +
			"\nName: " + getName() +
			"\nAddress: " + getAddress() +
			"\nPhone: " + getPhone() +
			"\nBirtday: " + getBirtday() +
			"\nCustomerNumber: " + CustomerNumber +
			"\nMailingList: " + getMailingList();
    }
}
