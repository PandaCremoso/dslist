import java.util.Scanner;

public class Idadexxx {
    public static int anos = 0;

    public static void main(String args[]) {

        Scanner inputdados = new Scanner(System.in);
        String inputvalidate = "";
        boolean flag;
        String validateanos = "";
        boolean flaganos;

        System.out.print("Quantos anos vc tem?: ");
        do {
            inputvalidate = inputdados.nextLine();
            flag = validatestring(inputvalidate);
            if (!flag)
                System.out.println("Não é um numero valido.");
        } while (!flag);

        anos = Integer.parseInt(inputvalidate);

        System.out.print("Em que ano estamos?: ");
        do {
            validateanos = inputdados.nextLine();
            flaganos = validatestring(validateanos);

            if (!flaganos)
                System.out.println("Não é um numero valido.");

        } while (!flaganos);

        int anonasc = Integer.parseInt(validateanos);

        int anostotal = (anonasc) - (anos);

        System.out.println("Você nasceu em : " + anostotal);
    }

    private static boolean validatestring(String inputvalidate) {
        if (inputvalidate.isEmpty()) {

            return false;

        }

        int lenght = inputvalidate.length();
        for (int i = 0; i < lenght; i++) {
            if ((Character.isDigit(inputvalidate.charAt(i)) == false)) {
                return false;
            }
        }
        return true;

    }

}
