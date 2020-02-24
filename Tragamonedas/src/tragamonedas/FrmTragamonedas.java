
package tragamonedas;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author JoseDaniel
 */
public class FrmTragamonedas extends javax.swing.JFrame {

    int aleatorio1, aleatorio2, aleatorio3=0;
    int inicio=0;
    int contador=0;
    int manzana=1;
    int banano=2;
    int durazno=3;
    int frutilla=4;
    int kiwi=5;
    int mango=6;
    int manzanaverde=7;
    int pera=8;
    int sandia=9;
    int uvas=10;
    int saldo=100;
    int apuesta;
    Timer temporizador;

    public FrmTragamonedas() 
    {
        this.temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (saldo!=0)
                {
                    
                    contador +=1;
                    
                    if (contador <= 40)
                    {
                        if (contador%5==0)
                        {
                            aleatorio1=(int)(Math.random()*10+1);
                            switch(aleatorio1)
                            {
                                case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                                break;
                                case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                                break;
                                case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                                break;
                                case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                                break;
                                case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                                break;
                                case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                                break;
                                case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                                break;
                                case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                                break;
                                case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                                break;
                                case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                                break;
                                    
                                    
                            }
                        }
                    }
                    
                    
                    
                    if (contador <= 20)
                    {
                        if (contador%3==0)
                        {
                            aleatorio1 =(int)(Math.random()*10+1);
                            
                            switch(aleatorio1)
                            {
                                case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                                break;
                                case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                                break;
                                case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                                break;
                                case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                                break;
                                case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                                break;
                                case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                                break;
                                case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                                break;
                                case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                                break;
                                case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                                break;
                                case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                                break;
                            }
                        }
                    }
                    
                    if (contador <= 10)
                    {
                        if(contador%2==0)
                        {
                            aleatorio2 =(int)(Math.random()*10+1);
                            
                            switch(aleatorio2)
                            {
                                case 1: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                                break;
                                case 2: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                                break;
                                case 3: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                                break;
                                case 4: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                                break;
                                case 5: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                                break;
                                case 6: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                                break;
                                case 7: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                                break;
                                case 8: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                                break;
                                case 9: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                                break;
                                case 10: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                                break;
                            }
                        }
                    }
                    if (contador == 40)
                    {
                        temporizador.stop();
                        contador=0;
                        
                        if (aleatorio1 != aleatorio2 || aleatorio1 != aleatorio3)
                        {
                            saldo=saldo-apuesta;
                            txtsaldo.setText(String.valueOf(saldo));
                            
                        }
                        
                        if (aleatorio1 == aleatorio2 || aleatorio3 == manzana)
                        {
                            saldo=saldo+(apuesta);
                            txtsaldo.setText(String.valueOf(saldo));
                        }
                        
                        if (aleatorio1 == aleatorio2 || aleatorio1 == manzana )
                        {
                            saldo=saldo+(apuesta);
                            txtsaldo.setText(String.valueOf(saldo));
                        }
                        
                        if (aleatorio1 == aleatorio2 || aleatorio1 == aleatorio3)
                        {
                            saldo=saldo+(apuesta*2);
                            txtsaldo.setText(String.valueOf(saldo));
                        }
                        if (aleatorio1 == aleatorio2 || aleatorio2 == aleatorio3 || aleatorio1 == manzana)
                        {
                            saldo=saldo+(apuesta*3);
                            txtsaldo.setText(String.valueOf(saldo));
                        }
                        
                    }
                    
                    
                    
                }
                }
        
    });
    }
    
           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen1 = new javax.swing.JLabel();
        lblimagen2 = new javax.swing.JLabel();
        lblimagen3 = new javax.swing.JLabel();
        cbxApuesta = new javax.swing.JComboBox();
        txtsaldo = new javax.swing.JTextField();
        btmjugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$5", "$10", "$20", "$50", "$100" }));
        cbxApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxApuestaActionPerformed(evt);
            }
        });

        txtsaldo.setText("100");
        txtsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoActionPerformed(evt);
            }
        });

        btmjugar.setText("Jugar");
        btmjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmjugarActionPerformed(evt);
            }
        });

        jLabel1.setText("Apuesta");

        jLabel2.setText("Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblimagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxApuesta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblimagen3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(lblimagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(lblimagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addComponent(btmjugar)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        aleatorio1=(int)(Math.random()*10+1);
        System.out.print(aleatorio1);
    }//GEN-LAST:event_formWindowOpened

    private void btmjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmjugarActionPerformed
        temporizador.start();
        apuesta=Integer.parseInt(cbxApuesta.getSelectedItem().toString());
    }//GEN-LAST:event_btmjugarActionPerformed

    private void txtsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaldoActionPerformed

    private void cbxApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxApuestaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmjugar;
    private javax.swing.JComboBox cbxApuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
