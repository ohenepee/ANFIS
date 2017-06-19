/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.nas.gui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author arif
 */
public class AttributesScoreFrame extends javax.swing.JFrame {

    /**
     * Creates new form ScoreFrame
     */
    public AttributesScoreFrame(Double[] score) {
        makeTableModel(score);
        initComponents();
    }
    
    TableModel tableModel1;
    TableModel tableModel2;
    JTable jTable1;
    
    private void makeTableModel(Double[] score) {
        String[][] row = new String[score.length][1];
        for (int i = 0; i < row.length; i++) {
            row[i][0] = "X" + (i+1);
        }
        
        tableModel1 = new DefaultTableModel(row, new String[] {"i"}) {
            @Override
            public Class getColumnClass(int columnIndex) {
                return java.lang.String.class;
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        
        Double[][] row1 = new Double[score.length][1];
        for (int i = 0; i < row.length; i++) {
            row1[i][0] = score[i];
        }
        
        tableModel2 = new DefaultTableModel(row1, new String[] {"Score"}) {
            @Override
            public Class getColumnClass(int columnIndex) {
                return java.lang.Double.class;
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setModel(tableModel2);
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1 = new javax.swing.JTable();
        jTable1.setModel(tableModel1);
        jTable1.setBackground(jTable2.getTableHeader().getBackground());
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );

        JViewport viewport = new JViewport();
        viewport.setView(jTable1);
        viewport.setPreferredSize(jTable1.getPreferredSize());
        jScrollPane1.setRowHeaderView(viewport);
        jScrollPane1.setCorner(JScrollPane.UPPER_LEFT_CORNER, jTable1.getTableHeader());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}