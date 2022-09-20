package javasort;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> compareID = 
            (Dados a1, Dados a2) ->
                   a1.getId() - a2.getId();
    Comparator<Dados> comparePoder = 
            (Dados a1, Dados a2) ->
                    (int) (a1.getPoder()- a2.getPoder());
    Comparator<Dados> comparePersonagem = 
            (Dados a1, Dados a2) ->
                    a1.getPersonagem().compareTo(a2.getPersonagem());
    Comparator<Dados> compareSaga = 
            (Dados a1, Dados a2) ->
                    a1.getSaga().compareTo(a2.getSaga());
    Comparator<Dados> compareSerie = 
            (Dados a1, Dados a2) ->
                    a1.getSerie().compareTo(a2.getSerie());
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, 469));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblProx, new org.netbeans.lib.awtextra.AbsoluteConstraints(1397, 53, 890, 159));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/dbz.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 148, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/personagem.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Personagem", "Poder", "Saga", "Serie"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Persongaem", "Poder", "Saga", "Serie" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(opBin);
        opBin.setText("Binária");

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        opSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSeqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addComponent(cbOrdena, 0, 232, Short.MAX_VALUE)
                        .addComponent(txtBusca)
                        .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(opSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opBin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opBin)
                            .addComponent(opSeq))
                        .addGap(23, 23, 23)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dbzs.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados dbz = new Dados();
                leitura = line.split(",");
                dbz.setId(Integer.parseInt(leitura[0]));
                dbz.setPersonagem(leitura[1]);
                dbz.setPoder(Double.parseDouble(leitura[2]));
                dbz.setSaga(leitura[3]);
                dbz.setSerie((leitura[4]));
                lista.add(dbz); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"ID","Personagem","Poder","Saga","Serie"}));
       
        DefaultTableModel model = 
                (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[9];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getId();
            rowData[1] = d.getPersonagem();
            rowData[2] = d.getPoder();
            rowData[3] = d.getSaga();
            rowData[4] = d.getSerie();
            //System.out.println("TempMin:"+d.getTemperaturaMinima()+"\n");
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
    switch(cbOrdena.getSelectedIndex()){    
        case 0: lista.sort(compareID);
            break;
        case 1: Collections.sort(lista);
            break;
        case 2: lista.sort(comparePoder);
            break;
        case 3: lista.sort(compareSaga);
            break;
        case 4: lista.sort(compareSerie);
            break;
        default: JOptionPane.showMessageDialog(null,"Em construção!");    
        }    
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
       int cont=0;
        switch(cbOrdena.getSelectedIndex()){    
        case 0: 
            break;
        case 1:  if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getPersonagem().equalsIgnoreCase(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Personagem encontrada "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setPersonagem(txtBusca.getText()); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d , comparePersonagem);// int pos = Collections.binarySearch(lista,d,compareTempMax);
                  if (pos <=0){
                      JOptionPane.showMessageDialog(null,"Personagem não encontrado"); 
                  }else{
                  JOptionPane.showMessageDialog(null,"Personagem encontrada, posicao "+pos); 
                  
                  }
                }// fim else binary
            break;
            case 3:  if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getSaga().equalsIgnoreCase(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Saga encontrada "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setSaga(txtBusca.getText()); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d , compareSaga);// int pos = Collections.binarySearch(lista,d,compareTempMax);
                  if (pos <=0){
                      JOptionPane.showMessageDialog(null,"Saga não encontrado"); 
                  }else{
                  JOptionPane.showMessageDialog(null,"Saga encontrada, posicao "+pos); 
                  
                  }
                }// fim else binary
            break;
        /*case 2: if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(txtBusca.getText().equals(d.getId())){
                          JOptionPane.showMessageDialog(null,"ID encontrado "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setId(Integer.parseInt(txtBusca.getText())); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d , compareID);// int pos = Collections.binarySearch(lista,d,compareTempMax);
                  if (pos <=0){
                      JOptionPane.showMessageDialog(null,"ID não encontrado"); 
                  }else{
                  JOptionPane.showMessageDialog(null,"ID encontrada, posicao "+pos); 
                  
                  }
                }// fim else binary
            break;*/
        default: JOptionPane.showMessageDialog(null,"Em construção!");              
        }// switch
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void opSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSeqActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
