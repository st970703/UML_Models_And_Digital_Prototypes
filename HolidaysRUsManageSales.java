import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HolidaysRUsManageSales extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JFrame _thisFrame;
	
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolidaysRUsManageSales frame = new HolidaysRUsManageSales();
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
	public HolidaysRUsManageSales() {
		_thisFrame = this;
		setTitle("Holidays R Us - Manage Sales");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(12, 13, 390, 160);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product", "Customer", "Employee", "Date"},
				{"Fiji Adventure", "Mike", "Darius", "01/10/2016"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setEnabled(false);
		contentPane.add(table);
		
		JButton btnAddSales = new JButton("Add Sales");
		btnAddSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSaleScreen addSaleframe = new AddSaleScreen();
				addSaleframe.setVisible(true);
				_thisFrame.dispose();
			}
		});
		btnAddSales.setBounds(12, 201, 105, 25);
		contentPane.add(btnAddSales);
		
		JButton btnDeleteSales = new JButton("Delete Sales");
		btnDeleteSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmDeletion();
			}
		});
		btnDeleteSales.setBounds(132, 201, 105, 25);
		contentPane.add(btnDeleteSales);
		
		btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUs frame = new HolidaysRUs();
				frame.setVisible(true);
				_thisFrame.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(HolidaysRUsManageSales.class.getResource("/javax/swing/plaf/metal/icons/ocean/homeFolder.gif")));
		btnNewButton.setBounds(306, 201, 97, 25);
		contentPane.add(btnNewButton);
	}
	
	private void confirmDeletion() {
		JOptionPane.showConfirmDialog(this, "Please confirm the deletion.\nDeleting a flight may incur a cancellation fee!", "Warning", JOptionPane.YES_NO_OPTION);
	}
}
