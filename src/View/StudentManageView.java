package View;

import Config.StudentDataBase;
import Login.Delete;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentManageView extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField student_id;
	private JTextField age;
	private JTextField sex;
	private JTextField school;
	private JTextField andress;
	private JTextField money;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManageView frame = new StudentManageView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public StudentManageView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 1081, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ VAY VỐN SINH VIÊN TẠI NGÂN HÀNG");
		lblNewLabel.setBounds(73, 28, 850, 41);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 35));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(0, 92, 1081, 520);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và Tên");
		lblNewLabel_1.setBounds(23, 32, 130, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã sinh viên");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(23, 89, 149, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tuổi");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(23, 151, 130, 30);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giới tính");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(23, 201, 130, 30);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Trường");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(23, 258, 130, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Địa chỉ");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(23, 320, 130, 30);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Số tiền");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1_2_1_1.setBounds(23, 377, 130, 30);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(191, 32, 296, 30);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setBounds(0, 0, 296, 29);
		panel_2.add(name);
		name.setColumns(10);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(191, 89, 296, 30);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		student_id = new JTextField();
		student_id.setFont(new Font("Arial", Font.PLAIN, 20));
		student_id.setColumns(10);
		student_id.setBounds(0, 0, 296, 29);
		panel_2_1.add(student_id);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(191, 151, 296, 30);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		age = new JTextField();
		age.setFont(new Font("Arial", Font.PLAIN, 20));
		age.setColumns(10);
		age.setBounds(0, 0, 296, 29);
		panel_2_1_1.add(age);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBounds(191, 201, 296, 30);
		panel_1.add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		sex = new JTextField();
		sex.setFont(new Font("Arial", Font.PLAIN, 20));
		sex.setColumns(10);
		sex.setBounds(0, 0, 296, 29);
		panel_2_1_2.add(sex);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBounds(191, 258, 296, 30);
		panel_1.add(panel_2_1_2_1);
		panel_2_1_2_1.setLayout(null);
		
		school = new JTextField();
		school.setFont(new Font("Arial", Font.PLAIN, 20));
		school.setColumns(10);
		school.setBounds(0, 0, 296, 29);
		panel_2_1_2_1.add(school);
		
		JPanel panel_2_1_2_2 = new JPanel();
		panel_2_1_2_2.setBounds(191, 320, 296, 30);
		panel_1.add(panel_2_1_2_2);
		panel_2_1_2_2.setLayout(null);
		
		andress = new JTextField();
		andress.setFont(new Font("Arial", Font.PLAIN, 20));
		andress.setColumns(10);
		andress.setBounds(0, 0, 296, 29);
		panel_2_1_2_2.add(andress);
		
		JPanel panel_2_1_2_3 = new JPanel();
		panel_2_1_2_3.setBounds(191, 377, 296, 30);
		panel_1.add(panel_2_1_2_3);
		panel_2_1_2_3.setLayout(null);
		
		money = new JTextField();
		money.setFont(new Font("Arial", Font.PLAIN, 20));
		money.setColumns(10);
		money.setBounds(0, 0, 296, 29);
		panel_2_1_2_3.add(money);
		
		JButton add = new JButton("Thêm");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  String Fullname = name.getText();
				  String StudentID= student_id.getText();
				  String Sex1 = sex.getText();
				  String Age1 = age.getText();
				  String School1 = school.getText();
				  String Andress1 = andress.getText();
				  String Money1 = money.getText();
				  if (Fullname.equals("")||StudentID.equals("")||Sex1.equals("")||Age1.equals("")||School1.equals("")||Andress1.equals("")||Money1.equals("")){
					  JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin không được để trống !");
				  }else {

					  try {
						  String query = "insert into user(name,student_id,sex,age,school,andress,money) values (?,?,?,?,?,?,?)";
						  Connection connection = StudentDataBase.Connection2();
						  PreparedStatement ps = connection.prepareStatement(query);
						  ps.setString(1,Fullname);
						  ps.setString(2,StudentID);
						  ps.setString(3,Sex1);
						  ps.setString(4,Age1);
						  ps.setString(5,School1);
						  ps.setString(6,Andress1);
						  ps.setString(7,Money1);
						  ps.executeUpdate();
					  }catch (Exception e1){
						  e1.printStackTrace();
					  }
				  }
			}
		});
		add.setBackground(Color.PINK);
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setBounds(10, 443, 149, 45);
		panel_1.add(add);
		
		JButton fix = new JButton("Sửa");
		fix.setBackground(Color.PINK);
		fix.setFont(new Font("Arial", Font.PLAIN, 20));
		fix.setBounds(180, 443, 149, 45);
		panel_1.add(fix);
		
		JButton delete = new JButton("Xóa");
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Delete delete = new Delete();
					delete.setVisible(true);
					delete.setResizable(false);
				}catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		delete.setBackground(Color.PINK);
		delete.setFont(new Font("Arial", Font.PLAIN, 20));
		delete.setBounds(350, 443, 149, 45);
		panel_1.add(delete);
	}
}
