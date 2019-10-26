
package br.com.sistemasOs;
import Dados.Cadastro_os;

public class TelaCadastro extends javax.swing.JFrame {

    
    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblProblema = new javax.swing.JLabel();
        lblTipoequip = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtend = new javax.swing.JTextField();
        txtfone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtsituacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de nova Ordem de Serviço");

        lblNome.setText("Nome:");

        lblEndereco.setText("Endereço:");

        lblTelefone.setText("Telefone:");

        lblEmail.setText("Email:");

        lblProblema.setText("Descrição do problema:");

        lblTipoequip.setText("Tipo do Equipamento:");

        lblMarca.setText("Marca:");

        lblSituacao.setText("Situação:");

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoequip)
                            .addComponent(lblMarca)
                            .addComponent(lblEndereco)
                            .addComponent(lblProblema)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSituacao)
                            .addComponent(lblEmail)
                            .addComponent(lblTelefone))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                                .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtend))
                            .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoequip)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProblema)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(lblSituacao))
                    .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btncancelar))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        
        String nome=txtnome.getText();
        String endereco=txtend.getText();
        String telefone=txtfone.getText();
        String email=txtemail.getText();
        String problema=txtdescricao.getText();
        String tipo=txttipo.getText();
        String marca=txtmarca.getText();
        String situacao=txtsituacao.getText();
       
        Cadastro_os cadastro=new Cadastro_os(nome,endereco,telefone,email,problema,tipo, marca,situacao);
       
        this.dispose();
       
    }//GEN-LAST:event_btnsalvarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProblema;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipoequip;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtfone;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsituacao;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
