abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    // Set up a staff member using the specific information
    public StaffMember (String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //Returns a string including the basic employee information
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    //derived classes must define the pay method for each type of employee
    public abstract double pay();
}
