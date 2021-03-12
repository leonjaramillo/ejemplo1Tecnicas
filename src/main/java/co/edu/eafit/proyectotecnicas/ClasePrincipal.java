package co.edu.eafit.proyectotecnicas;

import java.util.Scanner;

public class ClasePrincipal {
    static final byte CONSTANTE = 24;
    static final long CONSTANTE_NUEVA = 28;
    
    public static void main (String[] args) {
        String nombre;
        int numero;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        numero = lector.nextInt();
        
        for (int i = 0; i < numero; i++) {
                if (i == 50 && CONSTANTE == 24) {
                    System.out.println("Cincuenta");
                    continue;
                }
                System.out.println(i);
        }
        System.out.println("Deme su nombre");
        lector.nextLine();
        nombre = lector.nextLine();
        System.out.println("Hola, " + nombre);
    }
    
}
