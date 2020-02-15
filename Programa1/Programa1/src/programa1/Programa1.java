/*PRIMER PROGRAMA ANALIZADOR LEXICO N°1
    Este programa aceptara cadenas validas con los caracreres a y b siempre y cuando estas cadenas de caracteres terminen
    con "abb"*/
package programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Programa1 {

    //VARIABLES PARA CADENA DE ENTRADA, ESTADO DE ACEPTACION, ERROR E INDICE
    public String cadena = "";
    public int aceptar = 1;
    public int error = 0;
    public int indice = 0;

    public static void main(String[] args) {
        Inicio ini = new Inicio();
        ini.setVisible(true);
        Programa1 obj = new Programa1();
        if (obj.aceptar == obj.estado_A()) {
            JOptionPane.showMessageDialog(null, "Cadena Valida");
        } else {
            JOptionPane.showMessageDialog(null, "Cadena No Valida");
        }
    }
    
    //METODOS PARA LA VALIDACION DE LAS CADENAS
    public char siguienteCaracter() {
        char c = ' ';
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        return c;
    }

    int estado_A() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_C();
            default:
                return error;
        }
    }

    public int estado_B() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_D();
            default:
                return error;
        }
    }

    public int estado_C() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_C();
            default:
                return error;
        }
    }

    public int estado_D() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_E();
            default:
                return error;
        }
    }

    public int estado_E() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_C();
            case ' ':
                return aceptar;
            default:
                return error;
        }
    }
}
