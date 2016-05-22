package ua.voytovych.gui;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

	public void useLayout(JPanel panel) {
		panel.setLayout(null);
	}

	public void addButtonsToPanel(JPanel panel, int buttonCount) {
		JButton button1 = new JButton("Button1");
		button1.setSize(100, 100);
		button1.setBounds(new Rectangle(150, 200, 170, 20));

		JButton button2 = new JButton("Button2");
		button1.setBounds(new Rectangle(100, 100, 150, 30));

		panel.add(button1);
		panel.add(button2);
	}
}
