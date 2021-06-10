import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class grid extends JPanel{
	boardstate bs;
	public grid(boardstate bs) {
		//keep track of the board 
		this.bs = bs;
	}
	public void paint(Graphics g) {
	if(bs.board[0][0] == 1) {
		g.drawLine(30,70,90,70); //draw the bottom line of square
		g.drawLine(30,70,30,20); //draw the left vertical line
		g.drawLine(30,20,90,20); //draw the top line
		g.drawLine(90,70,90,20); //draw the right vertical line
	}
	if(bs.board[0][0] == 2) {
		g.drawLine(30,60,60,30); //draw top left of diamond
		g.drawLine(60,30,90,60); //draw top right of diamond
		g.drawLine(30,60,60,90); //draw bottom left of diamond
		g.drawLine(90,60,60,90); //draw bottom right of diamond
	}
	if(bs.board[0][1] == 1) {
		g.drawLine(130,70,190,70);
		g.drawLine(130,70,130,20);
		g.drawLine(130,20,190,20);
		g.drawLine(190,70,190,20);
	}
	if(bs.board[0][1] == 2) {
		g.drawLine(130,60,160,30);
		g.drawLine(160,30,190,60);
		g.drawLine(130,60,160,90);
		g.drawLine(190,60,160,90);
	}
	if(bs.board[0][2] == 1) {
		g.drawLine(230,70,290,70); //draw the bottom line of square
		g.drawLine(230,70,230,20); //draw the left vertical line
		g.drawLine(230,20,290,20); //draw the top line
		g.drawLine(290,70,290,20); //draw the right vertical line
	}
	if(bs.board[0][2] == 2) {
		g.drawLine(230,60,260,30); //draw top left of diamond
		g.drawLine(260,30,290,60); //draw top right of diamond
		g.drawLine(230,60,260,90); //draw bottom left of diamond
		g.drawLine(290,60,260,90); //draw bottom right of diamond
	}
	if(bs.board[1][0] == 1) {
		g.drawLine(30,170,90,170); //draw the bottom line of square
		g.drawLine(30,170,30,120); //draw the left vertical line
		g.drawLine(30,120,90,120); //draw the top line
		g.drawLine(90,170,90,120); //draw the right vertical line
	}
	if(bs.board[1][0] == 2) {
		g.drawLine(30,160,60,130); //draw top left of diamond
		g.drawLine(60,130,90,160); //draw top right of diamond
		g.drawLine(30,160,60,190); //draw bottom left of diamond
		g.drawLine(90,160,60,190); //draw bottom right of diamond
	}
	if(bs.board[1][1] == 1) {
		g.drawLine(130,170,190,170); //draw the bottom line of square
		g.drawLine(130,170,130,120); //draw the left vertical line
		g.drawLine(130,120,190,120); //draw the top line
		g.drawLine(190,170,190,120); //draw the right vertical line
	}
	if(bs.board[1][1] == 2) {
		g.drawLine(130, 160, 160, 130);
		g.drawLine(160, 130, 190, 160);
		g.drawLine(130, 160, 160, 190);
		g.drawLine(190, 160, 160, 190);
	}
	if(bs.board[1][2] == 1) {
		g.drawLine(230,170,290,170); //draw the bottom line of square
		g.drawLine(230,170,230,120); //draw the left vertical line
		g.drawLine(230,120,290,120); //draw the top line
		g.drawLine(290,170,290,120); //draw the right vertical line
	}
	if(bs.board[1][2] == 2) {
		g.drawLine(230,160,260,130); //draw top left of diamond
		g.drawLine(260,130,290,160); //draw top right of diamond
		g.drawLine(230,160,260,190); //draw bottom left of diamond
		g.drawLine(290,160,260,190); //draw bottom right of diamond
	}
	if(bs.board[2][0] == 1) {
		g.drawLine(30,270,90,270); //draw the bottom line of square
		g.drawLine(30,270,30,220); //draw the left vertical line
		g.drawLine(30,220,90,220); //draw the top line
		g.drawLine(90,270,90,220); //draw the right vertical line
	}
	if(bs.board[2][0] == 2) {
		g.drawLine(30,260,60,230); //draw top left of diamond
		g.drawLine(60,230,90,260); //draw top right of diamond
		g.drawLine(30,260,60,290); //draw bottom left of diamond
		g.drawLine(90,260,60,290); //draw bottom right of diamond
	}
	if(bs.board[2][1] == 1) {
		g.drawLine(130,270,190,270); //draw the bottom line of square
		g.drawLine(130,270,130,220); //draw the left vertical line
		g.drawLine(130,220,190,220); //draw the top line
		g.drawLine(190,270,190,220); //draw the right vertical line
	}
	if(bs.board[2][1] == 2) {
		g.drawLine(130,260,160,230); //draw top left of diamond
		g.drawLine(160,230,190,260); //draw top right of diamond
		g.drawLine(130,260,160,290); //draw bottom left of diamond
		g.drawLine(190,260,160,290); //draw bottom right of diamond
	}
	if(bs.board[2][2] == 1) {
		g.drawLine(230,270,290,270); //draw the bottom line of square
		g.drawLine(230,270,230,220); //draw the left vertical line
		g.drawLine(230,220,290,220); //draw the top line
		g.drawLine(290,270,290,220); //draw the right vertical line
	}
	if(bs.board[2][2] == 2) {
		g.drawLine(230, 260, 260, 230);
		g.drawLine(260, 230, 290, 260);
		g.drawLine(230, 260, 260, 290);
		g.drawLine(290, 260, 260, 290);
	}
	//draw grid
	g.drawLine(110, 10, 110, 310); //draw upper vertical line
	g.drawLine(210, 10, 210, 310); //draw lower vertical line
	g.drawLine(10, 110, 310, 110); //draw upper horizontal line
	g.drawLine(10, 210, 310, 210); //draw lower horizontal line
	}
}

