package com.ht.文字冒险;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Register extends JFrame {

    Login_Register(){
        init();
    }
    //登录界面初始化
    public void init(){
        JFrame frame = new JFrame("登录");
        frame.setLayout(null);

        JLabel nameStr = new JLabel("UID");
        nameStr.setBounds(250, 200, 100, 25);
        frame.add(nameStr);

        JLabel passwordStr = new JLabel("密码");
        passwordStr.setBounds(250, 250, 100, 25);
        frame.add(passwordStr);

        JTextField userid = new JTextField();
        userid.setBounds(300, 200, 100, 25);
        frame.add(userid);

        JPasswordField password = new JPasswordField();
        password.setBounds(300, 250, 100, 25);
        frame.add(password);

        JButton buttonlogin = new JButton("登录");
        buttonlogin.setBounds(275, 300, 70, 25);
        frame.add(buttonlogin);

        JButton buttonregister = new JButton("注册");
        buttonregister.setBounds(375, 300, 70, 25);
        frame.add(buttonregister);

        frame.setBounds(400,100,800,640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //为登录按钮添加监听器
        buttonlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String uid = userid.getText();
                String passwd = new String(password.getPassword());

                //创建一个Admin用户，把输入框中的用户名密码和提出来
                UIDsystem admin = new UIDsystem();
                admin.setUID(uid);
                admin.setPassword(passwd);

                //登录
                Login login = new UIDsystem();
                login.setAdmin(admin);


            }
        });


    }
}
