import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CircleViewer1
{
    private static final int FRAME_WIDTH=800;
    private static final int FRAME_HEIGHT=800;
    private JFrame frame;
    private JPanel panel;
    private CircleComponent1 circle;
    private JButton draw;
    private JOptionPane input;
    public CircleViewer1()
    {
        this.frame=new JFrame();
        this.panel= new JPanel();
        DoneListener drawListener=new DoneListener();
        this.circle=new CircleComponent1();
        this.draw=new JButton("Draw!");
        this.draw.addActionListener(drawListener);
        this.input= new JOptionPane();
        this.panel.add(draw);
        this.frame.add(this.panel);
        this.frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        CircleViewer1 view=new CircleViewer1();
    }
        public class DoneListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            circle.repaint();
        }
    }

}
