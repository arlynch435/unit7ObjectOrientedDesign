import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] xPositions;
    private int[] yPositions;
    private int arrayPos;

    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        // initialise instance variables
        this.xPositions = new int[3];
        this.yPositions= new int[3];
    }
    public void addPos(int x, int y)
    {
        this.xPositions[this.arrayPos]=x;
        this.yPositions[this.arrayPos]=y;
        if (this.arrayPos<3)
        {
            this.arrayPos++;
        }
        else
        {
            this.arrayPos=0;
        }
    }

}
