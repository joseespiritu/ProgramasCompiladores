/*PROGRAMA 2 ANALIZADOR LEXICO 2 LETRA/DIGITO
    A TARVES DE UN RECURSO ESTABLECIDO EN UNA CLASE EL SIGUIENTE PORGRAMA VALIDARA SI LOS CARACTERES INSERTADOS 
    SON LETRAS MAYUSCULAS Y MINUSCULAS O NUMEROS, EN CASO CONTRARIO MOSTRARA QUE NO SON CARACTERES VALIDOS*/
package programa2;

import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Programa2 {

    //Variables para insertar la cadena y los estados de aceptacion, error e indice
    public String cadena = "";
    public boolean aceptar = false;
    public int error = 0;
    public int indice = 0;
    public int estado = 1;
    public char simbolo;

    public static void main(String[] args) {
        Inicio ini = new Inicio();
        ini.setVisible(true);
        Programa2 obj = new Programa2();
        Rangos rango = new Rangos();
        //obj.cadena = JOptionPane.showInputDialog("Dame la cadena");
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
            JOptionPane.showMessageDialog(null, "Cadena No Valida");
        } else {
            JOptionPane.showMessageDialog(null, "Cadena Valida");

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
}
