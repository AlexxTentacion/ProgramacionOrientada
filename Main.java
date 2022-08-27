import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

float PrimerN;
float SegundoN;
char action;
float resp;

System.out.println("Ingrese el primer numero/s");
PrimerN = Integer.parseInt(entrada.readLine());

        System.out.println("Ingrese el segundo numero/s");
        SegundoN = Integer.parseInt(entrada.readLine());

        System.out.println("Ingrese la operacion a realizar: +, -, *, /");
        action = (char) System.in.read();

        switch (action) {
            case '+' -> {
                resp = PrimerN + SegundoN;
                break;
            }
            case '-' -> {
                resp = PrimerN - SegundoN;
                break;
            }
            case '*' -> {
                resp = PrimerN * SegundoN;
                break;
            }
            case '/' -> {
                resp = PrimerN % SegundoN;
                break;
            }
            default -> {
                System.out.println("Incorrecto!!, eso no es una operacion");
                return;
            }
        }
        System.out.println("Resultados:");
        System.out.println(PrimerN + "" + action + "" + SegundoN + "=" + resp);
    }
}