
import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class StartScreen extends JFrame {
    public StartScreen()    {
        super("Collegian 206 Controller");
        
        //Initializes the initial Frame
        getContentPane().setLayout(new BorderLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize (1225, 700);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
