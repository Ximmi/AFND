package afnd;
// AUTÓMATA QUE DETECTA DOS 0'S O DOS 1'S SEGUIDOS
public class A1 {
    String cadena;
    String respuesta;
    int lon, cont;

    
    public A1(String cadena){
        this.cadena=cadena;
        lon=cadena.length();
        inicio();
    }
    
    void inicio(){
        System.out.println("AFnD iniciado...");
        cont=0;
        A();
    }
    void A(){
        System.out.println("contador: "+ cont + " char= " + cadena.charAt(cont) + " en A");
        if(cont==(lon-1)){
            respuesta="La cadena no pertenece al lenguaje";
        }
        else if(cont<lon-1){
            if(cadena.charAt(cont)=='0'){
                if(cadena.charAt(cont+1)=='0'){
                    cont++;
                    B();
                }
                if(cadena.charAt(cont+1)=='1'){
                    cont++;
                    A();
                }
            }
            if(cadena.charAt(cont)=='1'){
                if(cadena.charAt(cont+1)=='1'){
                    cont++;
                    C();
                }
                if(cadena.charAt(cont+1)=='0'){
                    cont++;
                    A();
                }
            }
            if(cadena.charAt(cont)!='0' || cadena.charAt(cont)!='1'){
                System.out.println("La cadena no pertenece al lenguaje (A)");
            }
        }
    }
    
    void B(){
        System.out.println("contador: "+ cont + " char= " + cadena.charAt(cont) + " en B");
        if(cont==lon-1){
            respuesta="La cadena no pertenece al lenguaje (B)";
        }
        else if(cont<lon-1){
            if(cadena.charAt(cont)=='0'){
                cont++;
                D();
            }
            if(cadena.charAt(cont)!='0'){
                respuesta="es dudoso que la cadena pertenezca (B)";
                System.out.println("es dudoso que la cadena pertenezca (B)");
            }
        }
    }

    void C(){
        System.out.println("contador: "+ cont + " char= " + cadena.charAt(cont) + " en C");
        if(cont==lon-1){
            respuesta="La cadena no pertenece al lenguaje(C)";
        }
        else if(cont<lon-1){
            if(cadena.charAt(cont)=='1'){
                cont++;
                D();
            }
            /*if(cadena.charAt(cont)!='1'){
                respuesta="es dudoso que la cadena pertenezca (C)";
                System.out.println("es dudoso que la cadena pertenezca (C)");
            }*/
        }
    }

    void D(){
        System.out.println("contador: "+ cont + " char= " + cadena.charAt(cont) + " en D ");
        if(cont==lon-1){
            System.out.println("Comparó");
            respuesta="La cadena pertenece al lenguaje";
        }
        else if(cont<lon-1){
            if(cadena.charAt(cont)=='1' || cadena.charAt(cont)=='0'){
                cont++;
                D();
            }
            if(cadena.charAt(cont)!='1' || cadena.charAt(cont)!='0'){
                respuesta="La cadena no pertenece al lenguaje (D)";
                System.out.println("La cadena no pertenece al lenguaje (D)");
            }
        }
    }
    
    
    public String getRespuesta() {
        return respuesta;
    }
}
