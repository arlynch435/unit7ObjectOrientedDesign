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
   public boolean equals(Object other)
   {
      //check if this opject and other object are same class. 
       if(this.getClass()==other.getClass())
       {
        //If so cast object to same class
        CallingCard otherCall=(CallingCard)other;
        //second check if superclass determines that this object and the other are equal
        boolean isEqual=super.equals(otherCall);
        //third, check if the instance variables of this object and the other are equal
        return isEqual&&this.cardNumber.equals(otherCall.cardNumber)&&this.pin==otherCall.pin;
      }
      return false;
    }
}