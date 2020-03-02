package ¿¬½À;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField pass;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel laJoin = new JLabel("\uD68C\uC6D0 \uAC00\uC785 \uD398\uC774\uC9C0");
		laJoin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		laJoin.setHorizontalAlignment(SwingConstants.CENTER);
		laJoin.setBounds(69, 10, 466, 47);
		panel.add(laJoin);
		
		JLabel la1 = new JLabel("\uC544\uC774\uB514");
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		la1.setBounds(46, 98, 75, 33);
		panel.add(la1);
		
		JLabel la2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		la2.setHorizontalAlignment(SwingConstants.CENTER);
		la2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		la2.setBounds(46, 156, 75, 33);
		panel.add(la2);
		
		JLabel la3 = new JLabel("\uC131\uBCC4");
		la3.setHorizontalAlignment(SwingConstants.CENTER);
		la3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		la3.setBounds(46, 220, 75, 33);
		panel.add(la3);
		
		JLabel la4 = new JLabel("\uD2B9\uC774\uC0AC\uD56D");
		la4.setHorizontalAlignment(SwingConstants.CENTER);
		la4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		la4.setBounds(265, 156, 75, 33);
		panel.add(la4);
		
		JLabel la5 = new JLabel("\uC804\uD654\uBC88\uD638");
		la5.setHorizontalAlignment(SwingConstants.CENTER);
		la5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		la5.setBounds(265, 98, 75, 33);
		panel.add(la5);
		
		id = new JTextField();
		id.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		id.setBounds(129, 98, 124, 33);
		panel.add(id);
		id.setColumns(10);
		
		pass = new JTextField();
		pass.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		pass.setColumns(10);
		pass.setBounds(129, 156, 124, 33);
		panel.add(pass);
		
		phone = new JTextField();
		phone.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		phone.setColumns(10);
		phone.setBounds(352, 98, 124, 33);
		panel.add(phone);
		
		JTextArea note = new JTextArea();
		note.setBorder(new LineBorder(Color.GRAY));
		note.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		note.setBounds(352, 164, 124, 111);
		panel.add(note);
		
		String[] combo = { "³²¼º" , "¿©¼º" };
		JComboBox gender = new JComboBox(combo);
		gender.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		gender.setBounds(129, 220, 124, 33);
		panel.add(gender);
		
		JButton btnJoin = new JButton("\uD68C\uC6D0 \uAC00\uC785");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idTxt = id.getText();
				String passTxt = pass.getText();
				String genderTxt = gender.getSelectedItem().toString();
				String phoneTxt = phone.getText();
				String noteTxt = note.getText();
				Customer.createCustomer(idTxt, passTxt, genderTxt, phoneTxt, noteTxt );
			}
		});
		btnJoin.setBackground(Color.PINK);
		btnJoin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		btnJoin.setBounds(194, 291, 158, 47);
		panel.add(btnJoin);
	}
}
