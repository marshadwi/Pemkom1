/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apotik;

import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class editproduk extends javax.swing.JDialog {

private int Id;
private String KP; // Kode Produk
private String NP; // Nama Produk
private String GP; // Gambar Produk
private String K;  // Kategori
private String S;  // Supplier
private String HJ; // Harga Jual
private String HB; // Harga Beli
private String SP; // Stock Produk
    /**
     * Creates new form 
     */
    public editproduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        viewCategory();
        viewSupplier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kodeproduk = new javax.swing.JTextField();
        namaproduk = new javax.swing.JTextField();
        gambarproduk = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        harjual = new javax.swing.JTextField();
        categoriproduk = new javax.swing.JComboBox<>();
        suplierr = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        harbeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EDIT PRODUK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setText("Kode Produk :");

        jLabel2.setText("Nama Produk :");

        jLabel3.setText("Gambar Produk:");

        jLabel4.setText("Kategori Produk :");

        kodeproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeprodukActionPerformed(evt);
            }
        });

        gambarproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambarprodukActionPerformed(evt);
            }
        });

        btnsimpan.setBackground(new java.awt.Color(0, 51, 153));
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(255, 0, 0));
        btnbatal.setForeground(new java.awt.Color(255, 255, 255));
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Supplier :");

        jLabel7.setText("Harga Jual :");

        harjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harjualActionPerformed(evt);
            }
        });
        harjual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                harjualKeyTyped(evt);
            }
        });

        categoriproduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoriproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriprodukActionPerformed(evt);
            }
        });

        suplierr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        suplierr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suplierrActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga Beli :");

        harbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harbeliActionPerformed(evt);
            }
        });
        harbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                harbeliKeyTyped(evt);
            }
        });

        jLabel9.setText("Stok Produk :");

        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(btnbatal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(harjual)
                            .addComponent(namaproduk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeproduk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gambarproduk, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(categoriproduk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suplierr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnsimpan))
                    .addComponent(harbeli)
                    .addComponent(stock))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(gambarproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoriproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(suplierr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(harjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(harbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnbatal))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeprodukActionPerformed

    private void gambarprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambarprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gambarprodukActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
                String name = namaproduk.getText();
        try {
            Connection C = Koneksi.Go();
            String Q = "UPDATE products "
                    + "SET product_code = ?, product_name = ?, product_image = ?, product_category = ?, "
                    + "product_supplier = ?, product_price_s = ?, product_price_b = ?, "
                    + "product_stock = ? WHERE id = ?";

            PreparedStatement ps = C.prepareStatement(Q);
            ps.setString(1, kodeproduk.getText());
            ps.setString(2, name);
            ps.setString(3, gambarproduk.getText());

            // Parse category ID
            String categorySelected = categoriproduk.getSelectedItem().toString();
            String categoryId = categorySelected.split("-")[0];
            ps.setInt(4, Integer.parseInt(categoryId));

            // Parse supplier ID
            String supplierSelected = suplierr.getSelectedItem().toString();
            String supplierId = supplierSelected.split("-")[0];
            ps.setInt(5, Integer.parseInt(supplierId));

            ps.setDouble(6, Double.parseDouble(harjual.getText()));
            ps.setDouble(7, Double.parseDouble(harbeli.getText()));
            ps.setInt(8, Integer.parseInt(stock.getText()));
            ps.setInt(9, getId());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                Tampilandataproduk.viewdataproduk("");
                function.savelog(" Perubahan produk "+name+" berhasil "); 
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
                namaproduk.requestFocus();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data");
            }

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }                                        
    // TODO add your handling code here:


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnbatalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Pilih Gambar Produk");

        // Show the dialog and get the user's selection
        int userSelection = jfc.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = jfc.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Selected file: " + fileToOpen.getAbsolutePath());
            gambarproduk.setText(fileToOpen.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(this, "Open command canceled");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void harjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harjualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harjualActionPerformed

    private void harjualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harjualKeyTyped
        // TODO add your handling code here:
   
    }//GEN-LAST:event_harjualKeyTyped

    private void categoriprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriprodukActionPerformed

    private void suplierrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suplierrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suplierrActionPerformed

    private void harbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harbeliActionPerformed

    private void harbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harbeliKeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_harbeliKeyTyped

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        // TODO add your handling code here:
    
    }//GEN-LAST:event_stockKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
                kodeproduk.setText(getKP());
        namaproduk.setText(getNP());
        gambarproduk.setText(getGP());
        harjual.setText(getHJ());
        harbeli.setText(getHB());
        stock.setText(getSP());

        // Set kategori dan supplier
        String categoryStr = getK();
        for(int i = 0; i < categoriproduk.getItemCount(); i++) {
            String item = categoriproduk.getItemAt(i);
            if(item.contains(categoryStr)) {
                categoriproduk.setSelectedIndex(i);
                break;
            }
        }

        String supplierStr = getS();
        for(int i = 0; i < suplierr.getItemCount(); i++) {
            String item = suplierr.getItemAt(i);
            if(item.contains(supplierStr)) {
                suplierr.setSelectedIndex(i);
                break;
            }
    }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(editproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editproduk dialog = new editproduk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> categoriproduk;
    private javax.swing.JTextField gambarproduk;
    private javax.swing.JTextField harbeli;
    private javax.swing.JTextField harjual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kodeproduk;
    private javax.swing.JTextField namaproduk;
    private javax.swing.JTextField stock;
    private javax.swing.JComboBox<String> suplierr;
    // End of variables declaration//GEN-END:variables


public int getId() {
    return Id;
}

public void setId(int id) {
    this.Id = id;
}

public String getKP() {
    return KP;
}

public void setKP(String KP) {
    this.KP = KP;
}

public String getNP() {
    return NP;
}

public void setNP(String NP) {
    this.NP = NP;
}

public String getGP() {
    return GP;
}

public void setGP(String GP) {
    this.GP = GP;
}

public String getK() {
    return K;
}

public void setK(String K) {
    this.K = K;
}

public String getS() {
    return S;
}

public void setS(String S) {
    this.S = S;
}

public String getHJ() {
    return HJ;
}

public void setHJ(String HJ) {
    this.HJ = HJ;
}

public String getHB() {
    return HB;
}

public void setHB(String HB) {
    this.HB = HB;
}

public String getSP() {
    return SP;
}

public void setSP(String SP) {
    this.SP = SP;
}

    private void viewCategory() {
        try {
            Connection C = Koneksi.Go();
            Statement ST = C.createStatement();
            String Q = "SELECT id,name FROM product_category";
            ResultSet R = ST.executeQuery(Q);
            categoriproduk.removeAllItems();
            while (R.next()) {
                int id = R.getInt("id");
                String name = R.getString("name");
                categoriproduk.addItem(id + "-" + name);
            }
        } catch (SQLException e) {
        }
    }

    private void viewSupplier() {
        try {
            Connection C = Koneksi.Go();
            Statement ST = C.createStatement();
            String Q = "SELECT id,name FROM supplier";
            ResultSet R = ST.executeQuery(Q);
            suplierr.removeAllItems();
            while (R.next()) {
                int id = R.getInt("id");
                String name = R.getString("name");
                suplierr.addItem(id + "-" + name);
            }
        } catch (SQLException e) {
        }
    }

    private void number(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

}