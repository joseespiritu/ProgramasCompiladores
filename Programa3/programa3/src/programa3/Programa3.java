
package programa3;

import programa3.Rangos;
import programa3.TablaTransicicon;
import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Programa3 {
    public final String[][] tabla = {{"3",    "2",     "error"}, 
                                     {"error", "error", "error"}, 
                                     {"3",     "3",     "aceptar"}};
    
    public String valor = "";          // Cotendra el valor almacenado dentro de la tabla
    public String sCadena;             // Cadena a comprobar
    public boolean aceptar = false;
    public boolean error = false;              
    public int indice = 0;             // Posicion dentro de la cadena
    public int estado = 0;             // Indice de la fila de la tabla. Estado Inicial -> 0
    public char simbolo;
    public int columna;                // Indice para la columna de la tabla. 
                                        // Columna 0 -> Letraa
                                        // Columna 1 -> Digitos
                                        // Columna 2 -> Final de Cadena
    
    public Programa3() {
    }
    
    public static void main(String[] args) {
        Programa3 obj = new Programa3();
        Rangos rango = new Rangos();
        
        obj.sCadena = JOptionPane.showInputDialog(null, "Ingrese la cadena: ");
        obj.simbolo = obj.siguienteCaracter();
        
        while (!obj.valor.equals("aceptar") && obj.error != true) {   
            if (rango.rangoaz_AZ(obj.simbolo)) {
                obj.columna = 0;
                obj.siguienteEstado();
            }
            else if (rango.rango09(obj.simbolo)) {
                obj.columna = 1;
                obj.siguienteEstado();
            } 
            else if (obj.simbolo == ' ') {
                obj.columna = 2;
                obj.siguienteEstado();
            }
            else{
                obj.error = true;
            }
            
            obj.simbolo = obj.siguienteCaracter();
        }
        
        if (obj.aceptar) {
            JOptionPane.showMessageDialog(null, "Correcto :)");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto :(");
        }
    }
    
    public void siguienteEstado(){
        valor = tabla[estado][columna];
              
        try {
            estado = Integer.parseInt(valor) - 1;           
        } catch (NumberFormatException e) {
            if (valor.equals("error")){
                error = true;
            }
            else if (valor.equals("aceptar")) {
                aceptar = true;
            }
            else{
                error = true;
            }
        }
    }
    
      // Funcion para comprobar y/u obtener un caracter siguiente en la cadena
    public char siguienteCaracter(){
        char c = ' ';
        // El indice debe ser menor al tamaño de la cadena 
        // de lo contrario ya no abria un caracter siguiente
        if (sCadena.length() > indice) {     
            c = sCadena.charAt(indice);      // Obtienen el siguiente caracter
            indice++;
        }
        return c;
    }
    
}
