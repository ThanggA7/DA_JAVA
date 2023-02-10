package Login;

import Config.ConnectDataBase;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField user_name;
	private JTextField email;
	private JTextField phone;
	private JPasswordField password;
	private JPasswordField re_password;


	public Register() {
		setTitle("REGISTER FORM");
		setResizable(false);

		setBounds(100, 100, 852, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 384, 502);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(39, 52, 279, 43);
		panel.add(panel_1);
		panel_1.setLayout(null);

		name = new JTextField();
		name.setBounds(0, 0, 279, 43);
		panel_1.add(name);
		name.setColumns(10);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(39, 125, 279, 43);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);

		user_name = new JTextField();
		user_name.setColumns(10);
		user_name.setBounds(0, 0, 279, 43);
		panel_1_1.add(user_name);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(39, 195, 279, 43);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(0, 0, 279, 43);
		panel_1_2.add(email);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(39, 267, 279, 43);
		panel.add(panel_1_3);
		panel_1_3.setLayout(null);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(0, 0, 279, 43);
		panel_1_3.add(phone);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(39, 342, 279, 43);
		panel.add(panel_1_4);
		panel_1_4.setLayout(null);
		
		password = new JPasswordField();
		password.setBounds(0, 0, 279, 43);
		panel_1_4.add(password);

		JLabel lblMSinhVin = new JLabel("MÃ SINH VIÊN");
		lblMSinhVin.setBounds(39, 105, 102, 16);
		panel.add(lblMSinhVin);
		lblMSinhVin.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin.setFont(new Font("Arial", Font.PLAIN, 13));

		JLabel lblMSinhVin_1 = new JLabel("EMAIL");
		lblMSinhVin_1.setBounds(39, 178, 102, 16);
		lblMSinhVin_1.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin_1.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblMSinhVin_1);

		JLabel lblMSinhVin_2 = new JLabel("PHONE");
		lblMSinhVin_2.setBounds(39, 248, 102, 16);
		lblMSinhVin_2.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin_2.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblMSinhVin_2);

		JLabel lblMSinhVin_3 = new JLabel("PASSWORD");
		lblMSinhVin_3.setBounds(39, 320, 102, 16);
		lblMSinhVin_3.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin_3.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblMSinhVin_3);

		JLabel lblMSinhVin_4 = new JLabel("HỌ VÀ TÊN");
		lblMSinhVin_4.setBounds(39, 32, 102, 16);
		lblMSinhVin_4.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin_4.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblMSinhVin_4);

		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBounds(39, 422, 279, 43);
		panel.add(panel_1_4_1);
		panel_1_4_1.setLayout(null);
		
		re_password = new JPasswordField();
		re_password.setBounds(0, 0, 279, 43);
		panel_1_4_1.add(re_password);

		JLabel lblMSinhVin_3_1 = new JLabel("REPEAT PASSWORD");
		lblMSinhVin_3_1.setBounds(39, 400, 148, 16);
		lblMSinhVin_3_1.setForeground(Color.LIGHT_GRAY);
		lblMSinhVin_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblMSinhVin_3_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(377, 0, 461, 502);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton signup = new JButton("SIGN UP");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  name1 = name.getText();
				String  username = user_name.getText();
				String  email1 = email.getText();
				String  phone1 = phone.getText();
				String  password1 = password.getText();
				String  repass    = re_password.getText();

				if (name1.equals("") || username.equals("") || email1.equals("") || phone1.equals("") || password1.equals("") || repass.equals("")){
					JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin không được để trống !");

				}else if(password1.equals(repass)) {
					try {
						Connection connection = ConnectDataBase.Connection();
						String query = "insert into user(name,user_name,email,phone,password,repeat_password) values(?,?,?,?,?,?)";
						PreparedStatement ps = connection.prepareStatement(query);
						ps.setString(1,name1);
						ps.setString(2,username);
						ps.setString(3,email1);
						ps.setString(4,phone1);
						ps.setString(5,password1);
						ps.setString(6,repass);
						ps.executeUpdate();
					}catch (Exception e1){
						JOptionPane.showMessageDialog(null,"Không có tài khoản hoặc tài khoản không đúng định dạng !");
					}

				} else{
					JOptionPane.showMessageDialog(null,"Vui lòng xem lại Repeat Password !");
				}

			}
		});
		signup.setBounds(100, 424, 285, 47);
		panel_2.add(signup);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(69, 85, 352, 302);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Thang\\Desktop\\Java DA\\QLTNN__SV\\src\\img\\avatar6.png"));
		lblNewLabel.setBounds(-72, 0, 484, 335);
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("REGISTER FORM");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(126, 21, 269, 54);
		panel_2.add(lblNewLabel_1);
	}

}
