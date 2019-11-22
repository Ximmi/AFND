package afnd;

public class A2 {
    String cadena;
    int cont, lon, vuelta=1;
    String respuesta;
    
    public A2(String cadena){
        this.cadena=cadena;
        lon=cadena.length();
        if(analizar()==true){
            inicio();
        }
        else
        respuesta="No aceptada";
    }
    
    void inicio(){
        System.out.println("AFnD iniciado...");
        cont=0;
        B();
    }
    
    void B(){
        System.out.println("Estado B");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont<=lon-1){
            if(vuelta==1){
                C();
            }
            if(vuelta==2){
                A();
            }
            
        }
    }
    
    void A(){
        
        System.out.println("Estado A");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        if(cont==lon-1){
            System.out.println("La cadena pertenece al lenguaje (1A)");
            respuesta="La cadena pertenece al lenguaje (1A)";
        }
        if(cont<lon-1){
            cont++;
            A();
        }
    }
    
    void C(){
        System.out.println("Estado C");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        
        if(cont==lon-1){
            if(cadena.charAt(lon-1)=='0'){
                D();
            }
            if(cadena.charAt(lon-1)=='1'){
                vuelta=2;
                inicio();
            }
        }
        if(cont<lon-1){
            cont++;
            C();
            
        }
    }
    
    void D(){
        System.out.println("Estado D");
        System.out.println("cont = " + cont + "char=" + cadena.charAt(cont));
        System.out.println("La cadena pertenece al lenguaje (D)");
        respuesta="La cadena pertenece al lenguaje (D)";
    }
    boolean analizar(){
        boolean resultado=true;
        int i=0;
        while(resultado && i<lon){
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
