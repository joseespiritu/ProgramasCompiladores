package programa2;

import java.io.FileInputStream;
import java.io.File;

import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import programa2.Programa2;
import programa2.Rangos;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Inicio extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser(System.getProperty("user.home")+"\\Documents\\ProgramasFinalesCompiladores");
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    public String salidaUsuario = "";

    public Inicio() {
        initComponents();
        CuadroCadena.setEditable(false);
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
    
    
    public void imprimir (String txt){
        salidaUsuario = salidaUsuario + txt ;
        Salida.setText(salidaUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BuscaArchivo = new javax.swing.JButton();
        CuadroCadena = new javax.swing.JTextField();
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

        ExamCadena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExamCadena.setText("Examinar Cadena");
        ExamCadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamCadenaMouseClicked(evt);
            }
        });

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ExamCadena)
                                .addGap(47, 47, 47)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(BuscaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BuscaArchivo)
                .addGap(18, 18, 18)
                .addComponent(CuadroCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExamCadena)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void ExamCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamCadenaMouseClicked
        salidaUsuario = "";
        imprimir(salidaUsuario);
        String cadenas[] = new String[CuadroCadena.getText().split(" ").length];
        cadenas = CuadroCadena.getText().split(" ");
        for (int i = 0; i < cadenas.length; i++) {
            Programa2 obj = new Programa2();
            Rangos rango = new Rangos();
            obj.cadena=cadenas[i];
            //obj.cadena = CuadroCadena.getText();
            imprimir("Cadena #"+(i+1)+"\n"+obj.cadena);
            obj.simbolo = obj.siguienteCaracter();
            while (obj.simbolo != ' ' || obj.error != 0) {
                switch (obj.estado) {
                    case 1:
                        if (rango.rangoaz_AZ(obj.simbolo)) {
                            obj.estado = 3;
                        } else if (rango.rango09(obj.simbolo)) {
                            obj.estado = 2;

                        } else {
                            obj.error = 0;
                        }
                        break;
                    case 2:
                        obj.error = 0;
                        break;
                    case 3:
                        if (rango.rangoaz_AZ(obj.simbolo)) {
                            obj.estado = 3;
                            obj.aceptar = true;
                        } else if (rango.rango09(obj.simbolo)) {
                            obj.estado = 3;
                            obj.aceptar = true;
                        } else {
                            obj.error = 0;
                        }
                        break;
                }
                obj.simbolo = obj.siguienteCaracter();
            }
            if (!obj.aceptar) {
                //JOptionPane.showMessageDialog(null, "Cadena No Valida");
                imprimir(":  Cadena No Valida \n\n");
            } else {
                //JOptionPane.showMessageDialog(null, "Cadena Valida");
                imprimir(":  Cadena Valida \n\n");
            }
        }
        CuadroCadena.setText("");
    }//GEN-LAST:event_ExamCadenaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        CuadroCadena.setText("");
        Salida.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

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
        llamada.setTitle("Analizador Léxico 2: Letra / Digito");
        llamada.setVisible(true);
        llamada.CuadroCadena.setText("Esperando Cadena...");
        llamada.CuadroCadena.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaArchivo;
    private javax.swing.JTextField CuadroCadena;
    private javax.swing.JButton ExamCadena;
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
