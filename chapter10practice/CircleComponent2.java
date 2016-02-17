import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircleComponent2 extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int radius;
    private Graphics2D g2;
    /**
     * Default constructor for objects of class TriangleComponent
     */
    public CircleComponent2()
    {
        // initialise instance variables
        this.x = 0;
        this.y= 0;
        this.radius=0;
    }
    
    public void paintComponent (Graphics g)
    {
        this.g2=(Graphics2D) g;
            this.makeCircle();
    }
    public void addX(int coord)
    {
        this.x=coord;
    }
    public void addY(int coord)
    {
        this.y=coord;
    }
    public void addRadius(int length)
    {
        this.radius=length;
    }
    public void makeCircle()
    {
        Ellipse2D.Double circle=new Ellipse2D.Double(this.x-this.radius,
                                                     this.y-this.radius,this.radius*2,this.radius*2);
        g2.draw(circle);
    }
}