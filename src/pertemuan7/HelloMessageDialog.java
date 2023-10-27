/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author syhnn
 */
public class HelloMessageDialog extends JFrame{
    public HelloMessageDialog(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(HelloMessageDialog.this, 
                        "Hello, Welcome di Praktikum Pemrogramman II");
            }
        });
        
        this.add(button);
        this.setSize(200, 200);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloMessageDialog h = new HelloMessageDialog();
                h.setVisible(true);
            }
        });
    }
}
