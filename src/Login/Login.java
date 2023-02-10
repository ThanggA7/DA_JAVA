package Login;

import Config.ConnectDataBase;
import View.StudentManageView;
import View.StudentView;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user_name_text;
	private JTextField password_text;


	public Login() {
		setTitle("LOGIN FORM");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(406, 0, 351, 411);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(38, 142, 280, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);

		user_name_text = new JTextField();
		user_name_text.setFont(new Font("Arial", Font.PLAIN, 20));
		user_name_text.setBounds(0, 0, 297, 51);
		panel_1.add(user_name_text);
		user_name_text.setColumns(10);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(38, 242, 280, 51);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);

		password_text = new JPasswordField();
		password_text.setFont(new Font("Arial", Font.PLAIN, 20));
		password_text.setColumns(10);
		password_text.setBounds(0, 0, 280, 51);
		panel_1_1.add(password_text);

		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = user_name_text.getText();
				String password  = password_text.getText();
				if (username.equals("admin")&&password.equals("admin")){
					try {
						StudentManageView studentManageView = new StudentManageView();
						studentManageView.setResizable(false);
						studentManageView.setVisible(true);
						studentManageView.setResizable(false);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}else {
					try {
					String query ="Select user_name, password from user where user_name=? and password=?";
					Connection connection = ConnectDataBase.Connection();
					PreparedStatement ps = connection.prepareStatement(query);
					ps.setString(1,username);
					ps.setString(2,password);
					ResultSet rs = ps.executeQuery();
					if (rs.next()){
						dispose();
						try {
							StudentView studentView = new StudentView();
							studentView.setVisible(true);
							studentView.setResizable(false);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}else {
						JOptionPane.showMessageDialog(null,"Không có tài khoản hoặc tài khoản không đúng định dạng !");
					}
				}catch (Exception e1){

				}
				}
			}
		});
		login.setFont(new Font("Arial", Font.PLAIN, 10));
		login.setBounds(38, 345, 128, 42);
		panel.add(login);

		JButton register = new JButton("REGISTER");
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
                     Register register1 = new Register();
					 register1.setVisible(true);
				}catch (Exception e1){

				}
			}
		});
		register.setFont(new Font("Arial", Font.PLAIN, 10));
		register.setBounds(190, 345, 128, 42);
		panel.add(register);

		JLabel lblNewLabel = new JLabel("MẬT KHẨU");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(48, 219, 106, 21);
		panel.add(lblNewLabel);

		JLabel lblMSinhVin = new JLabel("MÃ SINH VIÊN");
		lblMSinhVin.setForeground(Color.RED);
		lblMSinhVin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMSinhVin.setBounds(48, 122, 106, 21);
		panel.add(lblMSinhVin);

		JLabel lblNewLabel_1 = new JLabel("LOGIN FORM");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(75, 38, 209, 51);
		panel.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.DARK_GRAY);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 0, 417, 411);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-46, 0, 453, 411);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Thang\\Desktop\\Java DA\\QLTNN__SV\\src\\img\\img_avatar.png"));
	}
}
