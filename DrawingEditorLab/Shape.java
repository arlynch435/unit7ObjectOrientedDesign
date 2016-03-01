import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color shade;
    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double c, double r, Color s)
    {
        this.center=c;
        this.radius=r;
        this.shade=s;
    }
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public Color getShade()
    {
        return this.shade;
    }
    public void move (double x, double y)
    {
        this.center.setLocation(x,y);
    }
    public void setRadius(double r)
    {
        this.radius=r;
    }
    public boolean isInside(Point2D.Double point)
    {
        if (point.distance(this.center)<=this.radius)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isOnBorder(Point2D.Double point)
    {
        double EPSILON=1e-6;
        if (Math.abs(point.distance(this.center)-this.radius)<=EPSILON)
        {
            return true;
        }
        else
            return false;
    }
    public abstract void draw(Graphics2D g2, boolean filled);
}
