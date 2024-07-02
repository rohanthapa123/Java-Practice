
import javax.swing.*;
import java.awt.*;
public class SimpleFrameTwo
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(()->
        {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500,300); 
            SimplePanel p = new SimplePanel();
            f.add(p);
            f.setVisible(true);
        }); 
    }    
}
class SimplePanel extends JPanel
{
    private JButton b;
    private JTextField t;
    private JButton s;
    public SimplePanel()
    {
        b = new JButton("Ok");
        t = new JTextField("Enter your name",16);     
        s = new JButton("Submit");
        add(b);
        add(t);        
        add(s);
    }      
}