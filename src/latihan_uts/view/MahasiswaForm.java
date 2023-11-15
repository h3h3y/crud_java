package latihan_uts.view;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import latihan_uts.DBConnection;
import latihan_uts.entity.Mahasiswa;
import latihan_uts.model.MahasiswaModel;
public class MahasiswaForm extends javax.swing.JDialog {

    private Connection connection;
    private Mahasiswa mahasiswa;
    private MahasiswaModel mahasiswaModel;
    public MahasiswaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        connection = DBConnection.newgetInstant();
        mahasiswa = new Mahasiswa();
        mahasiswaModel = new MahasiswaModel(connection);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupJenkel = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextNim = new javax.swing.JTextField();
        TextNama = new javax.swing.JTextField();
        TextKelas = new javax.swing.JTextField();
        ButtonLaki = new javax.swing.JRadioButton();
        ButtonPerempuan = new javax.swing.JRadioButton();
        TextAlamat = new javax.swing.JTextField();
        TextTelepon = new javax.swing.JTextField();
        ButtonBaru = new javax.swing.JButton();
        ButtonTambah = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nim");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        jLabel6.setText("No Telepon");

        GrupJenkel.add(ButtonLaki);
        ButtonLaki.setText("Laki-Laki");
        ButtonLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLakiActionPerformed(evt);
            }
        });

        GrupJenkel.add(ButtonPerempuan);
        ButtonPerempuan.setText("Perempuan");
        ButtonPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPerempuanActionPerformed(evt);
            }
        });

        TextAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAlamatActionPerformed(evt);
            }
        });

        ButtonBaru.setText("BARU");
        ButtonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBaruActionPerformed(evt);
            }
        });

        ButtonTambah.setText("TAMBAH");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonEdit.setText("EDIT");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonHapus.setText("HAPUS");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBaru)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEdit)
                        .addGap(27, 27, 27)
                        .addComponent(ButtonHapus))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(TextKelas))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(79, 79, 79)
                            .addComponent(TextNim, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextAlamat)
                            .addComponent(TextTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonLaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonPerempuan)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ButtonLaki)
                    .addComponent(ButtonPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBaru)
                    .addComponent(ButtonTambah)
                    .addComponent(ButtonEdit)
                    .addComponent(ButtonHapus))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAlamatActionPerformed

    private void ButtonLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLakiActionPerformed
        
    }//GEN-LAST:event_ButtonLakiActionPerformed

    private void ButtonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBaruActionPerformed
        TextNim.setText(null);
        TextNama.setText(null);
        TextKelas.setText(null);
        GrupJenkel.clearSelection();
        TextAlamat.setText(null);
        TextTelepon.setText(null);
    }//GEN-LAST:event_ButtonBaruActionPerformed

    private void ButtonPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPerempuanActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
       String JenisKelamin = null;
       if(ButtonLaki.isSelected()){
           JenisKelamin = "Laki-Laki";
       }else{
           JenisKelamin = "Perempuan";
       }
       
       mahasiswa.setNim(TextNim.getText());
       mahasiswa.setNama(TextNama.getText());
       mahasiswa.setKelas(TextKelas.getText());
       mahasiswa.setJenis_kelamin(JenisKelamin);
       mahasiswa.setAlamat(TextAlamat.getText());
       mahasiswa.setNo_telepon(TextTelepon.getText());
       

        try{
            connection.setAutoCommit(false);
            mahasiswaModel.insert(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DITAMBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DITAMBAH", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
       String JenisKelamin = null;
       if(ButtonLaki.isSelected()){
           JenisKelamin = "Laki-Laki";
       }else{
           JenisKelamin = "Perempuan";
       }
        
       mahasiswa.setNim(TextNim.getText());
       mahasiswa.setNama(TextNama.getText());
       mahasiswa.setKelas(TextKelas.getText());
       mahasiswa.setJenis_kelamin(JenisKelamin);
       mahasiswa.setAlamat(TextAlamat.getText());
       mahasiswa.setNo_telepon(TextTelepon.getText());
        
        try{
            connection.setAutoCommit(false);
            mahasiswaModel.update(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIUPDATE", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIUPDATE", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        String JenisKelamin = null;
       if(ButtonLaki.isSelected()){
           JenisKelamin = "Laki-Laki";
       }else{
           JenisKelamin = "Perempuan";
       }
        
       mahasiswa.setNim(TextNim.getText());
       mahasiswa.setNama(TextNama.getText());
       mahasiswa.setKelas(TextKelas.getText());
       mahasiswa.setJenis_kelamin(JenisKelamin);
       mahasiswa.setAlamat(TextAlamat.getText());
       mahasiswa.setNo_telepon(TextTelepon.getText());
        
        try{
            connection.setAutoCommit(false);
            mahasiswaModel.delete(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIHAPUS", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

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
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MahasiswaForm dialog = new MahasiswaForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonBaru;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JRadioButton ButtonLaki;
    private javax.swing.JRadioButton ButtonPerempuan;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.ButtonGroup GrupJenkel;
    private javax.swing.JTextField TextAlamat;
    private javax.swing.JTextField TextKelas;
    private javax.swing.JTextField TextNama;
    private javax.swing.JTextField TextNim;
    private javax.swing.JTextField TextTelepon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
