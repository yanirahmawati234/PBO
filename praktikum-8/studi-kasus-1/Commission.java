public class Commission extends Hourly {
    protected double totalSales;
    protected double commissionRate;

    public Commission (String eName, String eAddress, String ePhone,
                       String socSecNumber, double rate, double comRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }

    public void addSales(double totalSales)
    {
        this.totalSales = totalSales;
    }

    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + this.totalSales;
        return result;
    }

    @Override
    public double pay()
    {
        double payment = super.pay() + (this.totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }
}
