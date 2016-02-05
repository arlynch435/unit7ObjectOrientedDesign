public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }
   public String getCardType()
   {
       return "Card";
    }
   public boolean equals(Object otherObject)
   {
       Card other=(Card)otherObject;
       return this.getName()==other.getName();
    }

   public String format()
   {
      return "Card holder: " + name;
   }
   public String toString()
   {
       return this.getCardType()+"[name="+this.name+"]";
    }
}