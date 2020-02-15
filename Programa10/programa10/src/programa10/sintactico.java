
package programa10;

/**
 *
 * @author JoséLuisEspíritu
 */
public class sintactico {
    
    public String cadena = "";
    public String token;
    public int indice = 0;
    public boolean correcto = false;
    public boolean error = false;
    public int linea = 0;
    public int posicion = 0;

    public static void main(String[] args) {
        sintactico app = new sintactico();
        app.token = app.getToken();
        app.metodo_S();
        if (app.isError()) {//(app.IsError())
            System.out.println("Error de sintaxis");
        } else {
            System.out.println("Correcto");
        }
    }

    public void metodo_S() {
        metodo_E();
        if (token != null && token.equals(";")) {
            correcto = true;
            linea += 1;
        } else {
            error = true;
        }
    }

    public void metodo_E() {
        if (token != null && token.equals("a")) {
            token = getToken();
            metodo_E();
            if (token != null && token.equals(";")) {
                token = getToken();             
            } else {
                token = getToken();
                error = true;
            }
        } else if (token != null && token.equals("A")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        } else if (token != null && token.equals("b")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        }
    }

    public void metodo_X() {
        if (token != null && token.equals("A")) {
            token = getToken();
            token = "c";
            metodo_E();
            if (token != null) {
                //token = getToken();
                metodo_S();
            }
        }
    }

    public String getToken() {
        String token = null;
        if (indice < cadena.split(" ").length) {
            token = cadena.split(" ")[indice];
            indice++;
            posicion += 1;
            if (token.equals(";")) {
                posicion = 0;
            }
        }
        return token;
    }

    public boolean isError() {
        return error;
    }
}
