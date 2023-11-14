
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febie Tardio
 */
public class XoGame extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public XoGame() {
        initComponents();
    }
    private void gameScore() 
    {
        txt1.setText(String.valueOf(xCount));
        txt2.setText(String.valueOf(oCount));
    }
    private void choose_a_player()
    {
       if(startGame.equalsIgnoreCase("X"))
       {
           startGame = "O";
       }
       else
       {
           startGame = "X";
       }
    }
    private void winningGame( )
    {
        String b1 = bttnxoxo1.getText();
        String b2 = bttnxoxo2.getText();
        String b3 = bttnxoxo3.getText();
        String b4 = bttnxoxo4.getText();
        String b5 = bttnxoxo5.getText();
        String b6 = bttnxoxo6.getText();
        String b7 = bttnxoxo7.getText();
        String b8 = bttnxoxo8.getText();
        String b9 = bttnxoxo9.getText();
        
        if (b1 == ("X") && b2 ==("X") && b3 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo1.setBackground(Color.ORANGE);
                 bttnxoxo2.setBackground(Color.ORANGE);
                  bttnxoxo3.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b4 == ("X") && b5 ==("X") && b6 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo4.setBackground(Color.ORANGE);
                 bttnxoxo5.setBackground(Color.ORANGE);
                  bttnxoxo6.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b7 == ("X") && b8 ==("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b1 == ("X") && b4 ==("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b2 == ("X") && b5 ==("X") && b8 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b3 == ("X") && b6 ==("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b1 == ("X") && b5 ==("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b3 == ("X") && b5 ==("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo1.setBackground(Color.PINK);
                 bttnxoxo2.setBackground(Color.PINK);
                  bttnxoxo3.setBackground(Color.PINK);
                  oCount++;
                  gameScore();
        }
        
        if (b1 == ("O") && b2 ==("O") && b3 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo4.setBackground(Color.PINK);
                 bttnxoxo5.setBackground(Color.PINK);
                  bttnxoxo6.setBackground(Color.PINK);
                  oCount++;
                  gameScore();
        }
        
        if (b4 == ("O") && b5 ==("O") && b6 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.PINK);
                 bttnxoxo8.setBackground(Color.PINK);
                  bttnxoxo9.setBackground(Color.PINK);
                  oCount++;
                  gameScore();
        }
        
        if (b7 == ("O") && b8 ==("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b1 == ("O") && b4 ==("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b2 == ("O") && b5 ==("O") && b8 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b3 == ("0") && b6 ==("0") && b9 == ("0") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo7.setBackground(Color.ORANGE);
                 bttnxoxo8.setBackground(Color.ORANGE);
                  bttnxoxo9.setBackground(Color.ORANGE);
                  xCount++;
                  gameScore();
        }
        
        if (b1 == ("O") && b5 ==("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo1.setBackground(Color.PINK);
                 bttnxoxo2.setBackground(Color.PINK);
                  bttnxoxo3.setBackground(Color.PINK);
                  oCount++;
                  gameScore();
        }
        
        if (b3 == ("O") && b5 ==("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
                bttnxoxo1.setBackground(Color.PINK);
                 bttnxoxo2.setBackground(Color.PINK);
                  bttnxoxo3.setBackground(Color.PINK);
                  oCount++;
                  gameScore();
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        bttnxoxo1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        bttnxoxo2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        bttnxoxo3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        bttnxoxo4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        bttnxoxo5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        bttnxoxo6 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        bttnxoxo7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        bttnxoxo8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        bttnxoxo9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        bttnxt = new javax.swing.JButton();
        bttnng = new javax.swing.JButton();
        bttnrstrt = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(204, 255, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(204, 255, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBackground(new java.awt.Color(51, 255, 153));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(51, 255, 153));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo2.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(51, 255, 153));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo3.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(51, 255, 153));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo4.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(51, 255, 153));
        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo5.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(51, 255, 153));
        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo6.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(51, 255, 153));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo7.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(51, 255, 153));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo8.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(51, 255, 153));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxoxo9.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxoxo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxoxo9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnxoxo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        jLabel1.setText("XOXO GAME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBackground(new java.awt.Color(255, 102, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("PLAYER 1:");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER 2:");

        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel4.setText("SCORE BOARD");

        txt1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txt1.setText("0");

        txt2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txt2.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2)
                            .addComponent(txt1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1))
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt2))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnxt.setBackground(new java.awt.Color(204, 153, 255));
        bttnxt.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnxt.setText("EXIT");
        bttnxt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bttnxtStateChanged(evt);
            }
        });
        bttnxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnxtActionPerformed(evt);
            }
        });

        bttnng.setBackground(new java.awt.Color(204, 153, 255));
        bttnng.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnng.setText("NEW GAME");
        bttnng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnngActionPerformed(evt);
            }
        });

        bttnrstrt.setBackground(new java.awt.Color(204, 153, 255));
        bttnrstrt.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        bttnrstrt.setText("RESTART");
        bttnrstrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnrstrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bttnng, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnrstrt, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttnxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnrstrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnng, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnxoxo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo5ActionPerformed
        bttnxoxo5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
         
    }//GEN-LAST:event_bttnxoxo5ActionPerformed

    private void bttnxoxo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo9ActionPerformed
        bttnxoxo9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo9ActionPerformed

    private void bttnxtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bttnxtStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnxtStateChanged
private JFrame frame;
    private void bttnxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxtActionPerformed
        gameFrame MENU = new gameFrame();
        MENU.show();
        dispose();
    }//GEN-LAST:event_bttnxtActionPerformed

    private void bttnrstrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnrstrtActionPerformed
        bttnxoxo1.setEnabled(true);
        bttnxoxo2.setEnabled(true);
        bttnxoxo3.setEnabled(true);
        bttnxoxo4.setEnabled(true);
        bttnxoxo5.setEnabled(true);
        bttnxoxo6.setEnabled(true);
        bttnxoxo7.setEnabled(true);
        bttnxoxo8.setEnabled(true);
        bttnxoxo9.setEnabled(true);
        
        bttnxoxo1.setText("");
        bttnxoxo2.setText("");
        bttnxoxo3.setText("");
        bttnxoxo4.setText("");
        bttnxoxo5.setText("");
        bttnxoxo6.setText("");
        bttnxoxo7.setText("");
        bttnxoxo8.setText("");
        bttnxoxo9.setText("");
        
        bttnxoxo1.setBackground(Color.MAGENTA);
        bttnxoxo2.setBackground(Color.MAGENTA);
        bttnxoxo3.setBackground(Color.MAGENTA);
        bttnxoxo4.setBackground(Color.MAGENTA);
        bttnxoxo5.setBackground(Color.MAGENTA);
        bttnxoxo6.setBackground(Color.MAGENTA);
        bttnxoxo7.setBackground(Color.MAGENTA);
        bttnxoxo8.setBackground(Color.MAGENTA);
        bttnxoxo9.setBackground(Color.MAGENTA);
        
    }//GEN-LAST:event_bttnrstrtActionPerformed

    private void bttnngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnngActionPerformed
        bttnxoxo1.setEnabled(true);
        bttnxoxo2.setEnabled(true);
        bttnxoxo3.setEnabled(true);
        bttnxoxo4.setEnabled(true);
        bttnxoxo5.setEnabled(true);
        bttnxoxo6.setEnabled(true);
        bttnxoxo7.setEnabled(true);
        bttnxoxo8.setEnabled(true);
        bttnxoxo9.setEnabled(true);
        
        txt1.setText("0");
        txt2.setText("0");
        
        bttnxoxo1.setText("");
        bttnxoxo2.setText("");
        bttnxoxo3.setText("");
        bttnxoxo4.setText("");
        bttnxoxo5.setText("");
        bttnxoxo6.setText("");
        bttnxoxo7.setText("");
        bttnxoxo8.setText("");
        bttnxoxo9.setText("");
        
        bttnxoxo1.setBackground(Color.MAGENTA);
        bttnxoxo2.setBackground(Color.MAGENTA);
        bttnxoxo3.setBackground(Color.MAGENTA);
        bttnxoxo4.setBackground(Color.MAGENTA);
        bttnxoxo5.setBackground(Color.MAGENTA);
        bttnxoxo6.setBackground(Color.MAGENTA);
        bttnxoxo7.setBackground(Color.MAGENTA);
        bttnxoxo8.setBackground(Color.MAGENTA);
        bttnxoxo9.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_bttnngActionPerformed

    private void bttnxoxo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo1ActionPerformed
         bttnxoxo1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo1ActionPerformed

    private void bttnxoxo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo2ActionPerformed
        bttnxoxo2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo2ActionPerformed

    private void bttnxoxo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo3ActionPerformed
        bttnxoxo3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo3ActionPerformed

    private void bttnxoxo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo4ActionPerformed
        bttnxoxo4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo4ActionPerformed

    private void bttnxoxo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo6ActionPerformed
        bttnxoxo6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo6ActionPerformed

    private void bttnxoxo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo7ActionPerformed
        bttnxoxo7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo7ActionPerformed

    private void bttnxoxo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnxoxo8ActionPerformed
        bttnxoxo8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;  
        }
        else
        {
            checker = true;
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_bttnxoxo8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnng;
    private javax.swing.JButton bttnrstrt;
    private javax.swing.JButton bttnxoxo1;
    private javax.swing.JButton bttnxoxo2;
    private javax.swing.JButton bttnxoxo3;
    private javax.swing.JButton bttnxoxo4;
    private javax.swing.JButton bttnxoxo5;
    private javax.swing.JButton bttnxoxo6;
    private javax.swing.JButton bttnxoxo7;
    private javax.swing.JButton bttnxoxo8;
    private javax.swing.JButton bttnxoxo9;
    private javax.swing.JButton bttnxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
