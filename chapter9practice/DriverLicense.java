import java.util.Calendar;
import java.util.GregorianCalendar;
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expYear;

    public DriverLicense(String n, int year)
   {  
      super(n);
      this.expYear = year;
   }
   public String format()
   {
       String newPhrase=super.format();
       newPhrase+=" Expiration year: "+this.expYear;
       return newPhrase;
   }
   public boolean isExpired()
   {
      GregorianCalendar calendar= new GregorianCalendar();
      int currentYear=calendar.get(Calendar.YEAR);
      if (this.expYear<currentYear)
       return true;
      else
       return false;
   }
   public String getCardType()
   {
       return "Driver License";
    }
   public String toString()
   {
       String prim=super.toString();
       prim+="[expiration year="+this.expYear+"]";
       return prim;
    }
    public int getExpYear()
    {
        return this.expYear;
    }
    public boolean equals(Object other)
   {
      //check if this opject and other object are same class. 
       if(this.getClass()==other.getClass())
       {
        //If so cast object to same class
        DriverLicense otherDriver=(DriverLicense)other;
        //second check if superclass determines that this object and the other are equal
        boolean isEqual=super.equals(otherDriver);
        //third, check if the instance variables of this object and the other are equal
        return isEqual&&this.expYear==otherDriver.expYear;
      }
      return false;
    }
}