

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold()
    {
        this.card1=null;
        this.card2=null;
    }

    public void addCard(Card newCard)
    {
        if (this.card1==null)
        {
            this.card1=newCard;
        }
        else if (this.card2==null)
        {
            this.card2=newCard;
        }
    }
    public String formatCards()
    {
        String phrase="["+this.card1.format()+"|"+this.card2.format()+"]";
        return phrase;
    }
    public int getExpiredCardCount()
    {
        int expired=0;
        if (this.card1.isExpired())
           expired++;
        if (this.card2.isExpired())
           expired++;
        return expired;
    }

}
