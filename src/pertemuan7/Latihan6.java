/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
import javax.swing.table.TableModel; 

/**
 *
 * @author syhnn
 */
public class Latihan6 extends JFrame{
    private JTextField textFieldNama;
    private JRadioButton radioButtonLaki;
    private JRadioButton radioButtonPerempuan;
    private JTextField textFieldNoTelp;
    private JCheckBox checkBoxWNA;
    private JButton buttonSimpan;
    private JRadioButton radioButtonGold;
    private JRadioButton radioButtonSilver;
    private JRadioButton radioButtonPlatinum;
    private ButtonGroup memberTypeGroup;
    private JTable dataTable; 
    private DefaultTableModel tableModel;
    
    public Latihan6(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        JPanel inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(800, 800)); 
        inputPanel.setLayout(new FlowLayout()); 

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
        
        // Panel for Radio Buttons for Member Type
        gbc.gridx = 0;
        gbc.gridy = 4;
        inputPanel.add(new JLabel("Jenis Member:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;;
        JPanel memberTypePanel = new JPanel();
        memberTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioButtonGold = new JRadioButton("Gold");
        radioButtonSilver = new JRadioButton("Silver");
        radioButtonPlatinum = new JRadioButton("Platinum");
        memberTypePanel.add(radioButtonGold);
        memberTypePanel.add(radioButtonSilver);
        memberTypePanel.add(radioButtonPlatinum);
        memberTypeGroup = new ButtonGroup();
        memberTypeGroup.add(radioButtonGold);
        memberTypeGroup.add(radioButtonSilver);
        memberTypeGroup.add(radioButtonPlatinum);
        inputPanel.add(memberTypePanel, gbc);
    
        this.add(inputPanel);
        
        // Button Simpan and JTable for data display
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout());
        buttonSimpan = new JButton("Simpan");
        tableModel = new DefaultTableModel(new String[]{"Nama", "No Telp", "Jenis Kelamin", "WNA", "Jenis Member"}, 0);
        dataTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(dataTable);
        outputPanel.add(buttonSimpan);
        outputPanel.add(scrollPane);
        this.add(outputPanel);

        // Event Listener for the Simpan button
        buttonSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String noTelp = textFieldNoTelp.getText();
                String jenisKelamin = radioButtonLaki.isSelected() ? "Laki-laki" : "Perempuan";
                boolean wna = checkBoxWNA.isSelected();

                // Get the selected member type
                String memberType = "";
                if (radioButtonGold.isSelected()) {
                    memberType = "Gold";
                } else if (radioButtonSilver.isSelected()) {
                    memberType = "Silver";
                } else if (radioButtonPlatinum.isSelected()) {
                    memberType = "Platinum";
                }

                // Add data to the table model
                tableModel.addRow(new Object[]{nama, noTelp, jenisKelamin, wna, memberType});
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
                new Latihan6();
            }
        });
    }
}
