/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author syhnn
 * Syahnan Afifah 213040108 Kelas C
 */
public class Latihan4 extends JFrame{
    private JTextField textFieldNama;
    private JTextField textFieldTelepon;
    private JTextArea textAreaBiodata;
    
    public Latihan4(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNama = new JLabel("Masukan Nama Anda:");
        labelNama.setBounds(20, 20, 100, 20);

        JLabel labelTelepon = new JLabel("Nomor Telepon:");
        labelTelepon.setBounds(20, 60, 100, 20);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(130, 20, 200, 30);

        textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(130, 60, 200, 30);

        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(20, 100, 100, 40);

        textAreaBiodata = new JTextArea();
        textAreaBiodata.setBounds(20, 150, 310, 200);
        textAreaBiodata.setEditable(false);
        
        buttonSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String telepon = textFieldTelepon.getText();
                String biodata = "Nama: " + nama + "\nNomor Telepon: " + telepon + "\n";
                textAreaBiodata.append(biodata);
                textAreaBiodata.append("-------------------------------------\n");
                textFieldNama.setText("");
                textFieldTelepon.setText("");
            }
        });
        
        this.add(buttonSimpan);
        this.add(textFieldNama);
        this.add(textFieldTelepon);
        this.add(labelNama);
        this.add(labelTelepon);
        this.add(textAreaBiodata);

        this.setSize(400, 400);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan4 biodataApp = new Latihan4();
                biodataApp.setVisible(true);
            }
        });
    }
}
