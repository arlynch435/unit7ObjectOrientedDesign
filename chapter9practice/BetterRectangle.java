import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int w, int h)
    {
        super(x,y,w,h);
    }

    public int getPerimeter()
    {
        int perim=2*super.height;
        perim+=(2*super.width);
        return perim;
    }
    public int getArea()
    {
        return super.height*super.width;
    }

}
