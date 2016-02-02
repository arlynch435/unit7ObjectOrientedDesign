

/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class CardTester
     */
    public CardTester()
    {
    }
    public static void testSomething()
    {
        CallingCard CarlyRae=new CallingCard("Carly Rae","XTY667",2553);
        DriverLicense oops=new DriverLicense("James Zhu",1998);
        Billfold wallet= new Billfold();
        wallet.addCard(CarlyRae);
        wallet.addCard(oops);
        System.out.println(wallet.formatCards());
    }
    public static void testExpiration()
    {
        CallingCard CarlyRae=new CallingCard("Carly Rae","XTY667",2553);
        DriverLicense oops=new DriverLicense("James Zhu",1998);
        Billfold wallet= new Billfold();
        wallet.addCard(CarlyRae);
        wallet.addCard(oops);
        System.out.println("Expired Cards: "+wallet.getExpiredCardCount());
    }
}
