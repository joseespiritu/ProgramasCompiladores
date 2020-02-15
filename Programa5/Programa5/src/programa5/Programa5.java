/*PROGRAMA 5 COMPILADOR TRES SEGUNDA EXPRESION (a | b | c)* cac* 
    EL SIGUIENTE PROGRAMA VALIDA CADENAS DE CARACTERES QUE SOLO CONTENGAN a,b,c en cualquier orden y terminen con ac, ca, a, ba
    en caso contrario dira que la cadena no es valida*/
package programa5;

import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Programa5 {

    public String cadena = "";
    public int aceptar = 1;
    public int error = 0;
    public int indice = 0;

    public static void main(String[] args) {
        Programa5 obj = new Programa5();
        //obj.cadena = JOptionPane.showInputDialog("Dame la cadena");
        if (obj.aceptar == obj.estado_A()) {
            JOptionPane.showInputDialog(null, "Cadena Valida");
        } else {
            JOptionPane.showInputDialog(null, "Cadena Invalida");
        }
    }

    public char siguienteCaracter() {
        char c = ' ';
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        return c;
    }

    public int estado_A() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
            case 'b':
                return estado_C();
            case 'c':
                return estado_D();
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
                return estado_C();
            case 'c':
                return estado_E();
            case ' ':
                return aceptar;
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
            case 'c':
                return estado_D();
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
                return estado_C();
            case 'c':
                return estado_D();
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
            case 'c':
                return estado_E();
            case ' ':
                return aceptar;
            default:
                return error;
        }
    }
}
