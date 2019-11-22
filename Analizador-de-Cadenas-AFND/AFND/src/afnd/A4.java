package afnd;
public class A4 {
    String cadena, respuesta;
    int cont, longi, vuelta=1;
    A4(String cadena){
        this.cadena=cadena;
        longi=cadena.length()-1;
        if(analizar()){
            Inicio();
        }
        else{
            respuesta="Cadena inválida";
        }
    }
    
    void Inicio(){
        System.out.println("AFnD iniciado...");
        cont=0;
        A();
    }
    
    void A(){
        System.out.println("Estado A");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont<=longi){
            if(vuelta==1){
                B();
            }
            if(vuelta==2){
                D();
            }
        }
    }
    
    void B(){
        System.out.println("Estado B");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont==longi){
            if(cadena.charAt(longi)=='0'){
                C();
            }
            if(cadena.charAt(longi)=='1'){
                vuelta=2;
                Inicio();
            }
        }
        if(cont<longi){
            cont++;
            B();
            
        }
    }
    
    void C(){
        System.out.println("Estado C");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        System.out.println("La cadena pertenece al lenguaje (C)");
        respuesta="La cadena pertenece al lenguaje (C)";
    }
    
    void D(){
        System.out.println("Estado D");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont<=longi){
            if(cadena.charAt(cont)=='0'){
                cont++;
                E();
            }
            if(cadena.charAt(cont)=='1'){
                cont++;
                G();
            }
            
        } 
    }
    
    void E(){
        System.out.println("Estado E");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont==longi){
            System.out.println("La cadena no pertenece al lenguaje (E)");
            respuesta="La cadena no pertenece al lenguaje (E)";
        }
        if(cont<longi){
            if(cadena.charAt(cont)=='1'){
                cont++;
                F();
            }
            else{
                System.out.println("La cadena no pertenece al lenguaje (E0)");
                respuesta="La cadena no pertenece al lenguaje (E0)";
            }
        }
    }
    
    void F(){
        
        System.out.println("Estado F");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        if(cont==longi){
            System.out.println("La cadena pertenece al lenguaje (F)");
            respuesta="La cadena pertenece al lenguaje (F)";
        }
        if(cont<longi){
            if(cadena.charAt(cont)=='0'){
                cont++;
                E();
            }
            else{
                System.out.println("La cadena no pertenece al lenguaje (F1)");
                respuesta="La cadena no pertenece al lenguaje (F1)";
            }
        }
    }
    
    void G(){
        System.out.println("Estado G");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont==longi){
            System.out.println("La cadena no pertenece al lenguaje (G)");
            respuesta="La cadena no pertenece al lenguaje (G)";
        }
        if(cont<longi){
            if(cadena.charAt(cont)=='0'){
                cont++;
                H();
            }
            else{
                System.out.println("La cadena no pertenece al lenguaje (G0)");
                respuesta="La cadena no pertenece al lenguaje (G0)";
            }
        }
    }
    
    void H(){
        
        System.out.println("Estado H");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        if(cont==longi){
            System.out.println("La cadena pertenece al lenguaje (H)");
            respuesta="La cadena pertenece al lenguaje (H)";
        }
        if(cont<longi){
            if(cadena.charAt(cont)=='1'){
                cont++;
                G();
            }
            else{
                System.out.println("La cadena no pertenece al lenguaje (H1)");
                respuesta="La cadena no pertenece al lenguaje (H1)";
            }
        }
    }
    
    
    boolean analizar(){
        boolean resultado=true;
        int i=0;
        while(resultado && i<longi){
            if(cadena.charAt(i)=='0' || cadena.charAt(i)=='1'){
                i++;
            }
            else{
                resultado=false;
            }
        }
        
        return resultado;
    }
    public String getRespuesta() {
        return respuesta;
    }
}
