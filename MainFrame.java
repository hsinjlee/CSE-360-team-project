import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		super("To Do List Unlimited 2019");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("add new to do list");
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
