package ¿¬½À;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}// ÁÖ¼®

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null); //È­¸é °¡¿îµ¥
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImgPanel panel = new ImgPanel(new ImageIcon("C:\\ÀÚ¹ÙÇÐ½À\\¿¬½À°ø°£\\Image\\photo1.jpg").getImage());
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35));
		lblNewLabel.setBounds(173, 30, 296, 84);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(266, 227, 92, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(249, 288, 92, 32);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textField.setBounds(353, 227, 116, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		passwordField.setBounds(353, 287, 117, 38);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		btnNewButton.setBounds(497, 227, 92, 98);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new Join().setVisible(true);;
			}
		});
		btnNewButton_1.setBounds(497, 350, 92, 58);
		panel.add(btnNewButton_1);
		frame.pack();
	}
}

class ImgPanel extends JPanel{
	private Image img;
	
	public ImgPanel(Image img){
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}
