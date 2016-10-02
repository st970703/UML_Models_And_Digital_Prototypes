import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addFlightScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addFlightScreen frame = new addFlightScreen();
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
	public addFlightScreen() {
		setTitle("Holidays R Us - Add Flights");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrice = new JLabel("Price ($): ");
		lblPrice.setBounds(28, 23, 77, 35);
		contentPane.add(lblPrice);
		
		JLabel lblAirline = new JLabel("Airline: ");
		lblAirline.setBounds(28, 71, 77, 35);
		contentPane.add(lblAirline);
		
		JLabel lblDepartureLocation = new JLabel("Departure Location:");
		lblDepartureLocation.setBounds(28, 119, 134, 35);
		contentPane.add(lblDepartureLocation);
		
		JLabel lblDestinationLocation = new JLabel("Destination Location:");
		lblDestinationLocation.setBounds(28, 168, 156, 35);
		contentPane.add(lblDestinationLocation);
		
		textField = new JTextField();
		textField.setBounds(208, 29, 200, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 77, 200, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 125, 200, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 174, 200, 22);
		contentPane.add(textField_3);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("")) {
					confirmInvalidInput(0);
				} else if (textField_1.getText().equals("")) {
					confirmInvalidInput(1);
				} else if (textField_2.getText().equals("")) {
					confirmInvalidInput(2);
				} else if (textField_3.getText().equals("")) {
					confirmInvalidInput(3);
				} else {
					setVisible(false);//hides the second JFrame and returns to the primary
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfirm.setBounds(258, 209, 107, 31);
		contentPane.add(btnConfirm);
	}
	
	private void confirmInvalidInput(int option) {
		if(option == 0) {
			JOptionPane.showConfirmDialog(this, "Empty Price!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 1) {
			JOptionPane.showConfirmDialog(this, "Empty Airline!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 2) {
			JOptionPane.showConfirmDialog(this, "Empty Departure Location!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 3) {
			JOptionPane.showConfirmDialog(this, "Empty Destination Location!!", "Warning", JOptionPane.YES_NO_OPTION);
		}
	}
}