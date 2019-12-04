package com.qq.client.view;

import javax.swing.*;

/**
 * 这是与好友聊天的界面
 */
public class QqChat extends JFrame{

    JTextArea jta;
    JTextField jtf;
    JButton jb;
    JPanel jpl;
//    public static void main(String[] args) {
//        QqChat qqChat=new QqChat();
//    }

    public QqChat(String friendNo){
        jta=new JTextArea();
        //指定为15列
        jtf=new JTextField(15);
        jb=new JButton("发送");
        jpl=new JPanel();
        jpl.add(jtf);
        jpl.add(jb);

        this.add(jta,"Center");
        this.add(jpl,"South");
        this.setSize(300,200);
        this.setTitle("你正在和"+friendNo+"聊天");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
