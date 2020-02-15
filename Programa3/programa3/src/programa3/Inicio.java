package programa3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Inicio extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser(System.getProperty("user.home") + "\\Documents\\ProgramasFinalesCompiladores");
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    public String salidaUsuario = "";

    public Inicio() {
        initComponents();
    }

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

    public String GuardarArchivo(File archivo, String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
            return mensaje;
        }
        return mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BuscaArchivo = new javax.swing.JButton();
        CuadroCadena = new javax.swing.JTextField();
        GuardaArchivo = new javax.swing.JButton();
        ExamCadena = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuscaArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscaArchivo.setText("Buscar Archivo");
        BuscaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaArchivoMouseClicked(evt);
            }
        });

        CuadroCadena.setText("Esperando Cadena...");

        GuardaArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GuardaArchivo.setText("Guardar Archivo");
        GuardaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardaArchivoMouseClicked(evt);
            }
        });

        ExamCadena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExamCadena.setText("Analizar Cadena");
        ExamCadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamCadenaMouseClicked(evt);
            }
        });
        ExamCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamCadenaActionPerformed(evt);
            }
        });

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(BuscaArchivo)
                                .addGap(18, 18, 18)
                                .addComponent(GuardaArchivo))
                            .addComponent(CuadroCadena)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ExamCadena)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscaArchivo)
                    .addComponent(GuardaArchivo))
                .addGap(18, 18, 18)
                .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExamCadena)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void GuardaArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardaArchivoMouseClicked
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String Documento = CuadroCadena.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Guardar Documento de Texto");
                }
            }
        }
    }//GEN-LAST:event_GuardaArchivoMouseClicked

    private void ExamCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamCadenaMouseClicked

    }//GEN-LAST:event_ExamCadenaMouseClicked

    private void ExamCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamCadenaActionPerformed
        salidaUsuario = "";
        imprimir(salidaUsuario);
        String cadenas[] = new String[CuadroCadena.getText().split(" ").length];
        cadenas = CuadroCadena.getText().split(" ");
        for (int i = 0; i < cadenas.length; i++) {
            Programa3 obj = new Programa3();
            Rangos rango = new Rangos();
            obj.sCadena = cadenas[i];
            imprimir("Cadena #"+(i+1)+"\n"+obj.sCadena);
            obj.simbolo = obj.siguienteCaracter();
            while (!obj.valor.equals("aceptar") && obj.error != true) {
                if (rango.rangoaz_AZ(obj.simbolo)) {
                    obj.columna = 0;
                    obj.siguienteEstado();
                } else if (rango.rango09(obj.simbolo)) {
                    obj.columna = 1;
                    obj.siguienteEstado();
                } else if (obj.simbolo == ' ') {
                    obj.columna = 2;
                    obj.siguienteEstado();
                } else {
                    obj.error = true;
                }

                obj.simbolo = obj.siguienteCaracter();
            }

            if (obj.aceptar) {
                //JOptionPane.showMessageDialog(null, "Correcto :)");
                imprimir(":  Cadena correcta \n\n");
            } else {
                //JOptionPane.showMessageDialog(null, "Incorrecto :(");
                imprimir(":  Cadena Incorrecta \n\n");

            }
        }
        CuadroCadena.setText("");
    }//GEN-LAST:event_ExamCadenaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CuadroCadena.setText("");
        Salida.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void imprimir(String txt) {
        salidaUsuario = salidaUsuario + txt;
        Salida.setText(salidaUsuario);
    }

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
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Inicio llamada = new Inicio();
        llamada.setResizable(false);
        llamada.setTitle("Tabla de transicion: estatica ");
        llamada.setVisible(true);
        llamada.CuadroCadena.setText("Esperando Cadena...");
        llamada.CuadroCadena.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaArchivo;
    private javax.swing.JTextField CuadroCadena;
    private javax.swing.JButton ExamCadena;
    private javax.swing.JButton GuardaArchivo;
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
