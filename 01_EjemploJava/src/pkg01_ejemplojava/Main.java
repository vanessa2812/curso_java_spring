
package pkg01_ejemplojava;

public class Main {

   
    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true;
        if (3 < 5) {
            if (condicion || false){
            System.out.println("Es verdadero");
        }
        }else if (5 < 7) {
            System.out.println("No se ejecuta");
        }else if (8 <9) {
            System.out.println("No se ejecuta");
        } else {
            System.out.println("Cualquier otro caso");
                 }
        char letra = 'A';
        switch (letra){
            case 'A':
                System.out.println("Aaaaaa");
                break;
            case 'B':
                System.out.println("Bbbbb");
                break;
            case 'C':
                System.out.println("Cccccc");
                break;
                
                    }
        
    String formateado = nombreApell("Vanessa","Esteban Alvarez");
    System.out.println(formateado);
    
    Tucan  miPajaro = null;
    miPajaro = new Tucan();
    miPajaro.longitud = 20.5f;
    System.out.println("Long tucan:"
        + miPajaro.longitud);
    
    Tucan otropajaro = null;//reserva memoria y
    //devuelve direccion de memoria
    //otropajaro.longitud = 30.9f;
    // da error porque tiene valor null y aun no hemos
    //reservadi memoria
    otropajaro = new Tucan();
            
    otropajaro.longitud = 30.9f;
    
    System.out.println("Mi tucan:"
        + miPajaro.longitud);
    System.out.println("Otro tucan:"
        + otropajaro.longitud);
    
    otropajaro = miPajaro;
    
    System.out.println("Otro tucan:"
        + otropajaro.longitud);
    miPajaro.longitud = 67.6f;
    System.out.println("Otro tucan:"
        + otropajaro.longitud);
    otropajaro.edad =11;
    System.out.println("edad tucan:"
        + miPajaro.edad);
    
    otropajaro.piar();
    miPajaro.piar();
    
    Tucan nuevoTuc = new Tucan();
    
    System.out.println("Nuevo tucan:"
        + nuevoTuc.longitud);
            
        
} 
    static String nombreApell(String nombre, String apellidos) {
            return apellidos + "," + nombre;
        
    }
}

