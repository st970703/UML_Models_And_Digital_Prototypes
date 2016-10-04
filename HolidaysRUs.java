import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

public class HolidaysRUs extends JFrame {

	private JPanel contentPane;
	private JFrame thisFrame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolidaysRUs frame = new HolidaysRUs();
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
	public HolidaysRUs() {
		thisFrame = this;
		setTitle("Holidays R Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnManageSales = new JButton("Manage Sales");
		btnManageSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HolidaysRUsManageSales saleFrame = new HolidaysRUsManageSales();
				saleFrame.setVisible(true);
				thisFrame.dispose();
			}
		});
		contentPane.setLayout(null);
		btnManageSales.setBounds(120, 86, 200, 32);
		contentPane.add(btnManageSales);
		
		JButton btnManageCustomers = new JButton("Manage Customers");
		btnManageCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageCustomers customerFrame = new HolidaysRUsManageCustomers();
				customerFrame.setVisible(true);
				thisFrame.dispose();
			}
		});
		btnManageCustomers.setBounds(120, 140, 200, 32);
		contentPane.add(btnManageCustomers);
		
		JButton btnManageProducts = new JButton("Manage Products");
		btnManageProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageProducts productFrame = new HolidaysRUsManageProducts();
				productFrame.setVisible(true);
				thisFrame.dispose();
			}
		});
		btnManageProducts.setBounds(120, 194, 200, 32);
		contentPane.add(btnManageProducts);
		
		JTextPane txtpnHolidaysRUs = new JTextPane();
		txtpnHolidaysRUs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnHolidaysRUs.setForeground(Color.BLUE);
		txtpnHolidaysRUs.setBackground(UIManager.getColor("Button.background"));
		txtpnHolidaysRUs.setText("Holidays R Us Travel Management System\r\n\r\nPlease select one of the followings:");
		txtpnHolidaysRUs.setBounds(77, 13, 289, 62);
		txtpnHolidaysRUs.setEditable(false);
		contentPane.add(txtpnHolidaysRUs);
	}
}
