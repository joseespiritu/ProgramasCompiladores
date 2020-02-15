package programa4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
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
  public String salidaUsusario = "";
  public int contCadena = 1;
  String[][] tablaTemporal = {{"3", "2", "error"},
  {"error", "error", "error"},
  {"3", "3", "aceptar"}};

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
        CuadroMatriz = new javax.swing.JTextField();
        GuardaArchivo = new javax.swing.JButton();
        ExamCadena = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMatriz = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuscaArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscaArchivo.setText("Buscar Archivo");
        BuscaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaArchivoMouseClicked(evt);
            }
        });

        CuadroMatriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuadroMatrizMousePressed(evt);
            }
        });
        CuadroMatriz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CuadroMatrizKeyPressed(evt);
            }
        });

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Matriz:");

        areaMatriz.setColumns(20);
        areaMatriz.setRows(5);
        jScrollPane2.setViewportView(areaMatriz);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ExamCadena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BuscaArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(GuardaArchivo))
                    .addComponent(CuadroMatriz)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscaArchivo)
                            .addComponent(GuardaArchivo))
                        .addGap(18, 18, 18)
                        .addComponent(CuadroMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExamCadena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
            CuadroMatriz.setText(documento);
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
          String Documento = CuadroMatriz.getText();
          String mensaje = GuardarArchivo(archivo, Documento);
          if (mensaje != null) {
            JOptionPane.showMessageDialog(null, mensaje);
          } else {
            JOptionPane.showMessageDialog(null, "Guardar Documento de Texto");
          }
        }
      }
    }//GEN-LAST:event_GuardaArchivoMouseClicked

  //nada!
    private void ExamCadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamCadenaMouseClicked

    }//GEN-LAST:event_ExamCadenaMouseClicked

  //boton analizar
    private void ExamCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamCadenaActionPerformed
      salidaUsusario = "";
      jTextArea1.setText(salidaUsusario);
      analizar();
    }//GEN-LAST:event_ExamCadenaActionPerformed

  public void analizar() {
    pintaMatriz(tablaTemporal);

    String cadenas[] = cadenas = CuadroMatriz.getText().split(" ");
    for (int i = 0; i < cadenas.length; i++) {
      Programa4 obj = new Programa4(this);
      Rangos rango = new Rangos();

      obj.tabla = tablaTemporal;
      obj.sCadena = cadenas[i];
      imprimir("Cadena #" + (i+1) + "\n" + obj.sCadena);
      contCadena++;
      obj.simbolo = obj.siguienteCaracter();
      // System.out.println("obj simbolo: "+obj.simbolo);
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
        imprimir(":  Cadena correcta \n\n");
      } else {
        imprimir(":  Cadena Incorrecta \n\n");
      }
    }
  }

  public String pintaMatriz(String[][] tabla) {
    String mat = "";
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla.length; j++) {
        String tmp;
        if (tabla[i][j] == "error" || tabla[i][j] == "aceptar") {
          tmp = String.format("%-7s", tabla[i][j]);
        } else {
          tmp = String.format("%-9s", tabla[i][j]);
        }
        mat += tmp;
      }
      mat += "\n";
    }
    return mat;
  }

  //boton Matriz (crea una nueva)
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String SMat = JOptionPane.showInputDialog("Dame el tamaño de la matriz: ");
    if (SMat != null) {
      int matrizTam = Integer.parseInt(SMat);
      String[][] tablatemp = new String[matrizTam][matrizTam];
      for (int i = 0; i < matrizTam; i++) {
        for (int j = 0; j < matrizTam; j++) {
          tablatemp[i][j]
                  = JOptionPane.showInputDialog("Ingrese el valor [" + i + "][" + j + "]");
        }
      }
      tablaTemporal = tablatemp;
      areaMatriz.setText(pintaMatriz(tablaTemporal));
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  //boton limpiar
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    salidaUsusario = "";
    jTextArea1.setText("");
  }//GEN-LAST:event_jButton2ActionPerformed

  //limpia entrada al hacer click
  private void CuadroMatrizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroMatrizMousePressed
    CuadroMatriz.setText("");
  }//GEN-LAST:event_CuadroMatrizMousePressed

  //presionando teclado
  private void CuadroMatrizKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuadroMatrizKeyPressed
    if (27 == evt.getKeyCode()) {
      this.dispose();
    }
    if (10 == evt.getKeyCode()) {
      analizar();
    }
  }//GEN-LAST:event_CuadroMatrizKeyPressed

  public void imprimir(String txt) {
    salidaUsusario = salidaUsusario + txt;
    jTextArea1.setText(salidaUsusario);
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

    Inicio llamada = new Inicio();
    llamada.setResizable(false);
    llamada.setTitle("Tabla de transicion: dinamica ");
    llamada.setVisible(true);
    llamada.CuadroMatriz.setText("Esperando Cadena...");
    llamada.CuadroMatriz.setEditable(true);
    llamada.areaMatriz.setText(llamada.pintaMatriz(llamada.tablaTemporal));
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaArchivo;
    private javax.swing.JTextField CuadroMatriz;
    private javax.swing.JButton ExamCadena;
    private javax.swing.JButton GuardaArchivo;
    private javax.swing.JTextArea areaMatriz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
