package com.qq.client.view;

import javafx.scene.paint.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * QQ好友列表
 */
public class QqFriendList extends JFrame implements ActionListener, MouseListener {

    //先处理第一张卡片(好友)
    JPanel jphy1,jphy2,jphy3;
    JButton jphy_jbt1,jphy_jbt2,jphy_jbt3;

    //滑轮滚动区
    JScrollPane jslp;

    //处理第二张卡片(陌生人)
    JPanel jpmsr1,jpmsr2,jpmsr3;
    JButton jpmsr_jbt1,jpmsr_jbt2,jpmsr_jbt3;
    JScrollPane jslp2;

    CardLayout cl;
    public static void main(String[] args) {
        QqFriendList qqFriendList=new QqFriendList();
    }

    public QqFriendList(){
        //处理第一张卡片
        jphy_jbt1=new JButton("我的好友");
        jphy_jbt2=new JButton("陌生人");
        jphy_jbt2.addActionListener(this);
        jphy_jbt3=new JButton("黑名单");
        jphy1=new JPanel(new BorderLayout());
        //好友列表，假设有50个
        jphy2=new JPanel(new GridLayout(50,1,4,4));
        JLabel[] jlbs=new JLabel[50];
        for(int i=0;i<jlbs.length;i++){
            jlbs[i]=new JLabel("hello"+i);
            jlbs[i].addMouseListener(this);
            jphy2.add(jlbs[i]);
        }
        jphy3=new JPanel(new GridLayout(2,1));
        jphy3.add(jphy_jbt2);
        jphy3.add(jphy_jbt3);

        jslp=new JScrollPane(jphy2);

        jphy1.add(jphy_jbt1,"North");
        jphy1.add(jslp,"Center");
        jphy1.add(jphy3,"South");

        this.add(jphy1);


        //处理第二个卡片
        jpmsr_jbt1=new JButton("我的好友");
        jpmsr_jbt1.addActionListener(this);
        jpmsr_jbt2=new JButton("陌生人");
        jpmsr_jbt3=new JButton("黑名单");
        jpmsr1=new JPanel(new BorderLayout());
        //好友列表，假设有50个
        jpmsr2=new JPanel(new GridLayout(20,1,4,4));
        JLabel[] jlbs2=new JLabel[20];
        for(int i=0;i<jlbs2.length;i++){
            jlbs2[i]=new JLabel("hello"+i);
            jlbs2[i].addMouseListener(this);
            jpmsr2.add(jlbs2[i]);
        }
        jpmsr3=new JPanel(new GridLayout(2,1));
        jpmsr3.add(jpmsr_jbt1);
        jpmsr3.add(jpmsr_jbt2);

        jslp2=new JScrollPane(jpmsr2);


        jpmsr1.add(jpmsr3,"North");
        jpmsr1.add(jslp2,"Center");
        jpmsr1.add(jpmsr_jbt3,"South");

        cl=new CardLayout();

        this.setLayout(cl);
        this.add(jphy1,"1");
        this.add(jpmsr1,"2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(200,400);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==jphy_jbt2) {
            cl.show(this.getContentPane(), "2");
        }else if(actionEvent.getSource()==jpmsr_jbt1){
            cl.show(this.getContentPane(),"1");
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        //相应用户双击事件
        if(mouseEvent.getClickCount()==2){
            String friendNo=((JLabel)mouseEvent.getSource()).getText();
            System.out.println("你希望跟"+friendNo+"聊天");
            QqChat qqChat=new QqChat(friendNo);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        //用户高亮
        JLabel jl= (JLabel) mouseEvent.getSource();
        jl.setForeground(java.awt.Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        JLabel jl= (JLabel) mouseEvent.getSource();
        jl.setForeground(java.awt.Color.BLACK);
    }
}
