package programa11;

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

/**
 *
 * @author JoséLuisEspíritu
 */
public class Inicio extends javax.swing.JFrame {
    
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

    private List<Tabla> tokenLista;

    public Inicio() {
        this.setLocationRelativeTo(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CadenaLB = new javax.swing.JLabel();
        CuadroCadena = new javax.swing.JTextField();
        AnalizaCadena = new javax.swing.JButton();
        SalidaLB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CuadroSalida = new javax.swing.JTextArea();
        BuscaArchivo = new javax.swing.JButton();
        Clean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadenaLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CadenaLB.setText("Cadena");

        CuadroCadena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AnalizaCadena.setText("Analizar Cadena");
        AnalizaCadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalizaCadenaMouseClicked(evt);
            }
        });

        SalidaLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SalidaLB.setText("Salida");

        CuadroSalida.setColumns(20);
        CuadroSalida.setRows(5);
        jScrollPane1.setViewportView(CuadroSalida);

        BuscaArchivo.setText("Buscar Archivo");
        BuscaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaArchivoMouseClicked(evt);
            }
        });

        Clean.setText("Limpiar");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalidaLB)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CadenaLB)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(AnalizaCadena)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BuscaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadenaLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnalizaCadena)
                    .addComponent(BuscaArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clean)
                .addGap(4, 4, 4)
                .addComponent(SalidaLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void AnalizaCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalizaCadenaMouseClicked
        try {
            this.analizarTokens();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AnalizaCadenaMouseClicked

    private void BuscaArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaArchivoMouseClicked
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
    }//GEN-LAST:event_BuscaArchivoMouseClicked

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
        llamada.setTitle("Analizador Sintactico 2");
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
        //System.out.println(token);
        while (token != null) {
            switch (token) {
                case MAS:
                    resultado += "<+>" + "\n";
                    break;
                case MENOS:
                    resultado += "<->" + "\n";
                    break;
                case PARENTIZQ:
                    resultado += "<(>" + "\n";
                    break;
                case PARENDER:
                    resultado += "<)>" + "\n";
                    break;
                case POR:
                    resultado += "<*>" + "\n";
                    break;
                case PUNTOCOMA:
                    resultado += "<;>" + "\n";
                    break;
                case NUM:
                    resultado += "<num>" + "\n";
                    break;
                case ERROR:
                    resultado += " ERROR, simbolo no encontrado. " + "\n";
                    break;
                /*case ID:
                    contadorID++;
                    Tabla tokens = new Tabla();
                    tokens.setNombre(lexico.yytext());
                    tokens.setId(contadorID);
                    tokenLista.add(tokens);
                    resultado += "<ID" + contadorID + ">" + " ";
                    break;*/
                /*case INT:
                    resultado += "<" + lexico.yytext() + ">" + " ";
                    break;*/
                default:
                    resultado += "<" + lexico.yytext() + ">" + " Simbolo no encontrado en la gramatica" + "\n";
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
        sintactico2 app = new sintactico2();
        app.cadena=CuadroCadena.getText();
        app.token = app.getToken();
        app.metodo_S();
        if (app.isError()) {//(app.IsError())
            CuadroSalida.append("Error de sintaxis" + "\n");
        } else {
            CuadroSalida.append("Sintaxis correcta" + "\n");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizaCadena;
    private javax.swing.JButton BuscaArchivo;
    private javax.swing.JLabel CadenaLB;
    private javax.swing.JButton Clean;
    private javax.swing.JTextField CuadroCadena;
    private javax.swing.JTextArea CuadroSalida;
    private javax.swing.JLabel SalidaLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
