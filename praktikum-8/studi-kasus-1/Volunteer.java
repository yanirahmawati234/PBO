public class Volunteer  extends StaffMember
{
    // Set up a volunteer using specified information
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    // Returns a zero pay value for volunteer
    @Override
    public double pay()
    {
        return  0.0;
    }
}
