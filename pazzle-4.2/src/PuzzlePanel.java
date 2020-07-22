import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;


public class PuzzlePanel extends JPanel {
	
	private int rows, columns;
	
	private ArrayList<PuzzleButton> buttons = new ArrayList<PuzzleButton>();

	public PuzzlePanel(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		initUI();
	}
	
	private void initUI() {
		this.setLayout(new GridLayout(rows,columns));
		
		for (int i=0; i<rows; ++i) {
			for (int j=0; j<columns; ++j) {
				PuzzleButton button = new PuzzleButton();
				buttons.add(button);
				this.add(button);
			}
		}
		
	}
	
}
