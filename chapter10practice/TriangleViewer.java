import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class TriangleViewer
{
    private static final int FRAME_WIDTH=600;
    private static final int FRAME_HEIGHT=800;
    private JFrame frame;
    private TriangleComponent triangle;
    public TriangleViewer()
    {
        this.frame=new JFrame();
        ClickListener listener=new ClickListener();
        this.triangle=new TriangleComponent();
        this.triangle.addMouseListener(listener);
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
        public ClickListener()
        {
        }
        public void mousePressed(MouseEvent event)
         {// Called when a mouse button has been pressed on a component
            }
        public void mouseReleased(MouseEvent event)
         {// Called when a mouse button has been released on a component
            }
        public void mouseClicked(MouseEvent event)
        {// Called when the mouse has been clicked on a component
               triangle.addPos(event.getX(),event.getY());
               triangle.repaint();
           }
        public void mouseEntered(MouseEvent event)
         {// Called when the mouse enters a component
            }
        public void mouseExited(MouseEvent event)
         {// Called when the mouse exits a component 
            }
    
    }
}
