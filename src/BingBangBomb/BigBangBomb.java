/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BingBangBomb;

import javax.swing.*;

import java.awt.event.*;
/**
 *
 * @author Ajayi Solomon
 */
public class BigBangBomb {
    private JPanel mainPanel = new JPanel();
    private mineCellGrid MineCellGrid;
    public JButton resetButton = new JButton("Reset");
    public JButton customize = new JButton("Customise");
    


    public BigBangBomb(int rows, int cols, int mineTotal) {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        MineCellGrid = new mineCellGrid(rows, cols, mineTotal);
        

       // resetButton.setMnemonic(KeyEvent.VK_R);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MineCellGrid.reset();
            }
        });
        
        customize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Customized cobj = new Customized();
            }
        });

        mainPanel.add(MineCellGrid);
        mainPanel.add(new JSeparator());
        mainPanel.add(new JPanel() {
            {
                add(resetButton);
                add(customize);
            }
        });
    }
    
    
    

    private JPanel getMainPanel() {
        return mainPanel;
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("BigBangBomb");
        // frame.getContentPane().add(new BigBangBomb(20, 20,
        // 44).getMainPanel());
        frame.getContentPane().add(new BigBangBomb(9,9,10).getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}


