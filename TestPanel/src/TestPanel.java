import javax.swing.*;
import java.awt.*;

public class TestPanel extends JFrame{
	
	public TestPanel(){
		
		setLayout(null);
		setSize(290,250);
		setTitle("My Panel");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setSize(290,250);
		mainPanel.setBackground(Color.BLACK);
		
		JPanel red = new JPanel();
		red.setLayout(null);
		red.setSize(75,75);
		red.setLocation(10,40);
		red.setBackground(Color.RED);
		
		JPanel green = new JPanel();
		green.setLayout(null);
		green.setSize(75,75);
		green.setLocation(100,40);
		green.setBackground(Color.GREEN);
		
		JPanel yellow = new JPanel();
		yellow.setLayout(null);
		yellow.setSize(75,75);
		yellow.setLocation(190,40);
		yellow.setBackground(Color.YELLOW);
		
		JButton rb = new JButton("Red");
		rb.setSize(75,25);
		rb.setLocation(10,125);
		
		JButton gb = new JButton("Green");
		gb.setSize(75,25);
		gb.setLocation(100,125);
		
		JButton yb = new JButton("Yellow");
		yb.setSize(75,25);
		yb.setLocation(190,125);
		
		JLabel rl = new JLabel("Red");
		rl.setSize(75, 25);
		rl.setLocation(36,20);
		rl.setForeground(Color.RED);

		JLabel gl = new JLabel("Green");
		gl.setSize(75,25);
		gl.setLocation(120,20);
		gl.setForeground(Color.GREEN);
		
		JLabel yl = new JLabel("Yellow");
		yl.setSize(75,25);
		yl.setLocation(210,20);
		yl.setForeground(Color.YELLOW);
		
		
		add(red);
		add(green);
		add(yellow);
		add(rb);
		add(gb);
		add(yb);
		add(rl);
		add(gl);
		add(yl);
		add(mainPanel);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	
	public static void main(String Args[]) {
		
		new TestPanel();
	}
}
