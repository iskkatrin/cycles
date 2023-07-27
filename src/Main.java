public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");


        for (int k = 1; k <= 10; k = k + 1) {
            System.out.println(k);
        }

        System.out.println("Задача 2");

        for (int k = 10; k <= 10 && k>=1; k = k - 1 ) {
            System.out.println(k);
        }


        System.out.println("Задача 3");


        for (int k = 0; k <= 17; k = k + 1)
           if (k % 2 ==0)
           {
                System.out.println(k);
            }


        System.out.println("Задача 4");

        for (int k = 10; k >= -10 && k<= 10; k = k - 1 ) {
            System.out.println(k);
        }

        System.out.println("Задача 5");

        for (int k = 1904; k <= 2096; k=k+4)
        {
            System.out.println(k + " Год являеется високосным ");
        }

        System.out.println("Задача 6");

        for (int k = 7; k <= 98; k=k+7)
        {
            System.out.println(k);
        }


        System.out.println("Задача 7");

        for (int k = 1; k <= 512; k=k*2)
        {
            System.out.println(k);
        }

        System.out.println("Задача 8");

        int accumulation = 29000 ;
        int total = 0;
        int i;
        for (int m = 0; m < 12; m++) {
            total = total + accumulation;
        }

        System.out.println( "Месяц " + "сумма накоплений равна " + total+ "рублей");



        System.out.println("Задача 9");


        int accumulation1 = 29000 ;
        int total1 = 0;
        int i1;
        for (int m1 = 0; m1 < 12; m1 ++) {
            total1 = total1 + total1/100;
            total1 = total1 + accumulation1;
        }

        System.out.println( "Месяц " + "сумма накоплений равна " + total1+ "рублей");


        System.out.println("Задача 10 ");

        int number = 2;
        for (int  v=1; v<=10; v++) {
            int result = number * v;

            System.out.println(number + "*" + v + "=" + result);
        }






    }
}