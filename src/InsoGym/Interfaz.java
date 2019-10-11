package InsoGym;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		JPanel top = new JPanel();
		top.setBackground(Color.ORANGE);
		frame.getContentPane().add(top, BorderLayout.NORTH);
		
		JPanel pie = new JPanel();
		pie.setBackground(Color.ORANGE);
		frame.getContentPane().add(pie, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Marta\\Desktop\\INSO_Eclipse\\InsoGym\\images\\logo.jpg"));
		top.add(label);
		
		JLabel lblAppgym = new JLabel("APPGYM");
		pie.add(lblAppgym);
		
		JPanel derecha = new JPanel();
		derecha.setBackground(Color.GREEN);
		frame.getContentPane().add(derecha, BorderLayout.EAST);
		
		JPanel center = new JPanel();
		frame.getContentPane().add(center, BorderLayout.CENTER);
		frame.setBounds(0, 0, 1278, 633);
		
	
		
		JPanel izq = new JPanel();
		izq.setBackground(Color.PINK);
		frame.getContentPane().add(izq, BorderLayout.WEST);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		center.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		center.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		center.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		center.add(passwordText);

		JButton loginButton = new JButton("Aceptar");
		loginButton.setBounds(10, 80, 80, 25);
		center.add(loginButton);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
