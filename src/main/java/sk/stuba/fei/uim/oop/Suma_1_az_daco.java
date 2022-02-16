package sk.stuba.fei.uim.oop;


public class Suma_1_az_daco {

    public static void main(String[] parameter){

        int n = Integer.parseInt(parameter[0]);

        System.out.print("Výsledok je: ");
        System.out.println( n * (n+1) / 2 );

        System.out.println("mensie z cisel 1 a 3 je : " + Math.min(1,3));

        int o = 10;
        int p = 9;
        System.out.println(o > p);

        int[] myNum = {10, 20, 30, 40};
        System.out.println("myNum: "+ myNum[2]);

        int[] pole = new int[11];

        for(int y = 0 ; y < pole.length; y++){
            pole[y]=y;
        }
        for(int y = 0 ; y < pole.length; y++){
            System.out.print(pole[y]+" ");
        }
        System.out.println();
    }

}
