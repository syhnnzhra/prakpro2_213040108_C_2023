/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author syhnn
 */
public class Latihan3 extends JFrame {
    private JTextField textFieldNama;
    private JRadioButton radioButtonLaki;
    private JRadioButton radioButtonPerempuan;
    private JTextField textFieldNoTelp;
    private JCheckBox checkBoxWNA;
    private JButton buttonSimpan;
    private JTextArea txtOutput;
    
    public Latihan3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Label dan TextField untuk Nama
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        textFieldNama = new JTextField(20);
        inputPanel.add(textFieldNama, gbc);

        // Label untuk Jenis Kelamin
        gbc.gridx = 1;
        gbc.gridy = 0;
        inputPanel.add(new JLabel("Jenis Kelamin:"), gbc);

        // Panel untuk Radio Button Jenis Kelamin
        gbc.gridx = 1;
        gbc.gridy = 1;
        JPanel jenisKelaminPanel = new JPanel();
        jenisKelaminPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioButtonLaki = new JRadioButton("Laki-laki");
        radioButtonPerempuan = new JRadioButton("Perempuan");
        jenisKelaminPanel.add(radioButtonLaki);
        jenisKelaminPanel.add(radioButtonPerempuan);
        ButtonGroup jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(radioButtonLaki);
        jenisKelaminGroup.add(radioButtonPerempuan);
        inputPanel.add(jenisKelaminPanel, gbc);

        // Label dan TextField untuk No Telp
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(new JLabel("No Telp:"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        textFieldNoTelp = new JTextField(20);
        inputPanel.add(textFieldNoTelp, gbc);

        // Checkbox untuk Warga Negara Asing
        gbc.gridx = 1;
        gbc.gridy = 3;
        checkBoxWNA = new JCheckBox("Warga Negara Asing");
        inputPanel.add(checkBoxWNA, gbc);

        this.add(inputPanel);

        // Button Simpan dan Output Text Area
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout());
        buttonSimpan = new JButton("Simpan");
        txtOutput = new JTextArea(10, 30);
        txtOutput.setEditable(false);
        outputPanel.add(buttonSimpan);
        outputPanel.add(txtOutput);
        this.add(outputPanel);

        // Event Listener untuk Button Simpan
        buttonSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String noTelp = textFieldNoTelp.getText();
                String jenisKelamin = radioButtonLaki.isSelected() ? "Laki-laki" : "Perempuan";
                boolean wna = checkBoxWNA.isSelected();

                String outputText = "Nama: " + nama + "\nNo Telp: " + noTelp + "\nJenis Kelamin: " + jenisKelamin + "\nWNA: " + wna + "\n";
                txtOutput.append(outputText);
                clearInputFields();
            }
        });

        this.setSize(400, 400);
        this.setVisible(true);
    }
    
    private void clearInputFields() {
        textFieldNama.setText("");
        textFieldNoTelp.setText("");
        radioButtonLaki.setSelected(false);
        radioButtonPerempuan.setSelected(false);
        checkBoxWNA.setSelected(false);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Latihan3();
            }
        });
    }
}
