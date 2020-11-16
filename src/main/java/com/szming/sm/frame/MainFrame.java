package com.szming.sm.frame;

import javax.swing.*;
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

    public MainFrame(){
        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
