package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminMenu extends JFrame {
	private JButton resetPassword = new JButton("��������");

	public AdminMenu(String title) {
		super(title);
		init();
		addComponent();
		addListen();
		setVisible(false);
	}

	public void init() {
		this.getContentPane().setBackground(Color.PINK);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void addComponent() {
		resetPassword.setBounds(100, 50, 100, 50);
		add(resetPassword);
	}

	public void addListen() {
		resetPassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				ResetPwd resetPwd=new ResetPwd("��������");
				resetPwd.setVisible(true);
			}
		});
	}
}
