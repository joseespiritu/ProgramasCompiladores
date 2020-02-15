package programa7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private List<Tabla> tokenLista;
    
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public String AbrirArchivo(File Archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {

        }
        return documento;
    }

    public Inicio() {
        this.setLocationRelativeTo(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AnalizaCadena = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CuadroSalida = new javax.swing.JTextArea();
        CuadroCadena = new javax.swing.JTextField();
        BuscaArchivo = new javax.swing.JButton();
        Clean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadena");

        AnalizaCadena.setText("Analizar");
        AnalizaCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizaCadenaActionPerformed(evt);
            }
        });

        jLabel2.setText("Salida");

        CuadroSalida.setColumns(20);
        CuadroSalida.setRows(5);
        jScrollPane1.setViewportView(CuadroSalida);

        CuadroCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroCadenaActionPerformed(evt);
            }
        });

        BuscaArchivo.setText("Buscar Archivo");
        BuscaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaArchivoActionPerformed(evt);
            }
        });

        Clean.setText("Limpiar");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(AnalizaCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BuscaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnalizaCadena)
                    .addComponent(BuscaArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clean)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalizaCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizaCadenaActionPerformed
        try {
            // TODO add your handling code here:
            this.analizarTokens();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AnalizaCadenaActionPerformed

    private void CuadroCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroCadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroCadenaActionPerformed

    private void BuscaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaArchivoActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    CuadroCadena.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_BuscaArchivoActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        CuadroSalida.setText("");
        CuadroCadena.setText("");
    }//GEN-LAST:event_CleanActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Inicio llamada = new Inicio();
        llamada.setResizable(false);
        llamada.setTitle("J_Flex 2");
        llamada.setVisible(true);
        llamada.CuadroCadena.setText("Esperando Cadena...");
        llamada.CuadroCadena.setEditable(true);
    }

    private void analizarTokens() throws FileNotFoundException, IOException {
        tokenLista = new LinkedList<>();
        this.CuadroSalida.selectAll();
        this.CuadroSalida.replaceSelection("");
        int contadorID = 0;
        File fichero = new File("Fuente.txt");
        PrintWriter writer;
        writer = new PrintWriter(fichero);
        writer.write(CuadroCadena.getText());
        writer.close();
        Reader leer = new BufferedReader(new FileReader("Fuente.txt"));
        Lexico lexico = new Lexico(leer);
        String resultado = "";
        Tokens token = lexico.yylex();
        while (token != null) {

            switch (token) {
                case PARENT_IZQ:
                    resultado += "<(>\n";
                    break;
                case PARENT_DER:
                    resultado += "<)>\n";
                    break;
                case TRUE:
                    resultado += "<true>\n";
                    break;
                case OR:
                    resultado += "<or>\n";
                    break;
                case SI:
                    resultado += "<si>\n";
                    break;
                case SII:
                    resultado += "<sii>\n";
                    break;
                case AND:
                    resultado += "<and>\n";
                    break;
                case FALSE:
                    resultado += "<false>\n";
                    break;
                case NOT:
                    resultado += "<not>\n";
                    break;
                case ERROR:
                    resultado += " ERROR,simbolo no encontrado. \n";
                    break;
                /*case ID:
                    contadorID++;
                    Tabla tokens = new Tabla();
                    tokens.setNombre(lexico.yytext());
                    tokens.setId(contadorID);
                    tokenLista.add(tokens);
                    resultado+="<ID"+contadorID+">";
                    break;*/
                case INT:
                    resultado += "<" + lexico.yytext() + ">";
                    break;
                default:
                    resultado += "<" + lexico.yytext() + ">";
            }
            token = lexico.yylex();

        }
        if (token == null) {
            for (Tabla tabla : tokenLista) {
                System.out.println(tabla.getNombre()
                        + "=" + tabla.getId());
            }
            CuadroSalida.append(resultado);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizaCadena;
    private javax.swing.JButton BuscaArchivo;
    private javax.swing.JButton Clean;
    private javax.swing.JTextField CuadroCadena;
    private javax.swing.JTextArea CuadroSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
