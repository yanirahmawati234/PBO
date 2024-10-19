public class Staff {
    StaffMember[] staffList;

    // Set up the list of staff member
    public Staff () {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "123 Main Line", "555-0469", "123-45-6789", 1246.15);
        staffList[2] = new Employee("Woody", "123 Main Line", "555-0469", "123-45-6789", 10.55);
        staffList[3] = new Hourly("Diane", "123 Main Line", "555-0469", "123-45-6789", 1169.23);
        staffList[4] = new Volunteer("Norm", "123 Main Line", "555-0469");
        staffList[5] = new Volunteer("Cliff", "123 Main Line", "555-0469");
        staffList[6] = new Commission("Yani", "Cimahi", "555-0469", "085873", 6.25, 0.2);
        staffList[7] = new Commission("Rahma", "Bandung", "555-0469", "085873060", 9.75, 0.15);
        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);
        ((Commission)staffList[6]).addHours(35);
        ((Commission)staffList[7]).addHours(40);
        ((Commission)staffList[6]).addSales(400.00);
        ((Commission)staffList[7]).addSales(950.00);
    }

    // Pays all staff members
    public void payday()
    {
        double amount;
        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);
            amount = staffList[count].pay();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("---------------------------------------------------");
        }
    }
}
