import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
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
    private Graphics2D g2;
    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        // initialise instance variables
        this.xPositions = new int[3];
        this.yPositions= new int[3];
        this.arrayPos=0;
    }
    public void paintComponent (Graphics g)
    {
        this.g2=(Graphics2D) g;
        if (this.arrayPos==1)
        {
            this.makeDot(0);
        }
        if (this.arrayPos==2)
        {
            this.makeDot(0);
            this.makeDot(1);
            this.makeLine(0,1);
        }
        if (this.arrayPos==3)
        {
            this.makeDot(0);
            this.makeDot(1);
            this.makeDot(2);
            this.makeLine(0,1);
            this.makeLine(0,2);
            this.makeLine(1,2);
        }
    }
    public void addPos(int x, int y)
    {
        if (this.arrayPos<3)
       {
        this.xPositions[this.arrayPos]=x;
        this.yPositions[this.arrayPos]=y;
        this.arrayPos++;
       }
       else
       {
           this.arrayPos=0;
        }
       
    }
    public void makeDot(int point)
    {
        Ellipse2D.Double circle=new Ellipse2D.Double(this.xPositions[point],
                                                     this.yPositions[point],5,5);
        g2.draw(circle);
    }
    public void makeLine(int a, int b)
    {
        Line2D.Double line=new Line2D.Double(this.xPositions[a],this.yPositions[a],
                                                this.xPositions[b],this.yPositions[b]);
        g2.draw(line);
    }
}
