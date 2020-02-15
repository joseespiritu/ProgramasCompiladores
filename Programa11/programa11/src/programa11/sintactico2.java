package programa11;
import programa11.Inicio;
public class sintactico2 {

    public String cadena = "";
    public String token;
    public int indice = 0;
    public boolean correcto = false;
    public boolean error = false;
    public int linea = 0;
    public int posicion = 0;

    public static void main(String[] args) {
        sintactico2 app = new sintactico2();
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
        if (token != null && token.equals("(")) {
            token = getToken();
            metodo_E();
            if (token != null && token.equals(")")) {
                token = getToken();
                if (token != null && !token.equals(";")) {
                    metodo_X();
                }
            } else {
                token = getToken();
                error = true;
            }
        } else if (token != null && token.equals("numero")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        } else if (token != null && token.equals("Numero")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        } else if (token != null && token.equals("NUMERO")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        }
    }

    public void metodo_X() {
        if (token != null && token.equals("*")) {
            token = getToken();
            metodo_E();
            if (token != null) {
                //token = getToken();
                metodo_X();
            }
        } else if (token != null && token.equals("+")) {
            token = getToken();
            metodo_E();
            if (token != null) {
                //token = getToken();
                metodo_X();
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
