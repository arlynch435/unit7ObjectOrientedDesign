import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClickListener implements ActionListener
{
    /** description of instance variable x (add comment for each instance variable) */
    private int count;

    /**
     * Default constructor for objects of class ClickListener
     */
    public ClickListener()
    {
        this.count=0;
    }
    public void actionPerformed(ActionEvent event)
    {
        this.count++;
        if (count==1)
        {
            System.out.println("I was clicked 1 time!");
        }
        else
        {
            System.out.println("I was clicked "+this.count+" times!");
        }
    }

}
