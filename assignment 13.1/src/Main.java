import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args){
		int frameHeight = 375; //375
		int frameWidth = 350;
		boardstate bs = new boardstate(); //keeping track of boardstate
		grid g = new grid(bs); //grid can use the boardstate
		JFrame frame = new JFrame("Inverse TicTacToe"); //create frame object
		frame.setSize(frameWidth, frameHeight); //set the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close frame
		frame.getContentPane().add(g); //grid added to frame 
		frame.addMouseListener(new mouselistener(g, bs)); //addMouseListener function to frame
		frame.setResizable(false); //doesn't allow the user to resize
		frame.setVisible(true);
	}
}
