/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buildbreackergame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author INDRAJITH
 */
public class BuildBreackerGame {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
      JFrame frame=new JFrame();
      GamePlay gameplay=new GamePlay();
     frame.setBounds(10,10,700,600);
     frame.setTitle("BrickBreakerGame");
      
      frame.setResizable(false);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.add(gameplay);
       
    }
}
