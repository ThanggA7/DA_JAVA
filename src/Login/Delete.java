package Login;

import Config.StudentDataBase;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField delete;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setBounds(100, 100, 461, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 128, 128));
		panel.setBounds(0, 10, 447, 164);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton delete_buttton = new JButton("Delete");
		delete_buttton.setBackground(new Color(240, 128, 128));
		delete_buttton.setBounds(167, 113, 125, 30);
		panel.add(delete_buttton);
		delete_buttton.setFont(new Font("Arial", Font.PLAIN, 15));
		delete = new JTextField();
		delete.setBounds(81, 37, 288, 30);
		panel.add(delete);
		delete.setHorizontalAlignment(SwingConstants.CENTER);
		delete.setText("Nhập mã sinh viên");
		delete.setFont(new Font("Arial", Font.PLAIN, 20));
		delete.setColumns(10);
		delete_buttton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dl = delete.getText();

				try {
					String query = "SELECT student_id FROM user";
					Connection connection = StudentDataBase.Connection2();
					Statement st = connection.createStatement();
					ResultSet rs = st.executeQuery(query);
					while (rs.next()) {
						if (dl.equals(rs.getString("student_id")) || dl.equals("")){
							try {
								Connection connection1 = StudentDataBase.Connection2();
								PreparedStatement ps = connection1.prepareStatement("delete from user where student_id=?");
								ps.setString(1,dl);
								ps.executeUpdate();
								JOptionPane.showMessageDialog(null,"Đã xóa mã sinh viên:" + dl);
							}catch (Exception e1){
								e1.printStackTrace();
							}
						}else{
							JOptionPane.showMessageDialog(null,"Không có dữ liệu vui lòng thử lại!");
						}
					}

				}catch (Exception e1){

				}

			}
		});
	}
}
