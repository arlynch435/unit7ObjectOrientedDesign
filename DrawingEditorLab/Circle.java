import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /**
     * Default constructor for objects of class Shape
     */
    public Circle(Point2D.Double c, double r, Color s)
    {
        super(c,r,s);
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        Ellipse2D.Double circle=new Ellipse2D.Double(this.getCenter().getX()-this.getRadius(),
                                                     this.getCenter().getY()-this.getRadius(),
                                                     this.getRadius()*2,this.getRadius()*2);
        g2.setColor(this.getShade());
        g2.draw(circle);
        if (filled)
        {
            g2.fill(circle);
        }
    }

}
