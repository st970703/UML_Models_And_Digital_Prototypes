import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HolidaysRUsManageCustomers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolidaysRUsManageCustomers frame = new HolidaysRUsManageCustomers();
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
	public HolidaysRUsManageCustomers() {
		setTitle("Holidays R Us - Manage Customers");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Address", "Credit Card Number"},
				{"Injae Park", "Birkenhead, Auckland", "379582298208984"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(94);
		table.getColumnModel().getColumn(1).setPreferredWidth(197);
		table.getColumnModel().getColumn(2).setPreferredWidth(182);
		table.setBounds(12, 13, 408, 176);
		contentPane.add(table);
		
		JButton btnAddCustomers = new JButton("Add Customers");
		btnAddCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCustomerScreen frame = new AddCustomerScreen(AddOrModify.Add);
				frame.setVisible(true);
			}
		});
		btnAddCustomers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddCustomers.setBounds(22, 202, 140, 30);
		contentPane.add(btnAddCustomers);
		
		JButton btnModifyCustomers = new JButton("Modify Customers");
		btnModifyCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCustomerScreen frame = new AddCustomerScreen(AddOrModify.Modify);
				frame.setVisible(true);
			}
		});
		btnModifyCustomers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModifyCustomers.setBounds(171, 202, 140, 30);
		contentPane.add(btnModifyCustomers);
		
		btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//hides the second JFrame and returns to the primary
			}
		});
		btnNewButton.setIcon(new ImageIcon(HolidaysRUsManageSales.class.getResource("/javax/swing/plaf/metal/icons/ocean/homeFolder.gif")));
		btnNewButton.setBounds(323, 202, 97, 25);
		contentPane.add(btnNewButton);
	}
}
