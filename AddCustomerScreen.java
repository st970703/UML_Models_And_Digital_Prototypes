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

public class AddCustomerScreen extends JFrame {

	private JPanel contentPane;
	private JPanel AddOrModify;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFrame thisFrame;

	/**
	 * Launch the application.
	 */
	/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomerScreen frame = new AddCustomerScreen();
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
	public AddCustomerScreen(AddOrModify option) {
		thisFrame = this;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		switch(option) {
		case Add:
			setTitle("Add Customers");
			break;
		case Modify:
			setTitle("Modify Customers");
			JLabel lblDavidQi = new JLabel("David Qi");
			lblDavidQi.setBounds(16, 40, 200, 16);
			contentPane.add(lblDavidQi);

			JLabel lblAucklandNewZealand = new JLabel("Auckland, New Zealand");
			lblAucklandNewZealand.setBounds(16, 93, 200, 16);
			contentPane.add(lblAucklandNewZealand);

			JLabel label = new JLabel("4539 6840 9686 7778");
			label.setBounds(16, 157, 200, 16);
			contentPane.add(label);
			break;
		}
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(16, 20, 170, 16);
		contentPane.add(lblName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(16, 73, 170, 16);
		contentPane.add(lblAddress);

		JLabel lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCreditCardNumber.setBounds(16, 137, 170, 16);
		contentPane.add(lblCreditCardNumber);

		textField = new JTextField("David Qi");
		textField.setBounds(220, 20, 200, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField("Glenfield, Auckland");
		textField_1.setColumns(10);
		textField_1.setBounds(220, 72, 200, 22);
		contentPane.add(textField_1);

		textField_2 = new JTextField("8777 0000 2222 7778");
		textField_2.setColumns(10);
		textField_2.setBounds(220, 137, 200, 22);
		contentPane.add(textField_2);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					confirmInvalidInput(0);
				} else if (textField_2.getText().equals("")) {
					confirmInvalidInput(1);
				} else{
					setVisible(false);//hides the second JFrame and returns to the primary
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirm.setBounds(89, 205, 97, 25);
		contentPane.add(btnConfirm);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//hides the second JFrame and returns to the primary
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(215, 205, 97, 25);
		contentPane.add(btnCancel);


	}
	private void confirmInvalidInput(int option) {
		if (option == 0) {
			JOptionPane.showConfirmDialog(this, "Empty Name!!", "Warning", JOptionPane.YES_NO_OPTION);
		} else if (option == 1) {
			JOptionPane.showConfirmDialog(this, "Invalid Credit Card Number!!", "Warning", JOptionPane.YES_NO_OPTION);
		}		
	}
}