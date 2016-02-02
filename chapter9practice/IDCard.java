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
}
