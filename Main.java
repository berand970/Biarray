
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand= new Random();
            int numrand,suma1=0,suma2=0, resta=0;
      System.out.println("ingrese el tamaño del arreglo");
        int tamano=leer.nextInt();
        int numeros[][]= new int[tamano][tamano];
        for(int Fila=0; Fila<numeros.length;Fila++){
            for(int columna=0; columna<numeros.length;columna++){
              numrand=rand.nextInt(90)+10;
               numeros[Fila][columna]=numrand;
                System.out.print(numeros[Fila][columna]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nSuma primaria");
        for(int i=0; i<numeros.length;i++){
            System.out.print(numeros[i][i]+" ");
            
            suma1+=numeros[i][i];
            
        }
        System.out.println(" = "+suma1);
        System.out.println("\nSuma secundaria");
        for(int i=0; i<numeros.length;i++){
            resta=numeros.length-i-1;
            System.out.print(numeros[i][resta]+" ");
            
            suma2+=numeros[i][resta];
            
        }
        System.out.println(" = "+suma2);
    }
    
}