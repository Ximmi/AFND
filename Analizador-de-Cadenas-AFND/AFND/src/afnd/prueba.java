
package afnd;

import java.util.ArrayList;

public class prueba {
    String cadena;
    ArrayList<Character> array= new ArrayList<Character>();  
    int lon;
    prueba(String cadena){
        this.cadena=cadena;
        lon=cadena.length();
        if(analizar()==true){
            System.out.println("Cadena aceptada: "+ cadena);
        }
        else{
            System.out.println("Cadena no aceptada");
        }
    }
    
    boolean analizar(){
        boolean resultado=true;
        int i=1;
        if(cadena.charAt(0)!= 32){
            resultado=false;
        }
        else{
            while(resultado && i<lon){
                if(cadena.charAt(i)=='0' || cadena.charAt(i)=='1'){
                    i++;
                }
                else{
                    resultado=false;
                }
            }
        }
        
        return resultado;
    }
    
}
