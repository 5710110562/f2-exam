import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class GuiFinal{
	public static void main(String[] args){
		MyFrame frame = new MyFrame("My App");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyFrame extends JFrame {
	private JLabel label;

	public MyFrame(String title){
		super(title);
		
		this.getContentPane().setLayout(new BorderLayout());


		label = new JLabel("");
		label.setFont(label.getFont().deriveFont(18.0f));
		this.add(label, BorderLayout.PAGE_START);

		JButton button = new JButton("Click Me");
		button.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) { 
				counter.count();
				label.setText("" + counter.getValue());
			}
		});
		this.add(button, BorderLayout.PAGE_END);		
	}
}