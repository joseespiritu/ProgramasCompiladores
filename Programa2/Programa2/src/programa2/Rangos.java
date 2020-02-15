//Recurso de Letra Digito para el programa 2
package programa2;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Rangos {

    public boolean rangoaz_AZ(char simbolo) {
        int ascii = (int) simbolo;
        boolean valido = false;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            System.out.println("Caracteres Validos");
            valido = true;
        }
        return valido;
    }

    public boolean rangoAZ(char simbolo) {
        int ascii = (int) simbolo;
        boolean valido = false;
        if ((ascii >= 65 && ascii <= 90)) {
            System.out.println("Caracteres Validos");
            valido = true;
        }
        return valido;
    }

    public boolean rangoaz(char simbolo) {
        int ascii = (int) simbolo;
        boolean valido = false;
        if ((ascii >= 95 && ascii <= 122)) {
            System.out.println("Caracteres Validos");
            valido = true;
        }
        return valido;
    }

    public boolean rango09(char simbolo) {
        int ascii = (int) simbolo;
        boolean valido = false;
        if ((ascii >= 48 && ascii <= 57)) {
            System.out.println("Caracteres Validos");
            valido = true;
        }
        return valido;
    }

    public boolean rangoaz_AZ_09(char simbolo) {
        int ascii = (int) simbolo;
        boolean valido = false;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
            System.out.println("Caracteres Validos");
            valido = true;
        }
        return valido;
    }

    /*public static void main(String[] args) {
        Rangos r = new Rangos();
        System.out.println(r.rangoaz_AZ_09('5'));
    }*/
}
