package com.szming.sm.frame;

import javax.swing.*;
import java.awt.*;
import java.security.PrivateKey;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/16
 **/
public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton departmentButton;
    private JButton classButton;
    private JButton studentButton;
    private JButton rewardButton;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;

    private final CardLayout c;

    public MainFrame(){
        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1",departmentPanel);
        centerPanel.add("2",classPanel);
        centerPanel.add("3",studentPanel);
        centerPanel.add("4",rewardPanel);

        departmentButton.addActionListener(e->{
            c.show(centerPanel,"1");
        });
        classButton.addActionListener(e->{
            c.show(centerPanel,"2");
        });
        studentButton.addActionListener(e->{
            c.show(centerPanel,"3");
        });
        rewardButton.addActionListener(e->{
            c.show(centerPanel,"4");
        });
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
