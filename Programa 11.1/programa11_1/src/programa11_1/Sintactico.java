
package programa11_1;

public class Sintactico {
    
    //public String cadena = "a c d x c b ; a a b ;";
    public String cadena = "a";
    public String token;
    public int indice;
    public boolean correcto = false;
    public boolean error = false;
    public int linea=0;
    public int posicion=0;
    
    public static void main(String[] args) {
          Sintactico app = new Sintactico();
          app.token = app.getToken();
          app.metodo_S();
          
    }

    public String getToken() {
        String token = null;
        if(indice < cadena.split(" ").length){
            token = cadena.split(" ")[indice];
            indice++;
            posicion+=1;
            if (token.equals(";")){
                posicion=0;
            }
            
        }else{
            token = "EOF";
        }
        return token;
    }
    
    public void metodo_S(){
        do{
            metodo_Z();
            if (token!=null && token.equals(";")){
                    correcto = true;
                    linea+=1;
                    System.out.println("Linea"+ linea);
                }else{
                    error = true;
                    token =null;
                } 
            if (error && correcto){
              System.out.println("Sintaxis correcta");
          } else {
              
              System.out.println("Sintaxis incorrecta: Posicion "+ posicion);
          }
           token = getToken();
          error=false;
          correcto=false;
        }while(!token.equals("EOF"));
    }
    
    public void metodo_Z() {
        if (token!=null && token.equals("a")){
            token = getToken();
            metodo_A();
            if(token!=null && token.equals("b")){
                token = getToken();
            }else{
                error = true;
                token = null;
            }
        }else{
            error =true;
        }
    }     

    public void metodo_A() {
        if (token!=null && token.equals("c")){
            token = getToken();
            metodo_B();
            if (token!=null && token.equals("c")){
                token=getToken();
                return;
            }else {
                error= true;
            }
        }else{
            error = true;
        }     
    }
    
    public void metodo_B(){
         if (token!=null && token.equals("d") || token!=null && token.equals("w")){
            token = getToken();
            metodo_B();
            return;
        }else{
            error = true;
        }
        
    }
    
}
