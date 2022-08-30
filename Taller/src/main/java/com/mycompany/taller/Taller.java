package com.mycompany.taller;
import java.util.Random;
import java.util.Scanner;
public class Taller {

    
    public Taller() {
    int numero, guess, guessNum = 0;
        int Intentos = 0;
        int acumulador = 0;
        String str, jugarotravez = "y";
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        numero = generator.nextInt(25) + 1;

        
        
        while (jugarotravez.equals("y") || jugarotravez.equals("Y")) {
            System.out.println(" Bienvenido al Jego de adivinacion indica un numero entre 1 y 25.");
            System.out.println("Ingrese un numero (0 para salir):");
            acumulador = Intentos + acumulador;
            guess = scan.nextInt();
            guessNum = 0;
            while (guess != 0)
            {
                guessNum++;
                if (guess == numero) {
                    System.out.println("Perfecto lo adivinaste!");
                    System.out.println("El numero de intentos realizados son :" + acumulador);
                    
                    break;
                } else if (guess < numero)
                    System.out.println("Opss! El numero indiacado es muy bajo, intenta con uno mas alto.");
                    
                    if (guess > numero)
                    System.out.println("Opps! El numero indicado es muy alto, intenta con un numero mas bajo.");
                    
                if (guessNum == Intentos) {
                    System.out.println("El numero era " + numero +"\n !Suerte la proxima¡");
                     System.out.println("El numero de intentos realizados son :" + acumulador);
                     
                    break;
                }
                System.out.println("Ingrese un numero (0 to quit):");
                guess = scan.nextInt();
            }
            System.out.println("Quieres jugar otra vez?(y/n)");
            jugarotravez = scan.next();
        }
        System.out.println("Gracias por jugar!");
        System.out.println("El numero de intentos realizados son :" + acumulador);
    }
           
    public static void main(String[] args) {
       Taller llamar = new Taller ();
       
       
      
}
}
