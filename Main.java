import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int a = 100; //boleto adulto
        int n = 70; //boleto niño
        int i = 50; //adulto mayor con credencial del INAPAM
        int b = 70; //adulto mayor sin credencial del INAPAM
        char opcion;
        char tipos;

        System.out.println("Bienvenido!!, Seleccione el tipo de boleto correspondiente.");

        do{
            System.out.println("a = adulto, n = niño, i = Adulto mayor con (credencial del INAPAM), b = Adulto mayor");

            tipos = entrada.next().charAt(0);
            switch (tipos){
                case 'a' -> {
                    System.out.println("El boleto cuesta $ " + a);
                    break;
                }
                case 'n' -> {
                    System.out.println("El boleto cuesta $ " + n);
                    break;
                }
                case 'i' -> {
                    System.out.println("El boleto cuesta $ " + i);
                    break;
                }
                case 'b' -> {
                    System.out.println("El boleto cuesta $ " + b);
                    break;
                }
            }
            System.out.println("Otro boleto? (S/N)");
            opcion =entrada.next().charAt(0);
        }while(opcion == 's');
        System.out.println("Compra hecha!");

    }


}

