
package programa10;

public class sintactico1 {

    private String cadena = "a c d x c b ; a a b ;";
    private String token;
    private int indice;
    private boolean correcto = false;
    private boolean error = false;
    private int linea = 0;
    private int posicion = 0;

    public static void main(String[] args) {
        sintactico1 app = new sintactico1();
        app.token = app.getToken();
        app.metodo_S();

    }

    private String getToken() {
        String token = null;
        if (indice < cadena.split(" ").length) {
            token = cadena.split(" ")[indice];
            indice++;
            posicion += 1;
            if (token.equals(";")) {
                posicion = 0;
            }

        } else {
            token = "EOF";
        }
        return token;
    }

    private void metodo_S() {
        do {
            metodo_Z();
            if (token != null && token.equals(";")) {
                correcto = true;
                linea += 1;
                System.out.println("Linea" + linea);
            } else {
                error = true;
                token = null;
            }
            if (error && correcto) {
                System.out.println("Sintaxis correcta");
            } else {

                System.out.println("Sintaxis incorrecta: Posicion " + posicion);
            }
            token = getToken();
            error = false;
            correcto = false;
        } while (!token.equals("EOF"));
    }

    private void metodo_Z() {
        if (token != null && token.equals("a")) {
            token = getToken();
            metodo_A();
            if (token != null && token.equals("b")) {
                token = getToken();
            } else {
                error = true;
                token = null;
            }
        } else {
            error = true;
        }
    }

    private void metodo_A() {
        if (token != null && token.equals("c")) {
            token = getToken();
            metodo_B();
            if (token != null && token.equals("c")) {
                token = getToken();
                return;
            } else {
                error = true;
            }
        } else {
            error = true;
        }
    }

    private void metodo_B() {
        if (token != null && token.equals("d") || token != null && token.equals("w")) {
            token = getToken();
            metodo_B();
            return;
        } else {
            error = true;
        }

    }

}
