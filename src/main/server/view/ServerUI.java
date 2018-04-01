package main.server.view;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * ServerUI represent the main Emotiv JFrame.
 * Consists of 3 panels Interactive, Detection and Console Panel.
 * @author Akash Sharma
 * @version 1.0
 */

public class ServerUI extends JFrame{
    
    public ServerUI() {
        this.setTitle("Emotiv Xavier Composer");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);
        this.setBounds(100, 100, 500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        
        InteractivePanel intPanel = new InteractivePanel();
        this.getContentPane().add(intPanel);
        
        DetectionPanel detPanel = new DetectionPanel();
        this.getContentPane().add(detPanel);
        
        ConsolePanel conPanel = new ConsolePanel();
        this.getContentPane().add(conPanel);
    }
}