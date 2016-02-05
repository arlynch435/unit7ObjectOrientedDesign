public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;

    public IDCard(String n, String id)
   {  
      super(n);
      this.idNumber = id;
   }
   public String format()
   {
       String newPhrase=super.format();
       newPhrase+=" ID number: "+this.idNumber;
       return newPhrase;
   }
   public String getCardType()
   {
       return "IDCard";
    }
   public String toString()
   {
       String prim=super.toString();
       prim+="[number="+this.idNumber+"]";
       return prim;
    }
   public boolean equals(Object other)
   {
      //check if this opject and other object are same class. 
       if(this.getClass()==other.getClass())
       {
        //If so cast object to same class
        IDCard otherIDCard=(IDCard)other;
        //second check if superclass determines that this object and the other are equal
        boolean isEqual=super.equals(otherIDCard);
        //third, check if the instance variables of this object and the other are equal
        return isEqual&&this.idNumber.equals(otherIDCard.idNumber);
      }
      return false;
    }
}
