
package programa3;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Tipos {
    
    private int[] tipos = new int[7];
    /***
     * Dependiendo la posicion significara el rango que se utilizara 
     * indice 0 -> mayusculas
     * indice 1 -> minusculas
     * indice 2 -> numeros
     * indice 3 -> mayusculas y minusculas
     * indice 4 -> mayusculas y numeros
     * indice 5 -> minusculas y numeros
     * indice 6 -> minusculas, mayusculas y numeros
     */
    
    public void setRangos(String[] arg){
        for (int i = 0; i < arg.length; i++) {
            char[] tiposRangos = arg[i].toCharArray();
            switch(tiposRangos.length){
                case 1:
                    if (tiposRangos[0] == 'M') {        // Contendra mayusculas
                        tipos[0] = i + 1;
                    }
                    else if (tiposRangos[0] == 'm') {   // Contendra minusculas
                        tipos[1] = i + 1;
                    }
                    else if (tiposRangos[0] == 'N') {   // Contendra numeros"
                        tipos[2] = i + 1;
                    }
                    break;
                case 2:
                    if ((tiposRangos[0] == 'M' && tiposRangos[1] == 'm' ) || 
                            (tiposRangos[0] == 'm' && tiposRangos[1] == 'M')) {     // Contendra mayusculas y minusculas
                        tipos[3] = i + 1;
                    }
                    else if ((tiposRangos[0] == 'M' && tiposRangos[1] == 'N' ) || 
                            (tiposRangos[0] == 'N' && tiposRangos[1] == 'M')) {     // Contendra mayusculas y numeros
                        tipos[4] = i + 1;
                    }
                    else if ((tiposRangos[0] == 'N' && tiposRangos[1] == 'm' ) || 
                            (tiposRangos[0] == 'm' && tiposRangos[1] == 'N')) {     // Contendra minusculas y numeros
                        tipos[5] = i + 1;
                    }
                    break;
                case 3:         // Contendra todos los rangos
                    tipos[6] = i + 1;
                    break;
            }
        }
    }
    
    // Regreara cuantos conjunto de rangos se utilizaran en total. Numero de columnas para la tabla 
    public int numTipos(){
        int numero = 0;
        for (int i = 0; i < tipos.length; i++) {
            if(tipos[i] != 0){
                numero++;
            }
        }
        return numero;
    }

    public int[] getTipos() {
        return tipos;
    }
    
}
