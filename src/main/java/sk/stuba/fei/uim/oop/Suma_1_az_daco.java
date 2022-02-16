package sk.stuba.fei.uim.oop;


public class Suma_1_az_daco {

    public static void main(String[] parameter){

        int n = Integer.parseInt(parameter[0]);

        System.out.print("Výsledok je: ");
        System.out.println( n * (n+1) / 2 );

        System.out.println("mensie z cisel 1 a 3 je : " + Math.min(1,3));

        int x = 10;
        int y = 9;
        System.out.println(x > y);
    }

}
