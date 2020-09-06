import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dias = teclado.nextInt();

        int anos = dias / 365;
        dias = dias % 365;

        int meses = dias / 30;
        dias = dias % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(s)");
        System.out.println(dias + " dia(s)");


        teclado.close();
    }
}
