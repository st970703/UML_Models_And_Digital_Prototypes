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

public class HolidaysRUs extends JFrame {

	private JPanel contentPane;
	
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
			}
		});
		contentPane.setLayout(null);
		btnManageSales.setBounds(120, 76, 200, 32);
		contentPane.add(btnManageSales);
		
		JButton btnManageCustomers = new JButton("Manage Customers");
		btnManageCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageCustomers customerFrame = new HolidaysRUsManageCustomers();
				customerFrame.setVisible(true);
			}
		});
		btnManageCustomers.setBounds(120, 130, 200, 32);
		contentPane.add(btnManageCustomers);
		
		JButton btnManageProducts = new JButton("Manage Products");
		btnManageProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageProducts productFrame = new HolidaysRUsManageProducts();
				productFrame.setVisible(true);
			}
		});
		btnManageProducts.setBounds(120, 184, 200, 32);
		contentPane.add(btnManageProducts);
	}
}
