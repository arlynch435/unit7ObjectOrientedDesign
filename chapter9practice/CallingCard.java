public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String cardNumber;
    private int pin;

    public CallingCard(String n, String cNumber, int code)
   {  
      super(n);
      this.cardNumber=cNumber;
      this.pin=code;
   }
   public String getCardType()
   {
       return "CallingCard";
    }
   public String toString()
   {
       String prim=super.toString();
       prim+="[number="+this.cardNumber+"]"+"[pin="+this.pin+"]";
       return prim;
    }
   public String format()
   {
       String newPhrase=super.format();
       newPhrase+=" Card number: "+this.cardNumber+" PIN number: "+this.pin;
       return newPhrase;
   }
}