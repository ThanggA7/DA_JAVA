package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class StudentView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblMSinhVin;
	private JLabel lblSinThoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentView frame = new StudentView();
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
	public StudentView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 384, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(48, 134, 238, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(48, 212, 238, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(48, 292, 238, 32);
		panel.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Họ và Tên");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(60, 116, 79, 13);
		panel.add(lblNewLabel);
		
		lblMSinhVin = new JLabel("Mã sinh viên");
		lblMSinhVin.setForeground(Color.RED);
		lblMSinhVin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMSinhVin.setBounds(60, 189, 79, 13);
		panel.add(lblMSinhVin);
		
		lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setForeground(Color.RED);
		lblSinThoi.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSinThoi.setBounds(60, 268, 79, 24);
		panel.add(lblSinThoi);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(91, 389, 154, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("TRA CỨU THÔNG TIN");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(72, 37, 214, 37);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(384, 0, 528, 459);
		contentPane.add(panel_1);
	}
}
