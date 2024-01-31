/*
    Trabalho do 4º bimestre
    Grupo: João Fernando e Luiza
    Data: novembro/2023
*/
package fornecedores;

import java.sql.*;
import javax.swing.JOptionPane;

public class Fornecedores_Controle extends javax.swing.JFrame {

    //Variáveis de conexão
    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/Fornecedor";
    static String user = "root";
    static String senha = "";
    Connection conexao;
    
    
    public Fornecedores_Controle() {
        initComponents();
        try{  //Carregamento do driver
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso");
        }catch(Exception e){
            System.out.println("Falha no carregamento do driver");
        }
        try{  //Conexão com o banco de dados
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
        }catch(Exception e){
            System.out.println("Falha na conexão com o BD - " + 
                                e.toString());
        }
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfCNPJ = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fornecedores");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo.setText("Código");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCidade.setText("Cidade");

        lblCNPJ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCNPJ.setText("CNPJ");

        tfID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/0001-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscar.setBackground(new java.awt.Color(255, 204, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 204, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNome)
                        .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCodigo)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCNPJ)
                            .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpar)
                        .addGap(2, 2, 2)))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        btnIncluir.setBackground(new java.awt.Color(255, 255, 102));
        btnIncluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(255, 255, 102));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 102));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(255, 255, 102));
        btnListar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(255, 255, 102));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluir)
                .addGap(27, 27, 27)
                .addComponent(btnAlterar)
                .addGap(26, 26, 26)
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(29, 29, 29)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String instSQL = "INSERT INTO tFornecedores VALUES (? , ?, ?, ?)";
        
        //Rodando a QUERY de Inserir
        try{
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, tfID.getText());
            ps.setString(2, tfNome.getText());
            ps.setString(3, tfCidade.getText());
            ps.setString(4, tfCNPJ.getText());
            ps.execute();
            System.out.println("Cadastro realizado com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Cadastro realizado com sucesso.");
            btnLimpar.doClick();
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Falha no cadastro! - " + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha no cadastro! - " + e.toString(), "ERRO!!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String instSQL = "DELETE FROM tFornecedores WHERE ID=?";
        //Rodando a QUERY de Deletar
        try{
            PreparedStatement ps =
                    conexao.prepareStatement(instSQL);
            ps.setString(1, tfID.getText());
            ps.execute();
            System.out.println("Exclusão realizada com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Exclusão realizada com sucesso.");
            btnLimpar.doClick();
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Falha na exclusão - " + 
                    e.toString());
            JOptionPane.showMessageDialog(null, 
                    "Falha na exclusão - " + e.toString(), 
                    "FALHA!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //Limpando os campos dos Text Fields
        tfID.setText(null);
        tfNome.setText(null);
        tfCidade.setText(null);
        tfCNPJ.setText(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String instSQL = "UPDATE tFornecedores SET NOME=?, CIDADE=?, CNPJ=? WHERE ID=?";
        //Rodando a QUERY de Atualizar, coletando dos text fields as informações digitadas
        try{
            PreparedStatement ps =
                    conexao.prepareStatement(instSQL);
            ps.setString(4, tfID.getText());
            ps.setString(1, tfNome.getText());
            ps.setString(2, tfCidade.getText());
            ps.setString(3, tfCNPJ.getText());
            ps.execute();
            System.out.println("Alteração realizada com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Alteração realizada com sucesso.");
            btnLimpar.doClick();
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Falha na alteração - " + 
                    e.toString());
            JOptionPane.showMessageDialog(null, 
                    "Falha na alteração - " + e.toString(), 
                    "FALHA!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ResultSet rs = null;
        String instSQL = 
                "SELECT NOME, CIDADE, CNPJ FROM "
                + "tFornecedores WHERE ID = ?";
        //Rodando a QUERY de Buscar, coletando dos text fields o ID
        try{
            PreparedStatement ps = 
                    conexao.prepareStatement(instSQL);
            ps.setString(1, tfID.getText());
            rs = ps.executeQuery();
            rs.next();
            tfNome.setText(rs.getString(1));
            tfCidade.setText(rs.getString(2));
            tfCNPJ.setText(rs.getString(3));
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Falha na busca - " + 
                    e.toString());
            JOptionPane.showMessageDialog(null, 
                    "Falha na busca - " + e.toString(), 
                    "FALHA!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        String instSQL = "SELECT ID, NOME FROM tFornecedores";
        ResultSet rs = null;
        String result = "";
        //Rodando a QUERY de Select Geral e colocando no JOptionPane
        try{
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);
            while(rs.next()){
                result += rs.getString(1) + " - " + rs.getString(2) + "\n";
            }
            JOptionPane.showMessageDialog(null, result, 
                    "Fornecedores cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Falha na listagem! - " + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha na listagem! - " + e.toString(), "ERRO!!!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        //Encerrando a conexão
        try{
            conexao.close();
            System.out.println("Conexão encerrada.");
        }/*Caso de errado*/catch(Exception e){
            System.out.println("Erro ao fechar a conexão.");
        }
        //Fechando a aplicação
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedores_Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
