import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HolidaysRUsManageProducts extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolidaysRUsManageProducts frame = new HolidaysRUsManageProducts();
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
	public HolidaysRUsManageProducts() {
		setTitle("Holidays R Us - Manage Products");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product", "Price($)"},
				{"Flight", null},
				{"AirNZ flight", "500"},
				{"Hotel Deal", null},
				{"Coconut Hut Resort", "600"},
				{"Package Deal", null},
				{"AirNZ flight + Coconut Hut Resort", "1000"},
				{"Product Special", null},
				{"Fiji Adventure", null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.setBounds(12, 13, 408, 176);
		contentPane.add(table_1);
		
		JButton btnAddFlights = new JButton("Add Flights");
		btnAddFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFlightScreen addFlightFrame = new addFlightScreen();
				addFlightFrame.setVisible(true);
			}
		});
		btnAddFlights.setBounds(29, 215, 97, 25);
		contentPane.add(btnAddFlights);
		
		JButton button = new JButton("Add Hotels");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addHotelDealScreen addHotelDealFrame = new addHotelDealScreen();
				addHotelDealFrame.setVisible(true);
			}
		});
		button.setBounds(204, 215, 97, 25);
		contentPane.add(button);
	}
}
