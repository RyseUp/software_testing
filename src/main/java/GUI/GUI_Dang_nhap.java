package GUI;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Process.Connect_database;

import java.awt.Font;
import java.awt.Label;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;


public class GUI_Dang_nhap extends JFrame {

	private JPanel contentPane;
	
	Connect_database cd = new Connect_database();
	private JPasswordField passwordField;

	private JTextField textField;
	public void login(String user, String pass) throws EmptyUserException {
		if(user.length() == 0) {
			JOptionPane.showMessageDialog(this, "Tài khoản không được để trống");
			textField.requestFocus();
			return;
		}
		if(pass.length() == 0) {
			JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
			passwordField.requestFocus();
			return;
		}
		if(cd.login(user, pass)) {
			JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
			GUI_TrangChu trangChu = new GUI_TrangChu();
			trangChu.setLocationRelativeTo(null);
			trangChu.setVisible(true);
			dispose();	
		}
		else {
			JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Dang_nhap frame = new GUI_Dang_nhap();
					frame.setLocationRelativeTo(null);  // Giua man hinh
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
	public GUI_Dang_nhap() {
		setBackground(SystemColor.inactiveCaption);
		setResizable(false);
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon user = new ImageIcon("src\\img\\profile.png");
		JLabel lblNewLabel = new JLabel("Tài khoản", user, JLabel.CENTER);
		lblNewLabel.setForeground(Color.red);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(65, 93, 100, 40);
		contentPane.add(lblNewLabel);
		
		ImageIcon key = new ImageIcon("src\\img\\key.png");
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu", key, JLabel.CENTER);
		lblNewLabel_1.setForeground(Color.red);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(65, 173, 100, 40);
		contentPane.add(lblNewLabel_1);
		
//		JTextArea textArea = new JTextArea();
//		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
//		textArea.setBounds(170, 103, 188, 30);
//		contentPane.add(textArea);

		textField = new JTextField();
		textField.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textField.setBounds(170, 103, 188, 30);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(170, 181, 188, 30);
		contentPane.add(passwordField);
		
		ImageIcon enter = new ImageIcon("src\\img\\enter.png");
		JButton btnNewButton = new JButton("Đăng nhập", enter);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					login(textField.getText().trim(), passwordField.getText());
				} catch (EmptyUserException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		btnNewButton.setBounds(190, 259, 150, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Đăng nhập");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(203, 28, 112, 47);
		contentPane.add(lblNewLabel_2);
		
		ImageIcon exit = new ImageIcon("E:\\PHAN THANH HUU\\exit.png");
		JButton btnNewButton_1 = new JButton("Thoát\r\n", exit);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(420, 323, 100, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel1 = new JLabel("New label");
		lblNewLabel1.setIcon(new ImageIcon(GUI_TrangChu.class.getResource("/img/mo2ndcommonlineuse.gif")));
		lblNewLabel1.setBounds(0, 0, 732, 467);
		contentPane.add(lblNewLabel1);
	}
}

