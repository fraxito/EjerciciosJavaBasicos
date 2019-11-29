package ejerciciosbasicosjava;

/**
 *
 * @author Jorge Cisneros
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        if (finDeSemana){
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
 
    public int multa (int velocidad, boolean birthday){
        if (birthday){ //si es mi cumple el guardia me quita 5 de velocidad
            velocidad -= 5;
        }
        if (velocidad <= 60){
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80){
            return 1;
        }
        return 2;  //el resto de casos, que son que voy a más de 80
    }
    
    public boolean muyVanidoso(int numero){
        if (numero % 11 == 0 || numero % 11 == 1){
            return true;
        }
        return false;
        
        // otra posible solución más corta: 
        // return (numero % 11 == 0 || numero % 11 == 1);
    }
    
    //ejercicio 04
    public boolean contesta ( boolean matinal, boolean madre, boolean dormido){
        if (dormido){
            return false;
        }
        if (matinal && madre){
            return true;
        }
        if (matinal){
            return false;
        }
        return true;
        
        /*   otra solución más corta
        if (dormido){
            return false;
        }
        if (matinal && !madre){
            return false;
        }
        return true;
        */
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println( ejercicios.fiestaArdillas(30, false) );
        System.out.println( ejercicios.fiestaArdillas(50, false) );
        System.out.println( ejercicios.fiestaArdillas(70, true) );
            //testeo el ejercicio 2
        System.out.println( ejercicios.multa(60, false) );
        System.out.println( ejercicios.multa(65, false) );
        System.out.println( ejercicios.multa(65, true) );
          // testeo el ejercicio 3
        System.out.println("muyVanidoso (22) " + ejercicios.muyVanidoso(22) );
        System.out.println("muyVanidoso (23) " + ejercicios.muyVanidoso(23) );
        System.out.println("muyVanidoso (24) " + ejercicios.muyVanidoso(24) );
    }
    
} 
