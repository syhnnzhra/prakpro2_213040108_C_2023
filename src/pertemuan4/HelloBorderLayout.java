/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author syhnn
 */
public class HelloBorderLayout extends JFrame{
    //Deklarasi Kelas dan Konstruktor
    public HelloBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Pembuatan Komponen GUI
        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia?");
        JLabel labelHasil = new JLabel("Jawab pertanyaan diatas");
        
        JButton buttonA = new JButton("Jakarta");
        JButton buttonB = new JButton("Bandung");
        JButton buttonC = new JButton("Surabaya");
        
        //Menambahkan Listener untuk Tombol A
        buttonA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar");
            }
        });
        
        //Menambahkan Listener untuk Tombol B
        buttonB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });
        
        //Menambahkan Listener untuk Tombol C
        buttonC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });
        
        //Menambahkan Komponen ke Frame dengan BorderLayout
        this.add(labelPertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.WEST);
        this.add(buttonB, BorderLayout.CENTER);
        this.add(buttonC, BorderLayout.EAST);
        
        //Mengatur Ukuran Frame
        this.setSize(400, 200);
    }
    
    //Metode main untuk Menjalankan Aplikasi
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloBorderLayout h = new HelloBorderLayout();
                h.setVisible(true);
            }
        });
    }

}
