package paint;

import java.util.*;

/*
 * Function to redo and undo painter
 */
public class UndoRedoPainter extends Painter {

	//private ArrayList<Circle> removed = new ArrayList<>(50);
	UndoRedoPainter() {
		setUndoButtonEnabled(false);
		setRedoButtonEnabled(false);
	}

	//Called when the user pushes the Undo button.
	void undo() {
		if (!getHistory().empty()) {
			setUndoButtonEnabled(true);
			setRedoButtonEnabled(true);
			getUndoHistory().push(getHistory().pop());
			repaint();
		}
	}

	//Called when the user pushes the Redo button.
	void redo() {
		if (!super.getUndoHistory().isEmpty()) {
			getHistory().push(getUndoHistory().pop());
			repaint();
		}
	}

	//Main Function
	public static void main(String[] args) {
		new UndoRedoPainter().setVisible(true);
	}
}