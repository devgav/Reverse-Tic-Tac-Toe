import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistener implements MouseListener {
	grid g;
	boardstate bs;
	mouselistener(grid g, boardstate bs) {
		this.g = g;
		this.bs = bs;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//top left panel
		if(x <= 116 && y <= 138) { //give a range to each cell so taht it can be clicked on like a button
			bs.playermove(0, 0); //assign a double array to that cell
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//top middle panel
		if(x < 218 && x >= 116 && y <= 141 && y < 135) { 
			bs.playermove(0, 1);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//top right panel
		if(x >= 222 && x >= 218 && y <= 140 && y < 137) { 
			bs.playermove(0, 2);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//middle left panel
		if(x <= 116 && x < 220 && y <= 240 && y >= 138) {
			bs.playermove(1, 0);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//center panel
		if(x <= 215 && x >= 116 && y <= 238 && y >= 135) {
			bs.playermove(1, 1);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//middle right panel
		if(x >= 219 && x >= 215 && y <= 240 && y > 137) {
			bs.playermove(1, 2);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//bottom left panel
		if(x <= 113 && x < 220 && y < 356 && y > 240){
			bs.playermove(2, 0);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//bottom middle panel
		if(x < 217 && x > 113 && y < 360 && y > 238) {
			bs.playermove(2, 1);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		//bottom right panel
		if(x < 339 && x > 217 && y < 364 && y > 240) {
			bs.playermove(2, 2);
			g.repaint();
			bs.CPU();
			bs.checkWin();
			bs.checkTie();
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
