import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int tamano;

        System.out.println("Selecciona el tamaño de la piramide 1 = Chico, 2 = Mediano, 3 = Grande");
        tamano = Integer.parseInt(entrada.readLine());


        switch (tamano) {
            case 1 -> {
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
            }
            case 2 -> {
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
            }
            case 3 -> {
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
                System.out.println("*******");
                System.out.println("********");
                System.out.println("*********");
                System.out.println("**********");
                System.out.println("***********");
                System.out.println("************");
            }
            default -> System.out.println("Eso no es un tamaño");

        }
         }
      }

