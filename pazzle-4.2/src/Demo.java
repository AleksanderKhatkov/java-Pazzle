import javax.swing.JFrame;


public class Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Puzzle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(12*26+20,24*26+45);
		frame.setVisible(true);
		
		PuzzlePanel puzzlePanel = new PuzzlePanel(3,4);
		frame.add(puzzlePanel);
	}
}
