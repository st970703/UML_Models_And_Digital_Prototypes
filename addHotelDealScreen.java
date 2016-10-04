import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addHotelDealScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtPullmanHotel;
	private JTextField textField_2;
	private JFrame _thisFrame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addHotelScreen frame = new addHotelScreen();
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
	public addHotelDealScreen() {
		_thisFrame = this;
		setTitle("Holidays R Us - Add Hotel Deals");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrice = new JLabel("Price ($):");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrice.setBounds(37, 35, 150, 30);
		contentPane.add(lblPrice);

		JLabel lblHotel = new JLabel("Hotel:");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHotel.setBounds(37, 79, 150, 30);
		contentPane.add(lblHotel);

		JLabel lblDurationdays = new JLabel("Duration (Days):");
		lblDurationdays.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDurationdays.setBounds(37, 122, 150, 30);
		contentPane.add(lblDurationdays);

		textField = new JTextField();
		textField.setText("600");
		textField.setBounds(199, 40, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		txtPullmanHotel = new JTextField();
		txtPullmanHotel.setText("Pullman Hotel");
		txtPullmanHotel.setColumns(10);
		txtPullmanHotel.setBounds(199, 84, 200, 25);
		contentPane.add(txtPullmanHotel);

		textField_2 = new JTextField();
		textField_2.setText("1");
		textField_2.setColumns(10);
		textField_2.setBounds(199, 127, 200, 25);
		contentPane.add(textField_2);

		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					confirmInvalidInput(0);
				} else if (txtPullmanHotel.getText().equals("")) {
					confirmInvalidInput(1);
				} else if (textField_2.getText().equals("")) {
					confirmInvalidInput(2);
				} else {
					HolidaysRUsManageProducts frame = new HolidaysRUsManageProducts();
					frame.setVisible(true);
					_thisFrame.dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(199, 199, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidaysRUsManageProducts frame = new HolidaysRUsManageProducts();
				frame.setVisible(true);
				_thisFrame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(323, 200, 97, 25);
		contentPane.add(btnCancel);
	}
	private void confirmInvalidInput(int option) {
		if(option == 0) {
			JOptionPane.showConfirmDialog(this, "Empty Price!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 1) {
			JOptionPane.showConfirmDialog(this, "Empty Hotel!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 2) {
			JOptionPane.showConfirmDialog(this, "Empty Duration!!", "Warning", JOptionPane.YES_NO_OPTION);
		}
	}
}
