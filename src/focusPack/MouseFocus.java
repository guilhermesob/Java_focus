package focusPack;

import java.awt.*;
import java.awt.event.*;

public class MouseFocus extends MouseAdapter {
	public void mouseEntered(MouseEvent mouseEvent) {
		Component component = mouseEvent.getComponent();
		if (!component.hasFocus()) {
			component.requestFocusInWindow();
		}
	}
}