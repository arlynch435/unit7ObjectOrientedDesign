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
public class CircleMakerComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private double radius;
    private Graphics2D g2;
    /**
     * Default constructor for objects of class TriangleComponent
     */
    public CircleMakerComponent()
    {
        // initialise instance variables
        this.x=0;
        this.y=0;
        this.radius=0;
    }
    public void paintComponent (Graphics g)
    {
        this.g2=(Graphics2D) g;
        this.makeDot();
    }
    public void addPos(int mousex, int mousey)
    {
       this.x=mousex;
       this.y=mousey;
    }
    public void addRadius(int newX, int newY)
    {
        double xdistance=newX-x;
        double ydistance=newY-y;
        double alldistance=Math.pow(xdistance,2);
        alldistance+=Math.pow(ydistance,2);
        this.radius=Math.sqrt(alldistance);
    }
    public void makeDot()
    {
        Ellipse2D.Double circle=new Ellipse2D.Double(this.x-this.radius,
                                                     this.y-this.radius,(this.radius*2),(this.radius*2));
        g2.draw(circle);
    }
}
