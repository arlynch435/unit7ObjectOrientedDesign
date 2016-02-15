import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class TriangleViewer
{
    private static final int FRAME_WIDTH=600;
    private static final int FRAME_HEIGHT=800;
    private JFrame frame;
    //private JPanel panel;
    private TriangleComponent triangle;
    public TriangleViewer()
    {
        this.frame=new JFrame();
        ClickListener listener=new ClickListener();
        this.triangle=new TriangleComponent();
        this.frame.add(triangle);
        this.frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        TriangleViewer view= new TriangleViewer();
    }
        public class ClickListener implements MouseListener
    {
        private int count;
        public ClickListener()
        {
            this.count=0;
        }
        public void mousePressed(MouseEvent event)
         {// Called when a mouse button has been pressed on a component
            }
        public void mouseReleased(MouseEvent event)
         {// Called when a mouse button has been released on a component
            }
        public void mouseClicked(MouseEvent event)
        {// Called when the mouse has been clicked on a component
            if (this.count<4)
          {
              this.count++;
              triangle.addPos(event.getX(),event.getY());
              if (this.count==1)
              {
                  triangle.makeDot(count-1);
                }
              else
              {
                  triangle.makeDot(count-1);
                  triangle.makeLine(count-2,count-1);
                  if (count==3)
                  {
                      triangle.makeLine(0,count-1);
                    }
                }
            }
          else
          {
              this.count=1;
              triangle.clear();
            }
           }
        public void mouseEntered(MouseEvent event)
         {// Called when the mouse enters a component
            }
        public void mouseExited(MouseEvent event)
         {// Called when the mouse exits a component 
            }
    
    }
}
