/*PROGRAMA 4
    El siguiente programa genera matrices del tamaño que se le especifque con los elementos que se desean y con el nombre
    que se quiera en un archivo de texto*/
package programa4;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Programa4 {
/*
    public String[][] tabla = {{"3", "2", "error"},
    {"error", "error", "error"},
    {"3", "3", "aceptar"}};
    */

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
 
    public String[][] tabla ;
    public Inicio init;

  public Programa4(Inicio init) {
    this.init = init;
    tabla = init.tablaTemporal;
  }
    
    
    public void siguienteEstado() {
        valor = tabla[estado][columna];
        try {
            estado = Integer.parseInt(valor) - 1;
        } catch (NumberFormatException e) {
            if (valor.equals("error")) {
                error = true;
            } else if (valor.equals("aceptar")) {
                aceptar = true;
            } else {
                error = true;
            }
        }
    }

    // Funcion para comprobar y/u obtener un caracter siguiente en la cadena
    public char siguienteCaracter() {
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
