import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game in a very
 * simple GUI window.
 * 
 * @author Lynn Marshall
 * @version November 8, 2012
 */

public class TicTacToeFrame extends TicTacToe
{ 
    private JTextArea status; // text area to print game status
    private JScrollPane scroll;
    private JFrame frame;
    /** 
     * Constructs a new Tic-Tac-Toe board and sets up the basic
     * JFrame containing a JTextArea in a JScrollPane GUI.
     */
    public TicTacToeFrame()
    { 
        
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        status = new JTextArea(10,10);
        scroll = new JScrollPane(status);
        status.setEditable(false);
        
        frame.add(status);
        
        frame.pack();
        frame.setVisible(true);
        
        playGame();
    }

    /**
     * Prints the board to the GUI using toString().
     */
    public void print() 
    {  
        status.setText(toString());
    }

}