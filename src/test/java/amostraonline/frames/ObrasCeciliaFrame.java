/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package amostraonline.frames;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;

/**
 *
 * @author João Cláudio
 */
public class ObrasCeciliaFrame extends javax.swing.JFrame {

    ImageIcon ImageEspectros = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/espectros.png")).getSource()));
    ImageIcon ImageCriancaAmor = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/crianca-amor.png")).getSource()));
    ImageIcon ImageNuncaMais = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/nunca-mais.png")).getSource()));
    ImageIcon ImageBaladas = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/baladas-rei.png")).getSource()));
    ImageIcon ImageEspirito = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/espirito-vitorioso.png")).getSource()));
    ImageIcon ImageViagem = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/viagem.png")).getSource()));
    ImageIcon ImageBatuque = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/batuque-samba.png")).getSource()));
    ImageIcon ImageFestaLetras = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ImageIO.read(AutoursFrame.class.getResourceAsStream("/festa-letras.png")).getSource()));
    
    //Aqui está sendo criada objetos que são usados para representar uma imagem que será exibida na interface gráfica.
    
    public ObrasCeciliaFrame() throws IOException {
        initComponents();
        this.setLocation(500,200); //Indica a localização que a janela será gerada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Indica que quando o usuário fechar a janela, todos os processos serão finalizados
        this.setTitle("Principais obras de Cecilia Meireles"); //Indica o título da janela
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
        jTable1 = new javax.swing.JTable();
        BotaoVolta = new javax.swing.JButton();
        BotaoEspectros = new javax.swing.JButton();
        BotaoCriancaMeuAmor = new javax.swing.JButton();
        BotaoNuncaMais = new javax.swing.JButton();
        BotaoBaladasElRei = new javax.swing.JButton();
        BotaoEspiritoVitorioso = new javax.swing.JButton();
        BotaoViagem = new javax.swing.JButton();
        BotaoBatuque = new javax.swing.JButton();
        BotaoFestaLetra = new javax.swing.JButton();
        imagemObras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"                              Clique nas setinhas para ver a imagem das obras"},
                {"Espectros"},
                {"---------------------------------------------------------------------------------------------------"},
                {"Criança, meu amor"},
                {"---------------------------------------------------------------------------------------------------"},
                {" Nunca mais... e Poemas dos Poemas "},
                {"---------------------------------------------------------------------------------------------------"},
                {"Baladas para El-Rei"},
                {"---------------------------------------------------------------------------------------------------"},
                {"O Espírito Vitorioso"},
                {"---------------------------------------------------------------------------------------------------"},
                {"Viagem"},
                {"---------------------------------------------------------------------------------------------------"},
                {"Batuque, Samba e Macumba"},
                {"---------------------------------------------------------------------------------------------------"},
                {"A Festa das Letras"},
                {"---------------------------------------------------------------------------------------------------"}
            },
            new String [] {
                "Obras de Cecília Meireles"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BotaoVolta.setText("Voltar");
        BotaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltaActionPerformed(evt);
            }
        });

        BotaoEspectros.setText("->");
        BotaoEspectros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEspectrosActionPerformed(evt);
            }
        });

        BotaoCriancaMeuAmor.setText("->");
        BotaoCriancaMeuAmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCriancaMeuAmorActionPerformed(evt);
            }
        });

        BotaoNuncaMais.setText("->");
        BotaoNuncaMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNuncaMaisActionPerformed(evt);
            }
        });

        BotaoBaladasElRei.setText("->");
        BotaoBaladasElRei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBaladasElReiActionPerformed(evt);
            }
        });

        BotaoEspiritoVitorioso.setText("->");
        BotaoEspiritoVitorioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEspiritoVitoriosoActionPerformed(evt);
            }
        });

        BotaoViagem.setText("->");
        BotaoViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoViagemActionPerformed(evt);
            }
        });

        BotaoBatuque.setText("->");
        BotaoBatuque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBatuqueActionPerformed(evt);
            }
        });

        BotaoFestaLetra.setText("->");
        BotaoFestaLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFestaLetraActionPerformed(evt);
            }
        });

        imagemObras.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BotaoVolta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoEspectros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoCriancaMeuAmor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoNuncaMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoBaladasElRei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoEspiritoVitorioso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoBatuque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoFestaLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(imagemObras, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(imagemObras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoEspectros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCriancaMeuAmor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNuncaMais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoBaladasElRei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoEspiritoVitorioso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoViagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoBatuque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoFestaLetra)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoVolta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEspectrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEspectrosActionPerformed
        imagemObras.setIcon(ImageEspectros); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoEspectrosActionPerformed

    private void BotaoCriancaMeuAmorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCriancaMeuAmorActionPerformed
        imagemObras.setIcon(ImageCriancaAmor); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoCriancaMeuAmorActionPerformed

    private void BotaoNuncaMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNuncaMaisActionPerformed
        imagemObras.setIcon(ImageNuncaMais); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoNuncaMaisActionPerformed

    private void BotaoBaladasElReiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBaladasElReiActionPerformed
        imagemObras.setIcon(ImageBaladas); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoBaladasElReiActionPerformed

    private void BotaoEspiritoVitoriosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEspiritoVitoriosoActionPerformed
        imagemObras.setIcon(ImageEspirito); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoEspiritoVitoriosoActionPerformed

    private void BotaoViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoViagemActionPerformed
        imagemObras.setIcon(ImageViagem);  //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoViagemActionPerformed

    private void BotaoBatuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBatuqueActionPerformed
        imagemObras.setIcon(ImageBatuque); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoBatuqueActionPerformed

    private void BotaoFestaLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFestaLetraActionPerformed
        imagemObras.setIcon(ImageFestaLetras); //Aqui estamos indicando ao JLabel que uma imagem será gerada ao apertar o botão
    }//GEN-LAST:event_BotaoFestaLetraActionPerformed

    private void BotaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltaActionPerformed
        try {
            new SaibaCeciliaFrame().setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        dispose();
        
        //Quando o botão voltar for acionado, uma nova janela será criada e a janela apresentada para o usuário será finalizada
    }//GEN-LAST:event_BotaoVoltaActionPerformed

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
            java.util.logging.Logger.getLogger(ObrasCeciliaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObrasCeciliaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObrasCeciliaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObrasCeciliaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ObrasCeciliaFrame().setVisible(true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBaladasElRei;
    private javax.swing.JButton BotaoBatuque;
    private javax.swing.JButton BotaoCriancaMeuAmor;
    private javax.swing.JButton BotaoEspectros;
    private javax.swing.JButton BotaoEspiritoVitorioso;
    private javax.swing.JButton BotaoFestaLetra;
    private javax.swing.JButton BotaoNuncaMais;
    private javax.swing.JButton BotaoViagem;
    private javax.swing.JButton BotaoVolta;
    private javax.swing.JLabel imagemObras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}