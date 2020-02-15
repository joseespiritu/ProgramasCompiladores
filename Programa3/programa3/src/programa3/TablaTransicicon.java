package programa3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * 
 * @author JoséLuisEspíritu
 */
public class TablaTransicicon {
    private int columnas;           // Rangos en la Tabla de transicion (# dde columnas)
    private int filas;              // No. de estados que tiene el AFD
    private String[][] tabla;
    private Tipos tipos;            // Tipos de rangos que utilizará el AFD

    
    // Se muestra un cuadro de diálogo JFileChooser que permite seleccionar el archivos
    public void abrirArchivo(){
        // Crea la ventana y la situa en el directorio actual
        JFileChooser selecArch = new JFileChooser();   
        selecArch.setCurrentDirectory(new File("."));
        
        // Se configura para solo seleccionar archivos, sin filtros
        selecArch.setFileSelectionMode(selecArch.FILES_ONLY);
        selecArch.setAcceptAllFileFilterUsed(false);
        
        // Se guarda un 0 se es seleccionado algun archivo o un 1 si se cancela
        int resultado = selecArch.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            this.leerArchivo(selecArch.getSelectedFile()); // Manda la direccion del archivo
        }
    }

    private void leerArchivo(File archivo) {
        FileReader lector = null;
        BufferedReader buffer = null;
        String linea;
        tipos = new Tipos();
                
        try {
            lector = new FileReader(archivo);
            buffer = new BufferedReader(lector);
            
            // Leemos la primera linea que contendra los rangos utilizados
            linea = buffer.readLine();
            
            // Separaremos la 1a. linea en un conjunto de Strings por medio de espacios 
            String[] arg = linea.split(" ");
            
            // Estableceremos los Rangos que se ocuparan
            tipos.setRangos(arg);
            
            // Vemos cuantas filas tendra la tabla de Transiciones
            columnas = tipos.numTipos() + 1;
            
            // Leemos la siguiente linea que contendra el numero de estados
            linea = buffer.readLine();
            filas = Integer.parseInt(linea);
            
            // Se crea la Tabla de Transiciones con el tamaño que necesita
            tabla = new String[filas][columnas];
            
            // Ingresamos los valores a la tabla
            for (int i = 0; i < filas; i++) {
                linea = buffer.readLine();
                arg = linea.split(" ");
                for (int j = 0; j < columnas; j++) {
                     tabla[i][j] = arg[j + 1];
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TablaTransicicon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TablaTransicicon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex){
            Logger.getLogger(TablaTransicicon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilas() {
        return filas;
    }

    public String[][] getTabla() {
        return tabla;
    }

    public Tipos getTipos() {
        return tipos;
    }
}
