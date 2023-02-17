import javax.swing.JFrame;

public class ZachGrinbergFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.getContentPane().add(new Example(500,500));
        frame.pack();
        frame.setVisible(true);

    }
}