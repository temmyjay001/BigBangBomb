/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BingBangBomb;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Ajayi Solomon
 */
public class Customized extends JFrame implements  ActionListener{
    BigBangBomb starter;
    mineCellGrid min;
    JLabel lbl_row,lbl_col,lbl_mineNum;
    JTextField jt_row,jt_col,jt_mineNum;
    JButton start;
    static int row,col,mineNum;
    JPanel mainPanel;
    
    
    
    public Customized(){
      
        
        mainPanel = new JPanel();
        
        
        lbl_row = new JLabel("Enter Number of rows");
        jt_row = new JTextField(5);
        jt_row.addActionListener(this);
        
        lbl_col = new JLabel("Enter Number of Columns");
        jt_col = new JTextField(5);
        jt_col.addActionListener(this);
        
        lbl_mineNum = new JLabel("Enter number of Mine");
        jt_mineNum = new JTextField(5);
        jt_mineNum.addActionListener(this);
        
        start = new JButton("START");
        start.addActionListener(this);
        
        setLayout(new GridLayout(2,2));
        add(lbl_row);
        add(jt_row);
        add(lbl_col);
        add(jt_col);
        add(lbl_mineNum);
        add(jt_mineNum);
        add(start);
        
      setSize(380,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed(ActionEvent e){
        int arow = Integer.parseInt(jt_row.getText());
        int acol = Integer.parseInt(jt_col.getText());
        int amineNum = Integer.parseInt(jt_mineNum.getText());
        
        if(e.getSource() == start){  
        min = new mineCellGrid(arow,acol,amineNum);
        min.reset();
        starter = new BigBangBomb(arow,acol,amineNum);
       
       this.dispose();
    }
        
        
    }
}
    
    
        
        
