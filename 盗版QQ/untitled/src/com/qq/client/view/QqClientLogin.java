package com.qq.client.view;

import javax.swing.*;
import java.awt.*;

public class QqClientLogin extends JFrame {

    //定义北边需要的组件
    JLabel jbl1;

    //定义中间需要的组件
    JTabbedPane jtp1;
    JPanel jp2,jp3,jp4;
    JLabel jp2_jlb1,jp2_jlb2,jp2_jlb3,jp2_jlb4;
    JButton jp2_jb1;
    JTextField jp2_jtf;
    JPasswordField jp2_jpf;
    JCheckBox jp2_jcb1,jp2_jcb2;

    //定义南边
    JPanel jp1;
    JButton jp1_jb1,jp1_jb2,jp1_jb3;

    public static void main(String[] args) {

        QqClientLogin qqClientLogin=new QqClientLogin();
    }

    public QqClientLogin(){
        //设计北边
        jbl1=new JLabel();

        //设计中间
        jp2=new JPanel(new GridLayout(3,3));
        jp3=new JPanel();
        jp4=new JPanel();
        jp2_jlb1=new JLabel("QQ号码",JLabel.CENTER);
        jp2_jlb2=new JLabel("QQ密码",JLabel.CENTER);
        jp2_jlb3=new JLabel("忘记密码",JLabel.CENTER);
        jp2_jlb4=new JLabel("申请密码保护",JLabel.CENTER);
        jp2_jb1=new JButton("清除号码");
        jp2_jtf=new JTextField();
        jp2_jpf=new JPasswordField();
        jp2_jcb1=new JCheckBox("隐身登录");
        jp2_jcb2=new JCheckBox("记住密码");

        //把组件加入jp2
        jp2.add(jp2_jlb1);
        jp2.add(jp2_jtf);
        jp2.add(jp2_jb1);
        jp2.add(jp2_jlb2);
        jp2.add(jp2_jpf);
        jp2.add(jp2_jlb3);
        jp2.add(jp2_jcb1);
        jp2.add(jp2_jcb2);
        jp2.add(jp2_jlb4);

        //创建选项卡
        jtp1=new JTabbedPane();
        jtp1.add("QQ号码",jp2);
        jtp1.add("手机号码",jp3);
        jtp1.add("电子邮箱",jp4);
        //设计南边
        jp1=new JPanel(new FlowLayout());
        jp1_jb1=new JButton("登录");
        jp1_jb2=new JButton("取消");
        jp1_jb3=new JButton("向导");

        jp1.add(jp1_jb1);
        jp1.add(jp1_jb2);
        jp1.add(jp1_jb3);


        this.add(jbl1,"North");
        this.add(jtp1,"Center");
        this.add(jp1,"South");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(350,240);
    }
}
