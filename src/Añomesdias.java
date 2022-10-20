public class Añomesdias {

    public static void main(String[] args) {

        int meses, años, dias = Integer.parseInt(args[0]);

        System.out.print(args[0] + " dias ");
        años = dias / 365;

        dias = dias % 365;

        meses = dias / 30;

        dias = dias % 30;

        System.out.println("equivalen a " + años + " año, " +
                meses + " meses y " + dias + " dias.");}

    }
