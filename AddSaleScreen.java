import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSaleScreen extends JFrame {
	
	private JPanel contentPane;
	private JFrame thisFrame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSaleScreen frame = new AddSaleScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public AddSaleScreen() {
		thisFrame = this;
		setTitle("Holidays R Us - Add Sales");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduct = new JLabel("Product:");
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProduct.setBounds(45, 40, 100, 35);
		contentPane.add(lblProduct);
		
		JLabel lblCustomer = new JLabel("Customer:");
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCustomer.setBounds(45, 88, 100, 35);
		contentPane.add(lblCustomer);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate.setBounds(45, 139, 100, 35);
		contentPane.add(lblDate);
		
		JLabel lblNewLabel = new JLabel("Employee: Mike Lee");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(38, 193, 220, 35);
		contentPane.add(lblNewLabel);
		
		JTextField txtrFijiAdventure = new JTextField();
		txtrFijiAdventure.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrFijiAdventure.setText("Fiji Adventure");
		txtrFijiAdventure.setBounds(193, 42, 200, 35);
		contentPane.add(txtrFijiAdventure);
		
		JTextField txtrWayneLiang = new JTextField();
		txtrWayneLiang.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrWayneLiang.setText("Wayne Liang");
		txtrWayneLiang.setBounds(193, 93, 200, 35);
		contentPane.add(txtrWayneLiang);
		
		JTextField textArea_2 = new JTextField();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_2.setText("02/10/2016");
		textArea_2.setBounds(193, 141, 200, 35);
		contentPane.add(textArea_2);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageSales frame = new HolidaysRUsManageSales();
				frame.setVisible(true);
				thisFrame.dispose();
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirm.setBounds(193, 205, 97, 35);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageSales frame = new HolidaysRUsManageSales();
				frame.setVisible(true);
				thisFrame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(312, 205, 97, 35);
		contentPane.add(btnCancel);
	}
}
