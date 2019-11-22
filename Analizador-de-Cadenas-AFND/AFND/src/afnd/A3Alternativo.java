package afnd;


public class A3Alternativo {
    String respuesta, cadena;
    public String getRespuesta() {
        return respuesta;
    }
    int cont, longi, vuelta=1;
    boolean fin=false;
    
    A3Alternativo(String cadena){
        this.cadena=cadena;
        longi=cadena.length()-1;
        System.out.println("Longi="+ longi);
        if(analizar()==true){
            inicio();
        }
        else
        respuesta="No aceptada";
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
    
    void inicio(){
        int actual=0;
        while(fin==false){
            if(cont>longi){
                fin=true;
                break;
            }
            if(actual==0){
                if(cadena.charAt(cont)=='0')
                    actual=2;
                if(cadena.charAt(cont)=='1')
                    actual=1;
                cont++;
                continue;
            }
            if(actual==1){
                if(cadena.charAt(cont)=='1')
                    actual=1;
                if(cadena.charAt(cont)=='0')
                    actual=2;
                cont++;
                continue;
            }
            if(actual==2){
                if(cadena.charAt(cont)=='1')
                    actual=2;
                if(cadena.charAt(cont)=='0')
                    actual=1;
                cont++;
                continue;
            }
        
        }
        if(actual==1){
            System.out.println("La cadena forma parte de la expresión");
            respuesta="La cadena pertenece al lenguaje q1";
        }
        else{
            System.out.println("La cadena no pertenece al lenguaje");
            inicio2();
        }
    }
    
    void inicio2(){
        cont=0;
        int actual=0;
        boolean fin1=false;
        System.out.println("Inicio 2...");
        while(fin1==false){
            if(cont>longi){
                fin1=true;
                break;
            }
            if(actual==0){
                if(cadena.charAt(cont)=='0')
                    actual=3;
                if(cadena.charAt(cont)=='1')
                    actual=4;
                cont++;
                continue;
            }
            if(actual==3){
                if(cadena.charAt(cont)=='0')
                    actual=3;
                if(cadena.charAt(cont)=='1')
                    actual=4;
                cont++;
                continue;
            }
            if(actual==4){
                if(cadena.charAt(cont)=='0')
                    actual=4;
                if(cadena.charAt(cont)=='1')
                    actual=3;
                cont++;
                continue;
            }
        
        }
        System.out.println("actual: " + actual);
        if(actual==3){
            System.out.println("La cadena pertenece al lenguaje");
            respuesta="La cadena pertenece al lenguaje q3";
        }
        else{
            System.out.println("La cadena no forma parte de la expresión");
            respuesta="La cadena no pertenece al lenguaje";
        }
    }
}
