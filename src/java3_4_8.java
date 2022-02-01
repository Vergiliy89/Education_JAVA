public class java3_4_8 {
    public static void main(String args[]) {
        int m = 5;
        double sum = 0;
        double res;
        for (int i = 1; i <= m; i++) {
            res = (int)(Math.random()*(5-2+1)+9);
            sum = sum + res;
            System.out.println("Результат " + i + " = " + res);

        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее время заплыва для каждого из трех классов = " + sum/3 + " мин");

    }
    }


