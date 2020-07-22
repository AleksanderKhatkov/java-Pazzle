import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class PuzzleButton extends JButton {
	
	public PuzzleButton() {
		super();
		initUI();
	}

	private void initUI() {
		addMouseListener(new MouseAdapter(){

			@Override
			public void mouseEntered(MouseEvent me) {
				setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
			}

			@Override
			public void mouseExited(MouseEvent me) {
				setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
			}
			
		});
	}
}
