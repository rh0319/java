package 연습;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class CustomerTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerTable frame = new CustomerTable();
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
	public CustomerTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
		setLocationRelativeTo(null); // 화면 중앙
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String[][] data = Customer.getCustomers();
		//String[][] data = { {"1","2","3","4","5"},{"1","2","3","4","5"},{"1","2","3","4","5"}};
		String[] headers = { "ID","PASS","GENDER","PHONE","NOTE" };
		JTable table = new JTable(data, headers);
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		table.setRowHeight(30); // 테이블의 높이
		JScrollPane scrollPane = new JScrollPane(table);
		
		scrollPane.setLocation(0,0);
		scrollPane.setSize(300, 300);
		contentPane.add(scrollPane);
	}

}
