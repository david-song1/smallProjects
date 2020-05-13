import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class GameButton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameButton extends JButton implements ActionListener
{
    private ImageIcon x,o;
    private byte status;
    
    public GameButton()
    {   
        x = new ImageIcon(this.getClass().getResource("x.jpg"));
        o = new ImageIcon(this.getClass().getResource("o.jpg"));
        this.addActionListener(this);
        status =0;
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
}
